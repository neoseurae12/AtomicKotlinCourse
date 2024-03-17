// NonNullAssertions/NonNullAssertCall.kt
import atomictest.eq

fun main() {
  val s: String? = "abc"
  s!!.length eq 3 // 보통 널 아님 단언(!!)은 '역참조'와 함께 사용함
}