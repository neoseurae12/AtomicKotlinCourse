// InKeyword/Task4.kt
package theInKeywordExercise4

fun isValidCharacter(c: Char): Boolean =
  c in 'A'..'Z' || c in 'a'..'z' ||
          c == '_' ||
          c in '0'..'9'

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty()) return false
  if (s[0] != '_' && s[0] !in 'a'..'z' && s[0] !in 'A'..'Z') return false
  for (c in s) {
    if (!isValidCharacter(c)) return false
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}