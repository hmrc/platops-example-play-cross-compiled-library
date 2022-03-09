import sbt._

object LibraryDependencies {

  private val play26Version = "2.6.20"
  private val play27Version = "2.7.5"
  private val play28Version = "2.8.13"

  val compile: Seq[ModuleID] = PlayCrossCompilation.dependencies(
    shared = Seq(),
    play26 = Seq("com.typesafe.play" %% "play" % play26Version),
    play27 = Seq("com.typesafe.play" %% "play" % play27Version),
    play28 = Seq("com.typesafe.play" %% "play" % play28Version)
  )

  val test: Seq[ModuleID] = PlayCrossCompilation.dependencies(
    shared = Seq(
      "ch.qos.logback"         %  "logback-classic"    % "1.2.3"       % Test,
      "org.scalatest"          %% "scalatest"          % "3.1.1"       % Test,
      "com.vladsch.flexmark"   %  "flexmark-all"       % "0.35.10"     % Test
    ),
    play26 = Seq(
      "com.typesafe.play"      %% "play-test"          % play26Version % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.3"       % Test
    ),
    play27 = Seq(
      "com.typesafe.play"      %% "play-test"          % play27Version % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3"       % Test
    ),
    play28 = Seq(
      "com.typesafe.play"      %% "play-test"          % play28Version % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0"       % Test
    )
  )
}
