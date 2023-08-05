// StringTemplates/TripleQuotes.kt

fun main() {
  val s = "value"
  println("s = \"$s\".")  // \ (백슬래쉬; 이스케이프 문자) 사용
  println("""s = "$s".""")  // 트리플 쌍따옴표 사용
}
/* Output:
s = "value".
s = "value".
*/