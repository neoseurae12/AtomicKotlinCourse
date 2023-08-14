// Lists/OutOfBounds.kt
import atomictest.*

fun main() {
  val ints = listOf(1, 2, 3)
  capture {
    ints[3]   // List의 마지막 원소의 인덱스보다 더 큰 인덱스를 사용한 경우
  } contains
    listOf("ArrayIndexOutOfBoundsException")  // ArrayIndexOutOfBoundsException 오류 발생
}