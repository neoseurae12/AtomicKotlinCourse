// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var sumEven = 0
  var i = 0
  while (i <= n) {
    sumEven += i
    i += 2
  }
  return sumEven
}

fun main() {
  println(sumOfEven(10))  // 30
}