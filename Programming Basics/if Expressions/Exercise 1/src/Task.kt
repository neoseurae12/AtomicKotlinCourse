// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String =
  if (number > 0 )  // 본문이 단 한 줄이라 중괄호를 안 쳐도,
    "positive"
  else if (number == 0)
    "zero"
  else {  // 쳐도, 모두 OK
    "negative"
  }

fun main() {
  println(checkSign(-19))  // negative
}