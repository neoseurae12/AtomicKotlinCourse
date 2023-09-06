// Destructuring/Task2.kt
package destructuringDeclarationsExercise2
import atomictest.eq

// data 클래스가 아닌 '일반 클래스'을 사용함으로써, 구조 분해 선언 시 발생하는 불편함
  // If you do not define a class as a data class, you must add extra functions to allow that class to be used in a destructuring declaration.
  // Consider how much more work (and visual noise) results from more fields in the class, and how much effort is saved by using data classes.

// (data 클래스가 아닌) 일반 클래스
class Computation(
  val data: Int,
  val info: String,
) {
  // 구조 분해 선언을 위해 필요한 추가적인 함수 작업
  operator fun component1() = data
  operator fun component2() = info
}

fun evaluate(input: Int) =
  if (input > 5)
    Computation(input * 2, "High")
  else
    Computation(input * 2, "Low")

fun main() {
  val (value, description) = evaluate(7)  // 구조 분해 선언
  value eq 14
  description eq "High"
}