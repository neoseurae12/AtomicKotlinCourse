// WhenExpressions/MixColors.kt
package whenexpressions
import atomictest.eq

// Set과 Set의 매치

fun mixColors(first: String, second: String) =
  when (setOf(first, second)) {
    setOf("red", "blue") -> "purple"
    setOf("red", "yellow") -> "orange"
    setOf("blue", "yellow") -> "green"
    else -> "unknown"
  }

fun main() {
  mixColors("red", "blue") eq "purple"
  mixColors("blue", "red") eq "purple"  // Set ☞ 원소 순서가 중요하지 않음 => 동일한 결과
  mixColors("blue", "purple") eq "unknown"
}