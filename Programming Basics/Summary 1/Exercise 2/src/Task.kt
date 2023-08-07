// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result = ""
  for (idx in 0..s.lastIndex step 2) {
    result += s[idx]
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/