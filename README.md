# VTK-JAVA-Natives

This library makes it easy to access [vtk](www.vtk.org) from java. 
It automatically extracts and loads all the required native libraries. 

##### Usage
An example of how this library can be used is given in ```Main.java```, which is located
in the `src` directory. 


##### Structure

The project is divided in the following modules:

* The logic for initialization and loading the libraries can be found in `vtkJavaNatvies`
* `vtkJar` is a dummy module, whose purpose is to manage `vtk.jar` as a dependency
* The modules `vtkJavaNativesPLATFORMImpl` are platform specific packages, which contain all the 
  native libraries for the corresponding platform in the resource folder. 

