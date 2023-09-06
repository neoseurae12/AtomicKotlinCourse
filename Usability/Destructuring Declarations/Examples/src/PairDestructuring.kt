// Destructuring/PairDestructuring.kt
import atomictest.eq
import destructuring.compute

fun main() {
  val (value, description) = compute(7) // 구조 분해(destructuring) 선언
  value eq 14
  description eq "High"
}