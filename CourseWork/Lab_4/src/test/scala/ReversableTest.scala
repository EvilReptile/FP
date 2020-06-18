import lab4.Reversable
import org.scalatest.{FunSuite, Matchers}

class ReversableTest extends FunSuite with Matchers{

  test("test method reverse"){
    Reversable.ReversableString.reverse("test") shouldBe "tset"
  }

}
