package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  //@tailrec
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1) //if we put @tailrec, it will fail and

  //factorial(5400) //--> this will give us 0 since it is so big that will not be able to compute that

  def anotherFact(n: Int): BigInt = {
    @tailrec
    def factHelper(t: Int, accumulator: BigInt): BigInt =
      if (t <= 1) accumulator
      else factHelper(t - 1, t * accumulator)

    factHelper(n, 1)
  }

  //println(anotherFact(5000)) // this will give us
  @tailrec
  def concatStringNTimes(n: Int, input: String, accumulator: StringBuilder): String =
    if (n <= 0) accumulator.toString()
    else concatStringNTimes(n - 1, input, accumulator.append(input))

  println(concatStringNTimes(5, "n", new StringBuilder("")))

  @tailrec
  def tailRecFibonacci(n: Int, incrementer: Int, last: Int, nextToLast: Int): Int = {
    if (incrementer >= n) last
    else tailRecFibonacci(n, incrementer + 1, nextToLast + last, last)
  }

  println(tailRecFibonacci(7, 2, 1, 1)) // 1(last) 1(nextToLast) 2(i) 3 5 8 13 --> to get to 13, it will run n - 2 or 7 -2 = 5 times
}
