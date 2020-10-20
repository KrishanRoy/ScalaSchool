package lectures.part2oop

object Objects extends App {

  //Scala does not know the class level Static functionality
  //but we can write class level and instance level functionality


  //It has Static like functionality
  object Person {
    //"Static" or class level functionality
    val eyes = 2

    def canFly: Boolean = false

    def apply(father: Person, mother: Person): Person = new Person("Jhuma")
  }

  //Companions: since the class and the object with the same
  class Person(val name: String) {
    // Instance level functionality
  }

  //def main(args: Array[String]) : Unit = {
  println(Person.eyes)
  println(Person.canFly)

  //Scala object is a Singleton instance.
  val raju = Person
  val GovindaDa = Person
  println(raju == GovindaDa)

  //this will be false
  val rajuDa = new Person("Raju")
  val GovindaDaDa = new Person("Govinda")
  println(rajuDa == GovindaDaDa)
  val bobbie = Person(rajuDa, GovindaDaDa) //same as Person.apply(rajuDa, GovindaDaDa) though it looks like a constructor but it is apply method
  //def main(args: Array[String]) : Unit {} --> same as public static void main ( String[] : args){}
}

//SO SCALA APPLICATION IS A SCALA OBJECT WITH def main(args: Array[String]) : Unit {} METHOD IMPLEMENTED
// WE CAN REMOVE def main(args: Array[String]) : Unit {} WITH extends App