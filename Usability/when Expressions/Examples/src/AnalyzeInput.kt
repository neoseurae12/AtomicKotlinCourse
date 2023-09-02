// WhenExpressions/AnalyzeInput.kt
package whenexpressions
import atomictest.trace

class Coordinates {
  var x: Int = 0
    set(value) {
      trace("x gets $value")
      field = value
    }
  var y: Int = 0
    set(value) {
      trace("y gets $value")
      field = value
    }
  override fun toString() = "($x, $y)"
}

fun processInputs(inputs: List<String>) {
  val coordinates = Coordinates()
  for (input in inputs) {
    when (input) {                   // [1] 비교 & 선택
      "up", "u" -> coordinates.y--   // [2] 콤마(,) ☞ 하나의 가지에 여러 값을 나열 가능
      "down", "d" -> coordinates.y++
      "left", "l" -> coordinates.x--
      "right", "r" -> {              // [3] 블록 ☞ 화살표 오른쪽에 해당 가지에서 수행해야 할 여러 동작을 표현
        trace("Moving right")
        coordinates.x++
      }
      "nowhere" -> {}                // [4] 빈 중괄호({}) ☞ '아무 일도 하지 않음'을 표현
      "exit" -> return               // [5] return ☞ when 문의 가지에서 자신을 둘러싼 함수를 반환 가능
      else -> trace("bad input: $input")
    }
  }
}

fun main() {
  processInputs(listOf("up", "d", "nowhere",
    "left",  "right", "exit", "r"))
  trace eq """
    y gets -1
    y gets 0
    x gets -1
    Moving right
    x gets 0
  """
}