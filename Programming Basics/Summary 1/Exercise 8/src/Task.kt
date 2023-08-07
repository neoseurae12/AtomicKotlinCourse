// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var result = ""
  var decimal = number
  while (decimal > 0) {
    result += (decimal % 10).toString()
    decimal /= 10
  }

  return result.toInt()
}

fun main() {
  println(reverseDecimal(1234))  // 4321
  println(reverseDecimal(0))
}