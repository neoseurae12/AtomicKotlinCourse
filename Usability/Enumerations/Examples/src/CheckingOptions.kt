// Enumerations/CheckingOptions.kt
package checkingoptions
// Level이라는 이름을 임포트
// Level의 이넘 상수들을 임포트
import atomictest.trace
import enumerations.Level
import enumerations.Level.*

fun checkLevel(level: Level) {  // Level이라는 이름
  when (level) {  // when 식 ☞ enum 항목마다 서로 다른 동작을 수행하도록 가능
    // Level의 이넘 상수들
    Overflow -> trace(">>> Overflow!")
    Empty -> trace("Alert: Empty")
    else -> trace("Level $level OK")
  }
}

fun main() {
  checkLevel(Empty)
  checkLevel(Low)
  checkLevel(Overflow)
  trace eq """
    Alert: Empty
    Level Low OK
    >>> Overflow!
  """
}