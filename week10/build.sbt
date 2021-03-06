import com.typesafe.sbt.packager.docker.ExecCmd

enablePlugins(JavaAppPackaging, AshScriptPlugin)

name := "week10todo"

version := "0.1"

scalaVersion := "2.13.5"

scalaVersion := "2.12.6"

dockerBaseImage := "openjdk:8-jre-alpine"
packageName in Docker := "week10todo"

val akkaVersion = "2.6.8"
val akkaHttpVersion = "10.2.4"
val circeVersion = "0.9.3"

javacOptions ++= Seq("-source", "1.8")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.21.0",

  "org.scalatest" %% "scalatest" % "3.0.5" % Test,

  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

dockerCommands := dockerCommands.value.map {
  case ExecCmd("CMD", _@_*) =>
    ExecCmd("CMD", "/opt/docker/bin/week10")
  case other =>
    other
}

//./deploy.sh week10todo f8d7b98a4915 eff77ee6-bd87-441c-899f-2e1d09a3a5bf