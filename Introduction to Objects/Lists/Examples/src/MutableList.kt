// Lists/MutableList.kt
import atomictest.eq

fun main() {
  val list = mutableListOf<Int>() // 가변 List

  // 상태 변화의 함수
  list.add(1)
  list.addAll(listOf(2, 3))

  // += 연산
  list += 4
  list += listOf(5, 6)

  list eq listOf(1, 2, 3, 4, 5, 6)
}