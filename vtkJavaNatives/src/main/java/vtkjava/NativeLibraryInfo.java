package vtkjava;

/*
 * Copyright 2016 University of Basel, Graphics and Vision Research Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.File;
import java.net.URL;

public class NativeLibraryInfo {
	private final String baseName;
	private String nativeName;
	private URL sourceUrl;
	private File targetFile;
	
	protected NativeLibraryInfo(String baseName) {
		this.baseName = baseName;
	}

	/**
	 * Returns the library's base name, (e.g., "jhdf5") <b>without</b> OS- or architecture-specific prefixes or suffixes/file extensions.
	 * @return the base name of the library in question.
	 */
	public String getBaseName() {
		return baseName;
	}
	
	
	/**
	 * Returns the library's native (file) name, (e.g., "libjhdf5.so") <b>including</b> OS- or architecture-specific prefixes or suffixes/file extensions.
	 * @return the native filename of the library in question.
	 */
	public String getNativeName() {
		return nativeName;
	}

	protected void setNativeName(String nativeName) {
		if (this.nativeName != null && !this.nativeName.equals(nativeName)) {
			throw new IllegalStateException("This property can only be set once.");
		}
		this.nativeName = nativeName;
	}

	
	/**
	 * Returns the source URL where the concrete library file was extracted from. This will normally be a path inside the jar file containing the library.
	 * @return the source URL of the library in question.
	 */
	public URL getSourceUrl() {
		return sourceUrl;
	}

	protected void setSourceUrl(URL sourceUrl) {
		if (this.sourceUrl != null && !this.sourceUrl.equals(sourceUrl)) {
			throw new IllegalStateException("This property can only be set once.");
		}
		this.sourceUrl = sourceUrl;
	}

	/**
	 * Returns the target file that the concrete library file was extracted to. This will normally be a path to a physical file inside a temporary directory.
	 * @return the physical file of the library in question.
	 */
	public File getTargetFile() {
		return targetFile;
	}

	protected void setTargetFile(File targetFile) {
		if (this.targetFile != null && !this.targetFile.equals(targetFile)) {
			throw new IllegalStateException("This property can only be set once.");
		}
		this.targetFile = targetFile;
	}

}
