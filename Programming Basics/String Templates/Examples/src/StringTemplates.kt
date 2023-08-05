// StringTemplates/StringTemplates.kt

fun main() {
  val answer = 42
  println("Found $answer!")     // [1] 식별자 O => 값 치환
  println("printing a $1")      // [2] 식별자 X => 아무 일도 없음
}
/* Output:
Found 42!
printing a $1
*/