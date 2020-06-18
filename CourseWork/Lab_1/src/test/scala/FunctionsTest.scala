import lab1.Functions
import org.scalatest.{FunSuite, Matchers}

class FunctionsTest extends FunSuite with Matchers{

  test("test CircleS method"){
    Functions.CircleS(10) shouldBe (10*10*Math.PI)
  }

  test("test testCircle method"){
    Functions.testCircle(3.14) shouldBe(3.14*3.14*Math.PI)
  }

  test("test method rectangleCurried"){
    Functions.RectangleSCurried(5)(10) shouldBe 50
  }

  test("test method testRectangleCurried"){
    Functions.testRectangleCurried(5, 10) shouldBe 50
  }

  test("test method RectangleS"){
    Functions.RectangleS(5.2, 10.1) shouldBe 52.52
  }

  test("test nethod testRectangleUc"){
    Functions.testRectangleUc(3.3, 10.1) shouldBe 33.33
  }

}
