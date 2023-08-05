// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  (((hours * 60L + minutes) * 60) + seconds) * 1000
  // 오버플로우 발생: 1000L * (hours * 60 * 60 + minutes * 60 + seconds)

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}