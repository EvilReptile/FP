import lab1.HigherOrder
import org.scalatest.{FunSuite, Matchers}

class HigherOrderTest extends FunSuite with Matchers{

  test("test function plus"){
    HigherOrder.plus(5, 10) shouldBe 15
  }

  test("test  function multiply"){
    HigherOrder.multiply(2, 3) shouldBe 6
  }

  test("test method nTimes"){
    HigherOrder.nTimes(HigherOrder.plus, 5, 20, 10) shouldBe 250
  }

  test("test method testNTimes"){
    HigherOrder.testNTimes(HigherOrder.multiply, 5, 5, 5) shouldBe 125
  }

  test("test method testAnonymousNTimes"){
    HigherOrder.testAnonymousNTimes(5, 5, 5) shouldBe 25
  }

}
