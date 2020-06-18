package lab1

object Functions {

  def CircleS(r: Double): Double = r * r * Math.PI

  def testCircle(r: Double): Double = CircleS(r)

  def RectangleSCurried(a: Double)(b:Double) = a * b

  def testRectangleCurried(a: Double, b: Double): Double = RectangleSCurried(a)(b)

  def RectangleS(a: Double, b:Double): Double = a * b

  def testRectangleUc(a: Double, b: Double): Double = RectangleS(a, b)

}
