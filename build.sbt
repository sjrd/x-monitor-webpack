lazy val commonSettings = Seq(
  scalaVersion := "2.13.4",
)

val scalaJsDomVersion = "1.1.0"
val scalaTestVersion = "3.2.3"
val circeVersion = "0.13.0"

lazy val frontend = (project in file("frontend"))
  .settings(
    name := "x-monitor-frontend"
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(commonSettings)
  .settings(
    version in webpack := "4.44.1",
    version in startWebpackDevServer := "3.11.0",

    webpackBundlingMode := BundlingMode.LibraryAndApplication(),

    // Execute the tests in browser-like environment
    requireJsDomEnv in Test := true,

    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % scalaTestVersion % "test",
      "io.circe" %%% "circe-parser" % circeVersion,
    )
  )
