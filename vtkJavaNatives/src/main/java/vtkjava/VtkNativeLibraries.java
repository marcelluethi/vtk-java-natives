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

package vtkjava;

import java.io.File;
import java.util.ServiceLoader;

import vtkjava.VtkNativeLibrariesImpl.InitializationResult;

public class VtkNativeLibraries {
    /**
     * VERSION INFORMATION
     * ===================
     */
    public static final int MAJOR_VERSION = 0;
    public static final int MINOR_VERSION = 1;

    private static File baseDirectory = null;

    /**
     * Initialize native library bundles.
     *
     * @param mode      initialization mode
     * @throws VtkJavaNativeLibraryException if anything goes wrong.
     */
    public static void initialize(InitializationMode mode) throws VtkJavaNativeLibraryException {

        /*
         * On Linux, we sometimes have the dreaded
         * "[xcb] Most likely this is a multi-threaded client and XInitThreads has not been called"
         * crash,
         * which occurs during shutdown. It's essentially harmless, but will clutter the
         * /tmp directory over time. So if on Linux, we try to clean
         * up immediately.
         */
        boolean linux = Platform.isLinux();

        String platform = Platform.getPlatform();
        
        VtkNativeLibrariesImpl impl = loadImplementation(platform);
        

        if (! impl.isPlatformSupported(platform)) {
            String msg = "VtkNativeLibraries does not support platform "
                    + platform;
            switch (mode) {
                case SILENT:
                    ;
                case WARN_ON_FAIL:
                case WARN_VERBOSE:
                    System.err.println("WARNING: " + msg);
                    break;
                case THROW_EXCEPTION_ON_FAIL:
                    throw new VtkJavaNativeLibraryException(msg);
                case TERMINATE_ON_FAIL:
                    System.err.println(msg);
                    System.exit(1);
                case TERMINATE_VERBOSE:
                    System.err.println(msg);
                    System.exit(1);                                    
            }
        }
        try {
            boolean verbose = (mode == InitializationMode.TERMINATE_VERBOSE || mode == InitializationMode.WARN_VERBOSE);
            setupBaseDirectoryIfNeeded();
            if (verbose) {
                System.out.println("initializing");
            }

            InitializationResult r = impl.initialize(baseDirectory);
            if (r.isSuccess()) {
                if (r.refCount == 1) {
                    if (verbose) {
                        System.out.println("initialized.");
                    }
                    Runnable verify = impl.getVerifierRunnable();
                    if (verify != null && (verbose || linux)) {
                        try {
                            verify.run();
                            if (verbose) {
                                System.out.println("verified, seems to work.");
                            }
                        } catch (Throwable t) {
                            throw new IllegalStateException("failed verification, it probably does not work.", t);
                        }
                    }
                } else if (verbose) {
                    System.out.println("skipped, was already initialized");
                }
            } else {
                throw r.getException();
            }
        } catch (Throwable t) {
            VtkJavaNativeLibraryException ex = VtkJavaNativeLibraryException.wrap(t);
            switch (mode) {
                case TERMINATE_ON_FAIL:
                case TERMINATE_VERBOSE:
                    ex.printStackTrace();
                    System.exit(1);
                case THROW_EXCEPTION_ON_FAIL:
                    throw ex;
                case WARN_ON_FAIL:
                case WARN_VERBOSE:
                    ex.printStackTrace();
                    break;
                case SILENT:
                    /* do nothing */
            }
        }

        
    }

    private static synchronized void setupBaseDirectoryIfNeeded()
            throws VtkJavaNativeLibraryException {
        if (baseDirectory == null) {
            baseDirectory = Util.createNativeDirectory("vtk_natives", null);
        }
    }


    private static VtkNativeLibrariesImpl loadImplementation(String platform) throws VtkJavaNativeLibraryException {
        ServiceLoader<VtkNativeLibrariesImpl> implLoader = ServiceLoader.load(VtkNativeLibrariesImpl.class);
        for (VtkNativeLibrariesImpl impl :  implLoader) {
            if (impl.getSupportedPlatforms().contains(platform)) {
                return impl;
            }
        }
        // If we are still here, no module was found
        throw new VtkJavaNativeLibraryException("Could not load implmentation for platform " +platform);
        
    }

 
}
