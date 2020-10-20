package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, val favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    //def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}" // using + as a method name is fine
    def apply(): String = s"Hi, my name is $name and my favorite movie is $favoriteMovie"

    def appl(): String = "this will not print since only apply() method can be called on an instance like instance()"

    //Exercises
    //Overload the + operator
    def +(nickName: String): Person = new Person(nickName, "Inception")
  }

  val mannu = new Person("Mannu", "Inception")
  println(mannu.likes("Inception"))
  println(mannu likes "Inception") //both line 9 and 10 are same!! Infix notation or operator notation. It only works for method with one single param

  val shuku = new Person("Shuku", "Wild life")
  //println(mannu hangoutWith shuku)
  println(mannu + shuku)
  println(mannu.+(shuku))
  //"operators
  println(1 + 2)
  println(1.+(2))
  //IN SCALA ALL OPERATORS ARE METHODS
  println(shuku()) // the compiler assumes that we are calling the apply() method. It only works for apply() method
  println(mannu + "the rockerstar") //same as println(mannu.+("the rockerstar")) or println(mannu +("the rockerstar"))
}
