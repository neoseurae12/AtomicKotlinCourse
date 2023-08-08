// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var strippedString = ""
  for (c in s) {
    if (c in 'a'..'z' || c in 'A'..'Z') {
      strippedString += c
    }
  }
  return isPalIgnoreCase(strippedString)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}