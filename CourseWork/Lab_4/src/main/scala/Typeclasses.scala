package lab4

object Typeclasses {

  def reverse[T](str: T)(implicit rev: Reversable[T]): T = rev.reverse(str)

  def testReversableString(str: String): String = reverse(str)

  def smash[T](a: T, b: T)(implicit sm : Smash[T]) : T = sm.smash(a, b)

  def testSmashInt(a: Int, b: Int): Int = smash(a, b)

  def testSmashDouble(a: Double, b: Double): Double = smash(a, b)

  def testSmashString(a: String, b: String): String = smash(a, b)
}
