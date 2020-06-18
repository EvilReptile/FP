package lab3

object Strings {

  def testUppercase(str: String): String = str.toUpperCase

  def testInterpolations(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

  def testComputation(a: Int, b: Int): String = "Hi,\n" +
    "now follows a quite hard calculation. We try to add:\n" +
    s"  a := $a\n" +
    s"  b := $b\n\n" +
    s"  return $a + $b"

  def testTakeTwo(str: String): String = str.length match {
    case 2 => str
    case _ => str.substring(0,1)
  }
}
