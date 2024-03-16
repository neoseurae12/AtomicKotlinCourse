// SafeCallsAndElvis/ElvisOperator.kt
import atomictest.eq

fun main() {
  // ?.의 결과로 null을 만들어내는 것 이상의 일이 필요하다면?
    // 엘비스(Elvis) 연산자

  val s1: String? = "abc"
  (s1 ?: "---") eq "abc"  // null이 아닌 경우 => 왼쪽 식의 값을 반환

  val s2: String? = null
  (s2 ?: "---") eq "---"  // null인 경우 => 오른쪽 식의 값(null의 대안값)을 반환
}