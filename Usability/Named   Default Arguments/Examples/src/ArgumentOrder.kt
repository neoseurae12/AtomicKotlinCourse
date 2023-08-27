// NamedAndDefaultArgs/ArgumentOrder.kt
import atomictest.eq
import color1.color

fun main() {
  color(blue = 0, red = 99, green = 52) eq    // 인자 순서 변경 (모든 인자에 이름 붙여야 함)
    "(99, 52, 0)"
  color(red = 255, 255, 0) eq     // 인자 이름을 '부분적으로' 적용
    "(255, 255, 0)"
}