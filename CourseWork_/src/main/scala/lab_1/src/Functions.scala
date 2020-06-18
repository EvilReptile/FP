package exercise1
/** Напишите отдельные функции, решающие поставленную задачу. 
  * 
  * Синтаксис:
  *   // метод
  *   def myFunction(param0: Int, param1: String): Double = // тело
  * 
  *   // значение
  *   val myFunction: (Int, String) => Double (param0, param1) => // тело
  */
object Functions extends App {

  /* a) Напишите функцию, которая рассчитывает площадь окружности
   *    r^2 * Math.PI
   */
  def CircleS(r: Double): Double = r * r * Math.PI


  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testCircle(r: Double): Double = CircleS(r)
  


  /* b) Напишите карированную функцию которая рассчитывает площадь прямоугольника a * b.
   */
  def RectangleSCurried(a: Double)(b:Double) = a * b

  // примените вашу функцию из пукта (b) здесь, не изменяя сигнатуру
  def testRectangleCurried(a: Double, b: Double): Double = RectangleSCurried(a)(b)


  // c) Напишите не карированную функцию для расчета площади прямоугольника.

  def RectangleS(a: Double, b:Double): Double = a * b

  // примените вашу функцию из пункта (c) здесь, не изменяя сигнатуру
  def testRectangleUc(a: Double, b: Double): Double = RectangleS(a, b)

  //вывод результатов
  println("testCircle:\t\t" + testCircle(10))
  println("testRectangleCurried:\t" + testRectangleCurried(5, 10))
  println("testRectangleUc:\t" + testRectangleUc(5, 10))
}
