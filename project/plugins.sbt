// https://github.com/rtimush/sbt-updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")

// https://github.com/jrudolph/sbt-dependency-graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")


unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"
libraryDependencies ++= Seq(
  "commons-collections" % "commons-collections" % "3.2.2",
  "org.owasp" % "dependency-check-core" % "6.0.3",
  "org.slf4j" % "slf4j-simple" % "1.7.30"
)
