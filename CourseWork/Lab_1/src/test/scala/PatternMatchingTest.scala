import lab1.PatternMatching
import org.scalatest.{FunSuite, Matchers}

class PatternMatchingTest extends FunSuite with Matchers {

  test("test method intToString") {
    PatternMatching.intToString(3) shouldBe "it is three"
  }

  test("test method testIntToString") {
    PatternMatching.testIntToString(3) shouldBe "it is three"
  }

  test("test method isMaxAndMoritz") {
    PatternMatching.isMaxAndMoritz("Max") shouldBe true
  }

  test("test method testIsMaxAndMoritz") {
    PatternMatching.testIsMaxAndMoritz("max") shouldBe true
  }

  test("test method isEvenNumber") {
    PatternMatching.isEvenNumber(7) shouldBe false
  }

  test("test method testIsEven") {
    PatternMatching.testIsEven(6) shouldBe true
  }

  test("test method winsA") {
    PatternMatching.winsA(PatternMatching.Scissor, PatternMatching.Rock) shouldBe PatternMatching.Lose
  }

  test("test method testWinsA"){
    PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Rock) shouldBe PatternMatching.Lose
  }

  test("test method getMammalWeight"){
    PatternMatching.getMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5)) shouldBe 5
  }

  test("test method testExtractMammalWeight"){
    PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5)) shouldBe 5
  }

  test("test method updateFood"){
    PatternMatching.updateFood(PatternMatching.Fish("fish", PatternMatching.Plants)) shouldBe PatternMatching.Fish("fish", PatternMatching.Plants)
  }

  test("test method testUpdateFood"){
    PatternMatching.testUpdateFood(PatternMatching.Fish("fish", PatternMatching.Plants)) shouldBe PatternMatching.Fish("fish", PatternMatching.Plants)
  }
}
