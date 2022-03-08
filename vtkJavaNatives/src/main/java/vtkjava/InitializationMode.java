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


/* Implementation note: this class is defined both in the stub and implementation projects,
 * which means that care must be taken to synchronize both in case of changes.
 */
package vtkjava;

/**
 * Controls behavior on initialization. Stick to TERMINATE_ON_FAIL unless you have good
 * reasons to do otherwise.
 */
public enum InitializationMode {
    /**
     * If a bundle is not available on the target platform, print a stack trace
     * and terminate the program. This is the most strict, and recommended, argument.
     */
    TERMINATE_ON_FAIL,
    /**
     * Like TERMINATE_ON_FAIL, but in addition print the loaded bundles to
     * System.out. NOT RECOMMENDED for production.
     */
    TERMINATE_VERBOSE,
    /**
     * Throw an exception if a bundle is not available on the target
     * platform, or fails to initialize. This is less strict than TERMINATE_ON_FAIL,
     * and is recommended if you implement your own error handling.
     */
    THROW_EXCEPTION_ON_FAIL,
    /**
     * Print a warning to System.err if a bundle is not available on the
     * target platform, or fails to initialize properly. NOT RECOMMENDED.
     */
    WARN_ON_FAIL,
    /**
     * Like WARN_ON_FAIL, but in addition print the loaded bundles to
     * System.out. NOT RECOMMENDED for production.
     */
    WARN_VERBOSE,
    /**
     * Silently ignore bundles which are not available on the target
     * platform, or which fail to load properly. NOT RECOMMENDED, EVER.
     */
    SILENT,
}

