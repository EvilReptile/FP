import lab4.{Reversable, Smash, Typeclasses}
import org.scalatest.{FunSuite, Matchers}

class TypeclassesTest extends FunSuite with Matchers{

  test("test method revers"){
    Typeclasses.reverse("test":String)(Reversable.ReversableString) shouldBe "tset"
  }

  test("test method testReversableString"){
    Typeclasses.testReversableString("Hello") shouldBe "olleH"
  }

  test("test method smash"){
    Typeclasses.smash(20.3, 3.14)(Smash.SmashDouble) shouldBe 23.44
  }

  test("test method testSmashInt"){
    Typeclasses.testSmashInt(2, 3) shouldBe 5
  }

  test("test method testSmashDouble"){
    Typeclasses.testSmashDouble(3.14, 3.14) shouldBe 6.28
  }

  test("test method testSmashString"){
    Typeclasses.testSmashString("te", "st") shouldBe "test"
  }

}
