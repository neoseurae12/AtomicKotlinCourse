// NonNullAssertions/NonNullAssert.kt
import atomictest.capture
import atomictest.eq

fun main() {
  var x: String? = "abc"
  x!! eq "abc"
  x = null
  capture {
    val s: String = x!! // 코틀린이 x에 대해 알고 있는 내용을 무시하고 널이 될 수 없는 타입의 참조인 s에 그냥 대입하도록 명령함
  } eq "NullPointerException" // 이런 경우에서 x가 null이라면 => NullPointerException 을 던지게 하는 지원 기능 있음
}