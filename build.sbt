lazy val commonSettings = Seq(
  scalaVersion := "2.13.4",
  addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.1" cross CrossVersion.full),
  addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
  Compile / scalacOptions ~= ((options: Seq[String]) => options.filterNot(Set("-Xfatal-warnings"))),
  git.useGitDescribe := true, // see https://github.com/sbt/sbt-git#versioning-with-git
)

val scalaJsDomVersion = "1.1.0"
val scalaTestVersion = "3.2.3"
val circeVersion = "0.13.0"

lazy val frontend = (project in file("frontend"))
  .settings(
    name := "x-monitor-frontend"
  )
  .enablePlugins(GitVersioning, ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(commonSettings)
  .settings(
    version in webpack := "4.44.1",
    version in startWebpackDevServer := "3.11.0",

    webpackBundlingMode := BundlingMode.LibraryAndApplication(),

    // Execute the tests in browser-like environment
    requireJsDomEnv in Test := true,

    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % scalaJsDomVersion withSources(),
      "org.scalatest" %%% "scalatest" % scalaTestVersion % "test" withSources(),
      "io.circe" %%% "circe-parser" % circeVersion withSources(),
    )
  )