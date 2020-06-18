import org.scalatest.{FunSuite, Matchers}

class MainTest extends FunSuite with Matchers{

  test("Test first laboratory work"){
    Main.lab1() shouldBe 11
  }

  test("Test second laboratory work"){
    Main.lab2() shouldBe 10
  }

  test("Test third laboratory work"){
    Main.lab3() shouldBe 11
  }

  test("Test fourth laboratory work"){
    Main.lab4() shouldBe 7
  }

}
