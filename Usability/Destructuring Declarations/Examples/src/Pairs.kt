// Destructuring/Pairs.kt
package destructuring
import atomictest.eq

// Pair 클래스
fun compute(input: Int): Pair<Int, String> =
  if (input > 5)
    Pair(input * 2, "High")   // 2개의 아이템 반환
  else
    Pair(input * 2, "Low")

fun main() {
  compute(7) eq Pair(14, "High")
  compute(4) eq Pair(8, "Low")
  val result = compute(5)
  result.first eq 10      // first 프로퍼티
  result.second eq "Low"  // second 프로퍼티
}