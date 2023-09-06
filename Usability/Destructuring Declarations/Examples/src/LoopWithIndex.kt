// Destructuring/LoopWithIndex.kt
import atomictest.trace

fun main() {
  val list = listOf('a', 'b', 'c')
  for ((index, value) in list.withIndex()) {  // withIndex() 함수 -> IndexedValue 타입의 객체
    trace("$index:$value")
  }
  trace eq "0:a 1:b 2:c"
}