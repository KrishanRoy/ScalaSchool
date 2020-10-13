package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Opu", 26)
  //println(person.age) when we do not put val, ide will be unhappy.
  //  println(person.x)
  //  person.greet("Titu da")
  //  person.greet()

  val author = new Writer("Rabindranath", "Thakur", 1861)
  val novel = new Novel("Noukadubi", 1906, author)
  println(author.fullName)
  novel.authorAge
  println(novel.isWrittenBy(author))
  val counter = new Counter
  counter.increment(10).print //same as println(counter.increment(10).count)


}

class Person(val name: String, val age: Int = 0) {
  //class parameters are not class fields. To convert parameters to fields, use val
  val x = 2
  println(3 + 5) //this returns Unit which is a side effect
  // if we hit run, the entire code block including println will get executed, In java, without a function block we
  // cannot print something. Except the function that is specifically called, other functions such as getters and setters
  // are not evaluated in Java.

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //method Overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //constructor overloading
  def this(name: String) = this(name, 0) //not so practical since we are eliminating age param which we can achieve by providing default param to age
}

//Exercises
class Writer(firstName: String, surName: String, val yearOfBirth: Int) {
  def fullName: String = s"$firstName $surName"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge: Unit = println(s"the age of author is ${yearOfRelease - author.yearOfBirth} at the year $yearOfRelease")

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author) //like a setter
}

class Counter(val count: Int = 0) { //if we add val, then we do not need the currentCount method
  //def currentCount: Int = count

  def increment: Counter = {
    println("incrementing")
    new Counter(count + 1)
  } //immutability, when we are using val, we cannot mutate the count unless we create a new instant, same as Kotlin

  def decrement: Counter = {
    println("decrementing")
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this
    else increment.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)
  }

  def print: Unit = println(count)

}
