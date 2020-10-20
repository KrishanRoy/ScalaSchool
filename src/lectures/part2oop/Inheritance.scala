package lectures.part2oop

object Inheritance extends App {

  //single class inheritance
  sealed class Animal {
    val creatureType = "Wild"

    //private def eat = println("Eat now")
     def eat = println("nom nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("Scrunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors
  class People(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  //class Adult(name: String, age: Int, idCard: String) extends Person -> compiler is not happy as JVM languages need
  // to call the constructor of the Parent class first before calling the child class
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) //Now compiler is happy

  //Constructors
  //we can call all the overridden method in the constructor
  class Dog(override val creatureType: String) extends Animal {
    override def eat: Unit = {
      super.eat
      println("crunch crunch")
    }

    //override val creatureType: String = "domestic"
  }

  //exactly the same thing as above \|/
  //  class Dog (dogType: String) extends Animal{
  //    override val creatureType: String = dogType
  //  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  //Type Substitution (Polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat //this will print crunch crunch since
  //OverRIDING and overLOADING
  //override means to supply a different implementation in the derived classes
  //overloading means to have the same method signature with different params

  /*preventing override
  1. using final next to the method you do not want to get overridden
  2. using final next to the class to prevent the entire class to be overridden
  3. Using sealed = extends within that file where the sealed class is but prevents outside of that file
   */


}
