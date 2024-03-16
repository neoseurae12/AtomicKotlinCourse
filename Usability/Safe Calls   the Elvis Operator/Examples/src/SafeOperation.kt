// SafeCallsAndElvis/SafeOperation.kt
package safecalls
import atomictest.trace

fun String.echo() {
  trace(uppercase())
  trace(this)
  trace(lowercase())
}

fun main() {
  val s1: String? = "Howdy!"
  s1?.echo()                  // [1] 수신 객체가 null이 아닌 경우 => 연산을 수행함
  val s2: String? = null
  s2?.echo()                  // [2] 수신 객체가 null인 경우 => 아무 일도 안 하고 null을 반환함
  trace eq """
    HOWDY!
    Howdy!
    howdy!
  """
}