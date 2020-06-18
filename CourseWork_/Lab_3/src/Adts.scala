import scala.util.{Try, Failure, Success}

object Adts {

  // a) Дан List[Int], верните элемент с индексом n


  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру 
  def testGetNth(list: List[Int], n: Int): Option[Int] = Some(list(n))

  // b) Напишите функцию, увеличивающую число в два раза.
  
  def Double(n: Option[Int]): Option[Int] = if (n.isDefined)  Some(n.get * 2)  else None

  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру
  def testDouble(n: Option[Int]): Option[Int] = Double(n)

  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").

  def IsEven(n: Int): Either[String, Int] = n % 2 match {
    case 0 => Right(n)
    case 1 => Left("Нечетное число")
  }

  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру
  def testIsEven(n: Int): Either[String, Int] = IsEven(n)

  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").

  def SafeDivide(a: Int, b: Int): Either[String, Int] = {
    if (b == 0) Left("Вы не можете делить на ноль.")
    else Right(a / b)
  }

  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру
  def testSafeDivide(a: Int, b: Int): Either[String, Int] = SafeDivide(a, b)

  // e) Обработайте исключения функции с побочным эффектом вернув 0.

  def GoodOldJava(impure: String => Int, str: String): Try[Int] = Try(impure(str))

  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = GoodOldJava(impure, str)

}
