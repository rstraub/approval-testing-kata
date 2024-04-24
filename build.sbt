import Dependencies.*
import org.typelevel.scalacoptions.ScalacOptions
import sbt.Keys.libraryDependencies

ThisBuild / scalaVersion := "2.13.13"
ThisBuild / organization := "nl.codecraftr"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafixScalaBinaryVersion := "2.13"
ThisBuild / javacOptions ++= Seq("-source", "21", "-target", "21")
tpolecatScalacOptions += ScalacOptions.release("21")

val circeVersion = "0.14.1"

lazy val root = project
  .enablePlugins(ScalafmtPlugin)
  .in(file("."))
  .settings(
    name := "approval-testing-kata",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      scalaTest,
      scalaTestJunit,
      scalaCheck,
      approvalsTests,
      mockito,
      catsCore,
      "com.google.code.gson" % "gson" % "2.10.1" % Test
    ),
    libraryDependencies ++= Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser"
    ).map(_ % circeVersion)
  )
