import lab3.Adts
import org.scalatest.{FunSuite, Matchers}

import scala.util.Success


class AdtsTest extends FunSuite with Matchers{

  test("test method testGetNth"){
    Adts.testGetNth(List(1, 2, 3, 4, 5, 6), 3) shouldBe Some(4)
  }

  test("test exception testGetNth"){
     a[IndexOutOfBoundsException] should be thrownBy(Adts.testGetNth(List(1, 2, 3), 3))
  }

  test(" test method Double"){
    Adts.Double(Option(1)) shouldBe Some(2)
  }

  test(" test method testDouble"){
    Adts.testDouble(Option(20)) shouldBe Some(40)
  }

  test("test method IsEven"){
    Adts.IsEven(10) shouldBe Right(10)
  }

  test("test method testIsEven"){
    Adts.IsEven(-2) shouldBe Right(-2)
  }

  test("test method SafeDivide"){
    Adts.SafeDivide(10, 5) shouldBe Right(2)
  }

  test("test method testSafeDivide"){
    Adts.testSafeDivide(5, 0) shouldBe Left("Вы не можете делить на ноль.")
  }

  test("test method GoodOldJava"){
    Adts.GoodOldJava((i: String) => if(i.equals("done")) -1 else 0, "done") shouldBe Success(-1)
  }

  test("test method testGoodOldJava"){
    Adts.GoodOldJava((i: String) => if(i.equals("done")) 1 else 0, "one") shouldBe Success(0)
  }

}
