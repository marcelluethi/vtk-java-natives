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

package ch.unibas.cs.gravis.vtkjavanativelibs;

import com.jogamp.common.jvm.JNILibLoaderBase;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ServiceLoader;


public class VtkNativeLibraries {
    /**
     * VERSION INFORMATION
     * ===================
     */
    public static final int MAJOR_VERSION = 0;
    public static final int MINOR_VERSION = 1;


    /**
     * Initialize native library bundles.
     *
     * @throws VtkJavaNativeLibraryException if anything goes wrong.
     */
    public static void initialize(File nativeLibraryBaseDirectory) throws VtkJavaNativeLibraryException {

        File nativeLibraryDir = Util.createNativeDirectory(nativeLibraryBaseDirectory);

        String platform = Platform.getPlatform();

        VtkNativeLibrariesImpl impl = loadImplementation(platform);

        if (!impl.getSupportedPlatforms().contains(platform)) {
            throw new VtkJavaNativeLibraryException("VtkNativeLibraries does not support platform "
                    + platform);
        }

        // // Loads mawt.so
        Toolkit.getDefaultToolkit();
        // // Loads jawt.so - this seems to be required on some systems
        try {
            System.loadLibrary("jawt");
        } catch (UnsatisfiedLinkError ignored) {
        }

        for (URL libraryUrl : impl.getJoglLibraries()) {
            String nativeName = libraryUrl.getFile();
            File file = new File(nativeLibraryDir, nativeName.substring(nativeName.lastIndexOf('/') + 1, nativeName.length()));
            try {
                Util.copyUrlToFile(libraryUrl, file);
            } catch (IOException e) {
                throw new VtkJavaNativeLibraryException("Error while copying library " + nativeName, e);
            }

            Runtime.getRuntime().load(file.getAbsolutePath());

            // we register the library as loaded in jogl, as otherwise it will try to load it again.
            String joglName =  getBasename(file);
            if (joglName.startsWith("lib")) {
                joglName = joglName.replace("lib", "" );
            }
            JNILibLoaderBase.addLoaded(joglName);

            Runtime.getRuntime().load(file.getAbsolutePath());
        }

        for (URL libraryUrl : impl.getVtkLibraries()) {
            String nativeName = libraryUrl.getFile();
            File file = new File(nativeLibraryDir, nativeName.substring(nativeName.lastIndexOf('/') + 1, nativeName.length()));
            try {
                Util.copyUrlToFile(libraryUrl, file);
            } catch (IOException e) {
                throw new VtkJavaNativeLibraryException("Error while copying library " + nativeName, e);
            }

            Runtime.getRuntime().load(file.getAbsolutePath());
        }
    }


    private static String getBasename(File file) {
        String filename = file.getName().toString();
        String[] tokens = filename.split("\\.(?=[^\\.]+$)");
        return tokens[0];
    }

    private static VtkNativeLibrariesImpl loadImplementation(String platform) throws VtkJavaNativeLibraryException {
        ServiceLoader<VtkNativeLibrariesImpl> implLoader = ServiceLoader.load(VtkNativeLibrariesImpl.class);
        for (VtkNativeLibrariesImpl impl : implLoader) {
            if (impl.getSupportedPlatforms().contains(platform)) {
                return impl;
            }
        }
        // If we are still here, no module was found
        throw new VtkJavaNativeLibraryException("Could not load implementation for platform " + platform);

    }


}
