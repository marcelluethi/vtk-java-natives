package vtkjava;

import static vtkjava.VtkNativeLibraries.MAJOR_VERSION;
import static vtkjava.VtkNativeLibraries.MINOR_VERSION;
import vtkjava.InitializationMode.*;
import vtk.*;




class Main {
    public static void main(String[] args) {
        System.out.println("vtk-native version: " + MAJOR_VERSION + "." + MINOR_VERSION);
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Current platform: " + Platform.getPlatform());
        if (Platform.isUnknown()) {
            exitWithError("Cannot determine the platform you are running on.");
        }

        try {
            VtkNativeLibraries.initialize(InitializationMode.WARN_VERBOSE);            
            System.out.println("Initialization done, ");
        } catch (Throwable t) {
            System.err.println("Initialization failed with " + t.getClass().getSimpleName() + ", stacktrace follows.");
            t.printStackTrace(System.err);
            System.err.println("stacktrace above.");
            System.exit(1);
        }
    }

    private static void exitWithError(String... msgs) {
        for (String msg : msgs) {
            System.err.println(msg);
        }
        System.exit(1);
    }

}
