name := "CourseWork"
version := "1.0"
scalaVersion := "2.13.2"
libraryDependencies +=
  "org.scalatest" %% "scalatest" % "3.0.8" % Test

val common = Seq(
  scalaVersion := "2.13.2"
)

lazy val root = project
  .in(file("."))
  .aggregate(lab1, lab2, lab3, lab4)

lazy val lab1 = project
    .in(file("lab_1"))
    .settings(
      common,
      libraryDependencies ++= Seq(...)
    )


lazy val lab2 = project
    .in(file("lab_2"))
    .settings(
      common,
      libraryDependencies ++= Seq(...)
    )

lazy val lab3 = project
    .in(file("lab_3"))
    .settings(
      common,
      libraryDependencies ++= Seq(...)
    )


lazy val lab4 = project
    .in(file("lab_4"))
    .settings(
      common,
      libraryDependencies ++= Seq(...)
    )
