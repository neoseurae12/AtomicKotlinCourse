// Destructuring/Task1.kt
package destructuringDeclarationsExercise1
import atomictest.eq

fun calculate(
  n1: Int, n2: Int
): Triple<Boolean, Int, Int> {
  /** 아잇... 중복적인 코드 (여기서는 return의 중복..) 쓰지 말라니까 그러네
  if (n1 < 0 || n2 < 0) {
    return Triple(false, 0,0)
  } else {
    return Triple(true, n1 + n2, n1 * n2)
  }
   */

  return if (n1 < 0 || n2 < 0) Triple(false, 0,0)
    else Triple(true, n1 + n2, n1 * n2)
}

fun main() {
    val result = calculate(5, 7)
    result.first eq true
    result.second eq 12
    result.third eq 35
    val (success, plus, multiply) =
            calculate(11, 13)
    success eq true
    plus eq 24
    multiply eq 143
}