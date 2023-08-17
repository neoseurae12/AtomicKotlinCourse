// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val experimentSet = mutableSetOf<Int>()
  var nTimes = 0
  while (experimentSet != (1..25).toSet()) {  // set.size < 25
    experimentSet += Random.nextInt(25) + 1
    nTimes++
  }
  return nTimes
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}