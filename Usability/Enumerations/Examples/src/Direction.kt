// Enumerations/Direction.kt
package enumerations
import atomictest.eq
import enumerations.Direction.*

enum class Direction(val notation: String) {  // 생성자
  North("N"), South("S"),
  East("E"), West("W");  // 세미콜론 (꼭 필요)
  val opposite: Direction   // 멤버 프로퍼티 (또는 함수)
    get() = when (this) {   // 게터
      North -> South
      South -> North
      West -> East
      East -> West  // enum class에서는 when 식에서 else 가지 생략 가능
    }
}

fun main() {
  North.notation eq "N"
  North.opposite eq South
  West.opposite.opposite eq West
  North.opposite.notation eq "S"
}