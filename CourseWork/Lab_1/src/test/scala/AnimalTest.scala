import lab1.Animal
import lab1.Animal.Mammals
import org.scalatest.{FunSuite, Matchers}

class AnimalTest extends FunSuite with Matchers{

  test("test method knownAnimal"){
    Animal.knownAnimal("Cat") should be (true)
  }

  test("test method apply when passes null"){
    Animal.apply("Dog") shouldBe empty
  }

  test("test method apply when passes Mammals class"){
    Animal.apply("Cat").get should be (Mammals("Cat", "Meat"))
  }

  test("test method eats"){
    Animal.apply("Cat").get.eats("Meat") shouldBe (true)
  }

}
