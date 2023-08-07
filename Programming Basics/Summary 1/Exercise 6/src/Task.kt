// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var i = 1
  for (c in s) {
    if (c != ' ' && i % 5 == 0) println(c)
    if (c != ' ') i++
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/