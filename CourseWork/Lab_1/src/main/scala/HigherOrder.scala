package lab1

object HigherOrder{

  val plus: (Int, Int) => Int = _ + _
  val multiply: (Int, Int) => Int = _ * _

  def nTimes(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = n * f(a, b)

  def testNTimes(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = nTimes(f, a, b, n)

  def testAnonymousNTimes(a: Int, b: Int, n: Int): Int = nTimes((a: Int,b: Int) =>
  { if (a > b) a else b },  a: Int, b: Int, n: Int)

}
