import Lab9.Lab_9._

object App {
  def main(args: Array[String]): Unit = {
    println(firstFunctionalStile(100, 9))
    println(firstImperativeStile(100, 9))

    println(secondFunctionalStile(List("this", "is", "a", "test", "text", "for", "tests"), 3))
    println(secondImperativeStyle(List("this", "is", "a", "test", "text", "for", "tests"), 3))

  }
}
