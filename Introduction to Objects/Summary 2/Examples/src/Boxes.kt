// Summary2/Boxes.kt
package summary2
import atomictest.*

private var count = 0                   // [1] private 프로퍼티

private class Box(val dimension: Int) { // [2] private 클래스
  fun volume() =
    dimension * dimension * dimension
  override fun toString() =
    "Box volume: ${volume()}"
}

private fun countBox(box: Box) {        // [3] private 함수
  trace("$box")
  count++
}

fun countBoxes() {
  countBox(Box(4))
  countBox(Box(5))
}

fun main() {
  countBoxes()
  trace("$count boxes")
  trace eq """
    Box volume: 64
    Box volume: 125
    2 boxes
  """
}