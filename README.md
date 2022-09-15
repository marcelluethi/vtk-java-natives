# VTK-JAVA-Natives

This library makes it easy to access [vtk](www.vtk.org) from java.
It automatically extracts and loads all the required native libraries through maven artifacts.

## Add VTK to your Java project

```xml
<dependency>
	<groupId>ch.unibas.cs.gravis</groupId>
	<artifactId>vtkjavanativesall</artifactId>
	<version>0.1.1</version>
</dependency>
```
This brings VTK 9.1 libraries for Windows, Linux and macOS+Intel (M1 will come later). It also brings JOGL and Glugen 2.4-rc4.

Unpacking and loading native libraries requires this line at the beginning of a program :

```java
VtkNativeLibraries.initialize(new File(System.getProperty("java.io.tmpdir")));
```

Using a temporary directory is not compulsory, this is just an example.

An example of how this library can be used is given in ```Main.java```, which is located
in the `src` directory.


## Build this project

### Structure

The project is divided in the following modules:

* The logic for initialization and loading the libraries can be found in `vtkJavaNatvies`
* `vtkJar` is a dummy module, whose purpose is to manage `vtk.jar` as a dependency
* The modules `vtkJavaNativesPLATFORMImpl` are platform specific packages, which contain all the
  native libraries for the corresponding platform in the resource folder.

### Build project

```
sbt run
```

### Add more platform build

The binaries in this project are listed [here](https://github.com/jzy3d/vtk-java-wrapper).
