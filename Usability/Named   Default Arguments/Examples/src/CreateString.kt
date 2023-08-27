// NamedAndDefaultArgs/CreateString.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3,)
  list.toString() eq "[1, 2, 3]"      // List의 toString() 디폴트 구현
  list.joinToString() eq "1, 2, 3"    // joinToString() 디폴트 구현
  list.joinToString(prefix = "(",     // joinToString() & 이름 붙은 인자
    postfix = ")") eq "(1, 2, 3)"
  list.joinToString(separator = ":") eq
    "1:2:3"
}