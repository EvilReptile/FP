import lab3.Sequence
import org.scalatest.{FunSuite, Matchers}

class SequenceTest extends FunSuite with Matchers{

  test("test method testLastElement"){
    Sequence.testLastElement(Seq(1, 2, 3, 4, 5, 6)) shouldBe Some(6)
  }

  test("test method testZip"){
    Sequence.testZip(Seq(1, 3, 5), Seq(2, 4, 6)) shouldBe List((1, 2), (3, 4), (5, 6))
  }

  test("test method testForAll"){
    Sequence.testForAll(Seq(3, 6, 9, 12))((i: Int) => i % 3 == 0) shouldBe true
  }

  test("test method testPalindrom"){
    Sequence.testPalindrom(Seq(1, 2, 3, 4, 3, 2, 1)) shouldBe true
  }
}
