ThisBuild / organization := "ch.unibas.cs.gravis"
ThisBuild / version      := "0.0.1-SNAPSHOT"
ThisBuild / crossPaths := false
ThisBuild / autoScalaLibrary := false
ThisBuild / javacOptions ++= Seq("--release", "8") 
ThisBuild / versionScheme := Some("semver-spec")
ThisBuild / homepage :=  Some(url("https://scalismo.org"))
ThisBuild / licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
ThisBuild / scmInfo := Some(
      ScmInfo(url("https://github.com/unibas-gravis/vtk-java-natives"), "git@github.com:unibas-gravis/vtk-java-natives.git")
    )
ThisBuild / developers := List(
      Developer("marcelluethi", "marcelluethi", "marcel.luethi@unibas.ch", url("https://github.com/marcelluethi"))
    )
ThisBuild / publishMavenStyle := true
ThisBuild / publishTo := Some(Opts.resolver.sonatypeSnapshots)
ThisBuild / resolvers    := Seq(
    "sonatype-release" at "https://oss.sonatype.org/content/repositories/releases",
    "jzy3d-release" at "https://maven.jzy3d.org/releases",
    "jzy3d-snapshots" at "https://maven.jzy3d.org/shapshots"
)

/*
 * dummy package to manage vtk.jar
 */   
lazy val vtkJar = (project in file("vtkJar"))
    .settings(
        name := "vtkJar",
        Compile / packageBin := baseDirectory.value / "lib"/ "vtk-9.1.0.jar"
    )

/*
 * Module definition and library loading logic. Does not contain any native libraries
 */
lazy val vtkJavaNatives = (project in file("vtkJavaNatives"))
    .settings(
        libraryDependencies ++= Seq(
            "org.jogamp.jogl" % "jogl-all" % "v2.4.0-rc4",    
            "org.jogamp.gluegen" % "gluegen-rt" % "v2.4.0-rc4"        
        )
    )
    

/*
 *  Package with native libraries for win64
 */ 
lazy val vtkJavaNativesWin64Impl = (project in file("vtkJavaNativesWin64Impl"))
    .dependsOn(vtkJavaNatives, vtkJar)
    .settings(
        libraryDependencies ++= Seq(
            "com.google.auto.service" % "auto-service" % "1.0.1",    
            "org.jogamp.gluegen" % "gluegen-rt-natives-windows-amd64" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-windows-i586" % "v2.4.0-rc4",
            "org.jogamp.jogl" % "jogl-all-natives-windows-amd64" % "v2.4.0-rc4",
            "org.jogamp.jogl" % "jogl-all-natives-windows-i586" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-windows-amd64" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-windows-i586" % "v2.4.0-rc4"
        )
    )


/*
 *  Package with native libraries for win64
 */ 
lazy val vtkJavaNativesLinuxImpl = (project in file("vtkJavaNativesLinuxImpl"))
    .dependsOn(vtkJavaNatives, vtkJar)
    .settings(
        libraryDependencies ++= Seq(
            "com.google.auto.service" % "auto-service" % "1.0.1",    
            "org.jogamp.gluegen" % "gluegen-rt-natives-linux-amd64" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-linux-i586" % "v2.4.0-rc4",
            "org.jogamp.jogl" % "jogl-all-natives-linux-amd64" % "v2.4.0-rc4",
            "org.jogamp.jogl" % "jogl-all-natives-linux-i586" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-linux-amd64" % "v2.4.0-rc4",
            "org.jogamp.gluegen" % "gluegen-rt-natives-linux-i586" % "v2.4.0-rc4"
        )
    )

lazy val vtkJavaNativesMacOSImpl = (project in file("vtkJavaNativesMacOSImpl"))
  .dependsOn(vtkJavaNatives, vtkJar)
  .settings(
    libraryDependencies ++= Seq(
      "com.google.auto.service" % "auto-service" % "1.0.1",
      "org.jogamp.gluegen" % "gluegen-rt-natives-macosx-universal" % "v2.4.0-rc4",
      "org.jogamp.jogl" % "jogl-all-natives-macosx-universal" % "v2.4.0-rc4",
    )
  )

/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesWin64 = (project in file("vtkJavaNativesWin64"))
    .dependsOn(vtkJar, vtkJavaNatives, vtkJavaNativesWin64Impl)
    .aggregate(vtkJar, vtkJavaNatives, vtkJavaNativesWin64Impl)


/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesLinux = (project in file("vtkJavaNativesLinux"))
    .dependsOn(vtkJar, vtkJavaNatives, vtkJavaNativesLinuxImpl)
    .aggregate(vtkJar, vtkJavaNatives, vtkJavaNativesLinuxImpl)

/*
 * User facing package to use native libraries on Windows
 */
lazy val vtkJavaNativesMacOS = (project in file("vtkJavaNativesMacOS"))
  .dependsOn(vtkJar, vtkJavaNatives, vtkJavaNativesMacOSImpl)
  .aggregate(vtkJar, vtkJavaNatives, vtkJavaNativesMacOSImpl)



/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesAll = (project in file("vtkJavaNativesAll"))
    .dependsOn(vtkJar, vtkJavaNatives, vtkJavaNativesLinuxImpl, vtkJavaNativesWin64Impl, vtkJavaNativesMacOSImpl)
    .aggregate(vtkJar, vtkJavaNatives, vtkJavaNativesLinuxImpl, vtkJavaNativesWin64Impl, vtkJavaNativesMacOSImpl)



/*
 * Main module (only used for testing) 
 */ 
lazy val root = (project in file("."))
    .dependsOn(vtkJavaNativesAll)
    .aggregate(vtkJavaNativesAll)


