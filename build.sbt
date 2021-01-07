import PlayCrossCompilation._

val libName = "platops-example-play-cross-compiled-library"

lazy val simpleReactiveMongo = Project(libName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning)
  .settings(
    majorVersion        := 0,
    scalaVersion        := "2.12.12",
    libraryDependencies ++= LibraryDependencies.compile ++ LibraryDependencies.test,
    crossScalaVersions  := Seq("2.11.12", "2.12.12"),
    playCrossCompilationSettings
  )
