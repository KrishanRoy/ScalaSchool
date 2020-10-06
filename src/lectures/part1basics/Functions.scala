package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("Hello", 3))
  println(factorial(5))
  println(fib(7))

  def aParameterlessFunc(): Int = 42

  def aRepeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1) //recursive function that calls itself

  println(aRepeatedFunction("Hello", 3))

  //When you need loops, use Recursion
  /*
  Exercise
   */
  def greeting(name: String, age: Int): Unit = println(s"my name is $name and I am $age years old")

  def factorial(num: Int): Int =
    if (num <= 0) 1
    else num * factorial(num - 1)

  def fib(num: Int): Int =
    if (num <= 2) 1
    else fib(num - 1) + fib(num - 2)

//  def isPrime(n: Int): Boolean = {
//    def isPrimeUntil
//  }
}

