ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "25nov2024",

    libraryDependencies ++= Seq(
      "org.neo4j" %% "neo4j-connector-apache-spark" % "5.3.2_for_spark_3",
      "log4j" % "log4j" % "1.2.17",
      "org.slf4j" % "slf4j-log4j12" % "1.7.36",
      "org.apache.spark" %% "spark-core" % "3.5.0",
      "org.apache.spark" %% "spark-sql" % "3.5.0"

    )
  )