import lab3.Strings
import org.scalatest.{FunSuite, Matchers}

class StringTest extends FunSuite with Matchers{

  test("test method testUppercase"){
    Strings.testUppercase("test") shouldBe "TEST"
  }

  test("test method testInterpolations"){
    Strings.testInterpolations("Kirill", 20) shouldBe ("Hi, my name is Kirill and I am 20 years old.")
  }

  test("test method testCompitation"){
    val a: Int = 20
    val b: Int = 3
    Strings.testComputation(a, b) shouldBe ("Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      s"  a := $a\n" +
      s"  b := $b\n\n" +
      s"  return $a + $b")
  }

  test("test method testTakeTwo"){
    Strings.testTakeTwo("Test line") shouldBe "T"
  }
}
