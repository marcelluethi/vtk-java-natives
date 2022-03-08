package vtkjava;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.awt.*;

/**
  * This abstract class provides a public interface that needs to be 
  * implemented for modules targeting specific platforms. Besides the interface, 
  * it contains helper methods 
  *
  *  (TODO maybe it could be refactored, such that it becomes a pure interface)
  */
public abstract class VtkNativeLibrariesImpl {

	/* caches initialization state. The field "exception" contains
	 * the exception that occurred during initialization, or <tt>null</tt>
	 * if the initialization was successful. If the initialization state
	 * is not known at all (=when no initialization was attempted), then
	 * the initializationResult <i>field</i> of the containing class
	 * will be <tt>null</tt>
	 */
	public static class InitializationResult {
		private final VtkJavaNativeLibraryException exception;
		public int refCount = 1;
		public boolean isSuccess() {
			return exception == null;
		}
		private InitializationResult() {
			this(null);
		}
		private InitializationResult(Throwable throwable) {
			exception = VtkJavaNativeLibraryException.wrap(throwable);
		}
		public VtkJavaNativeLibraryException getException() {
			return exception;
		}
	}

	private final List<String> _platforms;
	private final List<NativeLibraryInfo> _libraries;
	private InitializationResult _initializationResult = null;

	public abstract String getName();

	public abstract String getVersion();

	protected abstract void getLibraryNamesInto(List<String> list);

	protected abstract void getSupportedPlatformsInto(List<String> list);

	public boolean isLoadByDefault() {
		return true;
	}

	/**
	 * This callback method is called once for every Library bundle, before
	 * extracting the libraries.
	 *
	 * @throws VtkJavaNativeLibraryException
	 *             if anything goes seriously wrong
	 */
	protected void onInitializeStart() throws VtkJavaNativeLibraryException {
		// // Loads mawt.so
		Toolkit.getDefaultToolkit();
		// // Loads jawt.so - this seems to be required on some systems
		try {
			System.loadLibrary("jawt");
		} catch (UnsatisfiedLinkError ignored) {
		}
	}

	/**
	 * This callback method is called once for every library, right after it was
	 * extracted to a file, but before it is (possibly) loaded as a library.
	 * Whether an attempt to directly load it as a native library is determined
	 * by the return value of this method (the default is true unless
	 * overridden by subclasses).
	 *
	 * @param info
	 *            a fully initialized {@link NativeLibraryInfo} instance containing all relevant information
	 *            about the library which has just been extracted.
	 * @return true if the library is to be loaded (using
	 *         {@link Runtime#load(String)}), false if the library
	 *         bundle will take care of the appropriate actions itself.
	 * @throws VtkJavaNativeLibraryException
	 */
	protected boolean onLibraryExtracted(NativeLibraryInfo info)
			throws VtkJavaNativeLibraryException {
		return true;
	}

	/**
	 * This callback method is called once for every library, right after it was
	 * loaded as a library.
	 *
	 * @param info
	 *            a fully initialized {@link NativeLibraryInfo} instance containing all relevant information
	 *            about the library which has just been extracted.
	 */
	protected void onLibraryLoaded(NativeLibraryInfo info) {

	}

	/**
	 * This callback method is called once for every library bundle, after all
	 * libraries have been extracted.
	 *
	 * @throws VtkJavaNativeLibraryException
	 *             if anything goes seriously wrong
	 */
	protected void onInitializeEnd() throws VtkJavaNativeLibraryException {
	}

	public Runnable getVerifierRunnable() {
		return null;
	}

	public final String getId() {
		String pkg = getClass().getPackage().getName();
		return pkg.substring(pkg.lastIndexOf('.') + 1);
	}

	public final List<String> getSupportedPlatforms() {
		return _platforms;
	}

	protected final List<NativeLibraryInfo> getLibraries() {
		return _libraries;
	}

	protected VtkNativeLibrariesImpl() {
		List<String> list = new ArrayList<String>();
		getSupportedPlatformsInto(list);

		Collections.sort(list);

		_platforms = Collections.unmodifiableList(list);

		list = new LinkedList<String>();
		getLibraryNamesInto(list);
		_libraries = Collections.unmodifiableList(instantiateInfoObjects(list));
	}

	private List<NativeLibraryInfo> instantiateInfoObjects(List<String> names) {
		List<NativeLibraryInfo> infos = new ArrayList<NativeLibraryInfo>(
				names.size());
		for (String name : names) {
			infos.add(new NativeLibraryInfo(name));
		}
		return infos;
	}

	public final boolean isPlatformSupported(String platform) {
		return Collections.binarySearch(_platforms, platform) >= 0;
	}

	public final String toString() {
		return getId() + " (" + getName() + " " + getVersion() + ")";
	}

	public final synchronized InitializationResult initialize(File baseDir) {
		if (_initializationResult != null) {
			_initializationResult.refCount += 1;
			return _initializationResult;
		}

		try {
			onInitializeStart();
			File target = Util.createNativeDirectory(getId(), baseDir);
			determineUrls(Platform.getPlatform());			
			createFiles(target);
			loadLibraries();
			onInitializeEnd();
			_initializationResult = new InitializationResult();
		} catch (Throwable error) {
			_initializationResult = new InitializationResult(error);
		}
		return _initializationResult;
	}

	private void determineUrls(String platform)
			throws VtkJavaNativeLibraryException {
		for (NativeLibraryInfo info : _libraries) {
			info.setNativeName(mapToResourceName(info.getBaseName()));
			URL url = this.getClass().getResource(info.getNativeName());
			if (url == null) {
				throw new VtkJavaNativeLibraryException("Unable to load resource "
						+ info.getNativeName() + " for platform " + Platform.getPlatform());
			}

			info.setSourceUrl(url);
		}
	}

	private void createFiles(File directory) throws VtkJavaNativeLibraryException {
		for (NativeLibraryInfo info : _libraries) {
			String name = info.getSourceUrl().getFile();
			File file = new File(directory, name.substring(
					name.lastIndexOf('/') + 1, name.length()));
					
			try {
				Util.copyUrlToFile(info.getSourceUrl(), file);
				info.setTargetFile(file);
			} catch (IOException io) {
				throw new VtkJavaNativeLibraryException("Unable to copy "
						+ info.getSourceUrl() + " to " + file, io);
			}
		}
	}

	private void loadLibraries() throws VtkJavaNativeLibraryException {
		for (NativeLibraryInfo info : _libraries) {
			try {
				if (onLibraryExtracted(info)) {
					String path = info.getTargetFile().getAbsolutePath();
					Runtime.getRuntime().load(path);
					onLibraryLoaded(info);
				}
			} catch (Throwable t) {
				t.printStackTrace();
				throw new VtkJavaNativeLibraryException(
						"Unable to load native library file "
								+ info.getTargetFile(), t);
			}
		}
	}

	protected abstract String mapToResourceName(String baseName);
}
