// StringTemplates/StringConcatenation.kt

fun main() {
  val s = "hi\n" // \n is a newline character
  val n = 11
  val d = 3.14
  println("first: " + s + "second: " +
    n + ", third: " + d)  // 문자열 연결 by '+'
}
/* Output:
first: hi
second: 11, third: 3.14
*/