package lab3

import scala.util.Try

object Adts {

  def testGetNth(list: List[Int], n: Int): Option[Int] = Some(list(n))

  def Double(n: Option[Int]): Option[Int] = if (n.isDefined)  Some(n.get * 2)  else None

  def testDouble(n: Option[Int]): Option[Int] = Double(n)

  def IsEven(n: Int): Either[String, Int] = n % 2 match {
    case 0 => Right(n)
    case 1 => Left("Нечетное число")
  }

  def testIsEven(n: Int): Either[String, Int] = IsEven(n)

  def SafeDivide(a: Int, b: Int): Either[String, Int] = {
    if (b == 0) Left("Вы не можете делить на ноль.")
    else Right(a / b)
  }

  def testSafeDivide(a: Int, b: Int): Either[String, Int] = SafeDivide(a, b)

  def GoodOldJava(impure: String => Int, str: String): Try[Int] = Try(impure(str))

  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = GoodOldJava(impure, str)

}
