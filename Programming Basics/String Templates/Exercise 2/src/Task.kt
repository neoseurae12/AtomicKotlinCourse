// StringTemplates/Task2.kt
package stringTemplatesExercise2

fun record(index: Int, status: String, message: String): String =
  "$index [$status] $message\n"
  // '변수'일 경우에는 중괄호 생략 가능
  // [] 정도는 트리플 큰 따옴표로 처리할 필요 없이, 하나의 큰 따옴표로 처리 가능

fun main() {
  print(record(1, "OK", "Everything is fine."))
  print(record(2, "Fail", "Something has broken."))
}

/* Output:
1 [OK] Everything is fine.
2 [Fail] Something has broken.
*/