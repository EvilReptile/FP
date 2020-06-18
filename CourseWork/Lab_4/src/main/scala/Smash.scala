package lab4

trait Smash[T] {
  def smash(a: T, b: T): T
}

object Smash {
  implicit object SmashInt extends Smash[Int] {
    def smash(a: Int, b: Int): Int = a + b
  }

  implicit object SmashDouble extends Smash[Double] {
    def smash(a: Double, b: Double): Double = a + b
  }

  implicit object SmashString extends Smash[String] {
    def smash(a: String, b:String): String = a.concat(b)
  }
}