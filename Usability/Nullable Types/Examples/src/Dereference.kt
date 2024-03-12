// NullableTypes/Dereference.kt
import atomictest.eq

fun main() {
  val s1: String = "abc"
  val s2: String? = s1

  // 역참조(dereference): 멤버 프로퍼티 또는 멤버 함수에 접근
  s1.length eq 3         // [1] non-nullable type => 역참조 가능
  // Doesn't compile:
  // s2.length           // [2] nullable type => 역참조 불가능
}