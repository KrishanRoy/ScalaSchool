package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //Expression
  println(x)
  println(2 + 3 * 5)
  //+ - * / & (bitwise and) | (bitwise or) ^ (bitwise exclusive or) << (right shift) >> (left shift) >>> (right shift with zero expression)
  println(!(1 == 5))
  println(1 != 5)
  //Instructions (Do) vs Expressions (value)
  //If Expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 //It is an Expression
  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }
  //Please do not write Loops like in Imperative programming.
  //Everything in Scala is an Expression

  val aWeirdValue = (i = 1)
  println(aWeirdValue)

  //Side Effects are println(), whiles, reassiging part of imperative programming
  val aCodeBlock = {
    val x = 7
    val y = x + 2
    if (y > 7) "Stay" else "good bye"
  }
}
