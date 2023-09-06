// Destructuring/Computation.kt
package destructuring
import atomictest.eq

// data 클래스 ☞ 구조 분해 선언을 자동으로 지원
data class Computation(
  val data: Int,
  val info: String
)

// data 클래스를 반환하는 것이, Pair 클래스를 반환하는 것보다 낫다.
fun evaluate(input: Int) =
  if (input > 5)
    Computation(input * 2, "High")
  else
    Computation(input * 2, "Low")

fun main() {
  val (value, description) = evaluate(7)
  value eq 14
  description eq "High"
}