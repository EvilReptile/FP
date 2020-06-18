lazy val common = Seq(
  version := "1.0",
  scalaVersion := "2.13.2",
  libraryDependencies +=
    "org.scalatest" %% "scalatest" % "3.0.8" % Test,
)

lazy val root = project
  .in(file("."))
  .aggregate(Lab_1, Lab_2, Lab_3, Lab_4)
  .settings(common)
  .dependsOn(Lab_1, Lab_2, Lab_3, Lab_4)

lazy val Lab_1 = Project("lab1", file("Lab_1"))
  .settings(common)

lazy val Lab_2 = Project("lab2", file("Lab_2"))
  .settings(common)

lazy val Lab_3 =  Project("lab3", file("Lab_3"))
  .settings(common)

lazy val Lab_4 =  Project("lab4", file("Lab_4"))
  .settings(common)
