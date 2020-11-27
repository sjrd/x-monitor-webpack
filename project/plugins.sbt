// Allows To Continuously Reload Applications
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

// Allows Scala.js Compilation
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.3.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.20.0" withSources())

// Extract metadata from sbt and make it available to the code
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

// Best Practices for Production Code
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.15")

// native packager: zip/deb/docker
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.22")

// sbt git support
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")

// displays sbt project's dependency updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")

// former sbt-dependency-graph built into sbt 1.4.x
addDependencyTreePlugin

// better management of transitive dependencies and conflicts: https://www.scala-lang.org/2019/10/17/dependency-management.html
addSbtPlugin("ch.epfl.scala" % "sbt-missinglink" % "0.3.1")

addSbtPlugin("com.github.cb372" % "sbt-explicit-dependencies" % "0.2.15")