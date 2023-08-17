// Sets/MutableSet.kt
import atomictest.eq

fun main() {
  val mutableSet = mutableSetOf<Int>()  // 가변 Set
  mutableSet += 42
  mutableSet += 42
  mutableSet eq setOf(42)               // 읽기 전용 Set
  mutableSet -= 42
  mutableSet eq setOf<Int>()
}