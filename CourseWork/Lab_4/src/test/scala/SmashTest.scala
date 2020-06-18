import lab4.Smash
import org.scalatest.{FunSuite, Matchers}

class SmashTest extends FunSuite with Matchers{

  test("test method smash in implication object SmashInt"){
    Smash.SmashInt.smash(10, 10) shouldBe 20
  }

  test("test method smash in implication object SmashDouble"){
    Smash.SmashDouble.smash(3.3, 5.7) shouldBe(9)
  }

  test("test method smash in implication object SmashString"){
    Smash.SmashString.smash("Hello ", "world!") shouldBe "Hello world!"
  }

}
