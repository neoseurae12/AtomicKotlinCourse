// Varargs/ListOf.kt
import atomictest.eq

fun main() {
  listOf(1) eq "[1]"
  listOf("a", "b") eq "[a, b]"  // listOf(): 임의의 길이로 인자 목록을 받을 수 있는 함수
}