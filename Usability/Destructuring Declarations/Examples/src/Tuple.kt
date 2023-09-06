// Destructuring/Tuple.kt
package destructuring
import atomictest.eq

// data 클래스를 반환하는 것이, Pair 클래스를 반환하는 것보다 낫다.
data class Tuple(
  val i: Int,
  val d: Double,
  val s: String,
  val b: Boolean,
  val l: List<Int>
)

fun main() {
  val tuple = Tuple(
    1, 3.14, "Mouse", false, listOf())
  val (i, d, s, b, l) = tuple
  i eq 1
  d eq 3.14
  s eq "Mouse"
  b eq false
  l eq listOf()

  val (_, _, animal) = tuple   // [1] 구조 분해 선언으로 선언할 식별자 중 일부가 필요하지 않은 경우
  animal eq "Mouse"
}