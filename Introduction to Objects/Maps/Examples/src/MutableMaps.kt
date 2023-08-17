// Maps/MutableMaps.kt
import atomictest.eq

fun main() {
  val m =
    mutableMapOf(5 to "five", 6 to "six") // 가변 Map
  m[5] eq "five"
  m[5] = "5ive"               // key와 연관된 value의 추가 및 변경
  m[5] eq "5ive"
  m += 4 to "four"            // 키-값 쌍의 명시적인 추가
  m eq mapOf(5 to "5ive",     // 읽기 전용 Map
    4 to "four", 6 to "six")
}