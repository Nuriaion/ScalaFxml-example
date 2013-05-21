scalaVersion := "2.10.1"

scalacOptions ++= Seq(
    "-feature",
    "-deprecation"
)

version :="0.1.0-SNAPSHOT"

parallelExecution := true

name := "scalafxml-example"

organization := "com.github.nuriaion"

fork := true

resolvers ++= Seq(
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
    "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
    "com.eed3si9n" %% "treehugger" % "0.2.3",
    "org.scalaz" %% "scalaz-core" % "7.0.0",
    "org.scalafx" %% "scalafx" % "1.0.0-M3"
)

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.14" % "test",
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
    "junit" % "junit" % "4.11" % "test",
    "org.pegdown" % "pegdown" % "1.2.0" % "test"
)

testOptions in Test += Tests.Argument("junitxml", "html", "console", "markup")

publishArtifact in Compile := true

//ScalaFxmlPlugin.newSettings

//newSetting := "light"

scalafxmlSettings

//unmanagedJars in Compile += Attributed.blank(file("/Library/Java/JavaVirtualMachines/jdk1.7.0_11.jdk/Contents/Home/jre/lib/jfxrt.jar"))

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))