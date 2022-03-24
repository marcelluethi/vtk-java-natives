package ch.unibas.cs.gravis.vtkjavanativelibs;

import java.net.URL;
import java.util.List;

/**
  * This public interface that needs to be
  * implemented for modules targeting specific platforms.
  */
public interface  VtkNativeLibrariesImpl {

	/**
	 * Returns a list or URLs. The URLs are resources (the libraries) in the corresponding
	 * resource directory of the implementing module.
	 *
	 * Note that the libraries need to be provided such that their mutual dependencies
	 * are satisfied, as otherwise loading the libraries will fail. To find out the right
	 * order, use the python script vtklibrarydependency.py
	 *
	 * @return a list of URLs to the libraries
	 */
	List<URL> getVtkLibraries();


	List<URL> getJoglLibraries();

	/**
	 * A list of supported platforms
	 */
	List<String> getSupportedPlatforms();

}
