package lectures.part2oop

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String = "Wild"

    def eat: Unit
  }

  //abstract classes are meant to be extended later
  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }

  //Traits
  trait ColdBlooded

  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal : String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"

    def eat: Unit = println("nomnomnom")

    def eat(animal: Animal): Unit = println(s"I am a croc and I am eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //Difference between abstract class and traits
  /*
   * 1. Traits do not have constructor parameters
   * 2. We can extend one abstract class but multiple traits
   * 3. traits = behavior but an Abstract class is a type of thing
   */

  /*
   *
   */
}
