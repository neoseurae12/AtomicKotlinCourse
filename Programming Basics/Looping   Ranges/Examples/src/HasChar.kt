// LoopingAndRanges/HasChar.kt

fun hasChar(s: String, ch: Char): Boolean {
  // hasChar() 함수을 작성할 필요없이, 코틀린이 제공하는 기본 구문을 사용해 문자가 문자열에 있는지 검사할 수 있음
  for (c in s) {
    if (c == ch) return true
  }
  return false
}

fun main() {
  println(hasChar("kotlin", 't'))
  println(hasChar("kotlin", 'a'))
}
/* Output:
true
false
*/