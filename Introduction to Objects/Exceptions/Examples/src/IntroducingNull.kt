// Exceptions/IntroducingNull.kt
import atomictest.eq

fun main() {
  "1$".toIntOrNull() eq null  // [3] null을 반환하는 방법
                                // String.toIntOrNull() 함수
}