// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var count = 0

  for (c in input) {
    when (c) {
      '(' -> count++
      ')' -> count--
      ' ' -> {}
      else -> throw IllegalArgumentException("The string must consist only of parentheses and whitespace")
    }
    if (count < 0)
      return false
  }

  return count == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false

  //println("(()) ()".trim())
    // trim() => 양끝 공백만을 제거. 즉, 중간에 있는 공백들은 제거 안 함.
}