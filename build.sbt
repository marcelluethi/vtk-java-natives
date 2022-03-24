ThisBuild / organization := "ch.unibas.cs.gravis"
ThisBuild / version      := "0.1.1"
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
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / resolvers    := Seq(
    "sonatype-release" at "https://oss.sonatype.org/content/repositories/releases",
)

/*
 * dummy package to manage vtk.jar
 */   
lazy val vtkJar = (project in file("vtkJar"))
    .settings(
        name := "vtkJavaNativesVtkJar",
        Compile / packageBin := baseDirectory.value / "lib"/ "vtk-9.1.0.jar"
    )

lazy val joglJar = (project in file("joglJar"))
  .settings(
    name := "vtkJavaNativesJoglJar",
    Compile / packageBin := baseDirectory.value / "lib"/ "jogl-all-v2.4.0-rc4.jar"
  )

lazy val gluegenJar = (project in file("gluegenJar"))
  .settings(
    name := "vtkJavaNativesGluegenJar",
    Compile / packageBin := baseDirectory.value / "lib"/ "gluegen-rt-v2.4.0-rc4.jar"
  )


/*
 * Module definition and library loading logic. Does not contain any native libraries
 */
lazy val vtkJavaNatives = (project in file("vtkJavaNatives"))
  .dependsOn(vtkJar, joglJar, gluegenJar)
  .aggregate(vtkJar, joglJar, gluegenJar)


/*
 *  Package with native libraries for win64
 */ 
lazy val vtkJavaNativesWin64Impl = (project in file("vtkJavaNativesWin64Impl"))
    .dependsOn(vtkJavaNatives)
    .settings(
        libraryDependencies ++= Seq(
            "com.google.auto.service" % "auto-service" % "1.0.1",
        )
    )


/*
 *  Package with native libraries for win64
 */ 
lazy val vtkJavaNativesLinuxImpl = (project in file("vtkJavaNativesLinuxImpl"))
    .dependsOn(vtkJavaNatives)
    .settings(
        libraryDependencies ++= Seq(
            "com.google.auto.service" % "auto-service" % "1.0.1"
        )
    )

lazy val vtkJavaNativesMacOSImpl = (project in file("vtkJavaNativesMacOSImpl"))
  .dependsOn(vtkJavaNatives)
  .settings(
    libraryDependencies ++= Seq(
      "com.google.auto.service" % "auto-service" % "1.0.1"
    )
  )

/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesWin64 = (project in file("vtkJavaNativesWin64"))
    .dependsOn(vtkJavaNatives, vtkJavaNativesWin64Impl)
    .aggregate(vtkJavaNatives, vtkJavaNativesWin64Impl)


/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesLinux = (project in file("vtkJavaNativesLinux"))
    .dependsOn(vtkJavaNatives, vtkJavaNativesLinuxImpl)
    .aggregate(vtkJavaNatives, vtkJavaNativesLinuxImpl)

/*
 * User facing package to use native libraries on Windows
 */
lazy val vtkJavaNativesMacOS = (project in file("vtkJavaNativesMacOS"))
  .dependsOn(vtkJavaNatives, vtkJavaNativesMacOSImpl)
  .aggregate(vtkJavaNatives, vtkJavaNativesMacOSImpl)



/*
 * User facing package to use native libraries on Windows
 */ 
lazy val vtkJavaNativesAll = (project in file("vtkJavaNativesAll"))
    .dependsOn(vtkJavaNatives, vtkJavaNativesLinuxImpl, vtkJavaNativesWin64Impl, vtkJavaNativesMacOSImpl)
    .aggregate(vtkJavaNatives, vtkJavaNativesLinuxImpl, vtkJavaNativesWin64Impl, vtkJavaNativesMacOSImpl)



/*
 * Main module (only used for testing) 
 */ 
lazy val root = (project in file("."))
    .dependsOn(vtkJavaNativesAll)
    .aggregate(vtkJavaNativesAll)


