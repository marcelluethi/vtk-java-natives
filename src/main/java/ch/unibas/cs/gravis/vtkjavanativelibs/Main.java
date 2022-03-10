package ch.unibas.cs.gravis.vtkjavanativelibs;

import vtk.vtkPanel;

import java.io.File;

import static ch.unibas.cs.gravis.vtkjavanativelibs.VtkNativeLibraries.MAJOR_VERSION;
import static ch.unibas.cs.gravis.vtkjavanativelibs.VtkNativeLibraries.MINOR_VERSION;


class Main {
    public static void main(String[] args) {
        System.out.println("vtk-native version: " + MAJOR_VERSION + "." + MINOR_VERSION);
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Current platform: " + Platform.getPlatform());
        if (Platform.isUnknown()) {
            exitWithError("Cannot determine the platform you are running on.");
        }

        File nativeDir = new File(System.getProperty("user.home") + File.separator +".nativelibs");
        try {
            VtkNativeLibraries.initialize(nativeDir);
            System.out.println("Initialization done, ");
        } catch (Throwable t) {
            System.err.println("Initialization failed with " + t.getClass().getSimpleName() + ", stacktrace follows.");
            t.printStackTrace(System.err);
            System.err.println("stacktrace above.");
            System.exit(1);
        }

        try {
            System.out.println(new vtk.vtkVersion().GetVTKVersion());
        } catch (Throwable t) {
            System.out.println("Could not invoke vtk Methode" +t.getMessage());
            t.printStackTrace();
        }
    }

    private static void exitWithError(String... msgs) {
        for (String msg : msgs) {
            System.err.println(msg);
        }
        System.exit(1);
    }

}
