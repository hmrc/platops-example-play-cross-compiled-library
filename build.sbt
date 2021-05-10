lazy val root = Project("platops-example-play-cross-compiled-library", file("."))
  .settings(
    majorVersion        := 0,
    scalaVersion        := "2.12.12",
    crossScalaVersions  := Seq("2.11.12", "2.12.12"),
    isPublicArtefact    := true,
    libraryDependencies ++= LibraryDependencies.compile ++ LibraryDependencies.test,
    PlayCrossCompilation.playCrossCompilationSettings
  )
