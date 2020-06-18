package lab4

trait Reversable[T] {
  def reverse(x: T): T
}

object Reversable {
  implicit object ReversableString extends Reversable[String] {
    def reverse(str: String) : String = str.reverse
  }
}
  