// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  var sumEven = 0
  for (i in 0..n step 2) {
    sumEven += i
  }
  return sumEven
}

fun main() {
  println(sumOfEven(10))  // 30
}