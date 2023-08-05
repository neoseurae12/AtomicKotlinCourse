// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int =
  if (number >= 0) number else -number

/* 첫 나의 답안
  if (number >= 0)
    number
  else
    (-1) * number
  */

fun main() {
  println(abs(-19))  // 19
}