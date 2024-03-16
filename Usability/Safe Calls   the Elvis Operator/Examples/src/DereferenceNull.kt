// SafeCallsAndElvis/DereferenceNull.kt

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length        // [1] nullable type의 참조를 단순히 역참조할 수 없다.
  // nullable type을 처리하는 접근 방법 (2가지)
    // 1) 안전한 호출(safe call; ?.)
    // 2) 널 아닌 단언(non-null asserted;; !!.)
}