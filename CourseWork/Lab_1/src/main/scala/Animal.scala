package lab1

sealed trait Animal {
  val name: String
  val food: String
  def eats(food: String): Boolean = return this.food.equals(food)
}

object Animal {

  sealed trait Food

  case object Meat extends Food
  case object Vegetables extends Food
  case object Plants extends Food

  case class Mammals(name: String, food: String) extends Animal
  case class Birds(name: String, food: String) extends Animal
  case class Fishes(name: String, food: String) extends Animal


  val cat = Mammals("Cat", "Meat")
  val parrot = Birds("Parrot", "Vegetables")
  val goldfish = Fishes("Goldfish", "Seaweed")

  def knownAnimal(name: String): Boolean = 
    name.equals(cat.name) || name.equals(parrot.name) ||
    name.equals(goldfish.name)

  def apply(name: String): Option[Animal] = {
    name match {
      case cat.name => Some(cat)
      case parrot.name => Some(parrot)
      case goldfish.name => Some(goldfish)
      case other => None
    }
  }
}



