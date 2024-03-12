// NullableTypes/ExplicitCheck.kt
import atomictest.eq

fun main() {
  val s: String? = "abc"
  // nullable type을 역참조해도 NPE가 발생하지 않도록 보장하는 가장 단순한 방법:
    // if 검사
  if (s != null)
    s.length eq 3
}