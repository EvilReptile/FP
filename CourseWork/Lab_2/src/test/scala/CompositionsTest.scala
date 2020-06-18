import lab2.Compositions
import org.scalatest.{FunSuite, Matchers}

class CompositionsTest extends FunSuite with Matchers{

  test("test method testCompose"){
    Compositions.testCompose((i:Int) => "Compose" * i)((i: String) => i * 2)((i:String) => i.dropRight(3))(2) should be ("ComposeComposeComposeComp")
  }

  test("test method testFlatMap"){
    Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i * 2)(Some(11)) shouldBe Some(22)
  }

  test("test method testForComprehension"){
    Compositions.testForComprehension((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i * 2)(Some(9)) shouldBe empty
  }

}
