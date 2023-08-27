// NamedAndDefaultArgs/CreateString2.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3)
  // 비실용적인 코드 (∵ 파라미터의 순서를 외우고 있지 않은 한 알아내기 어렵다)
  list.joinToString(". ", "", "!") eq
    "1. 2. 3!"
  // 실용적인 코드
  list.joinToString(separator = ". ",
    postfix = "!") eq "1. 2. 3!"
}