// WhenExpressions/BmiWhen.kt
package whenexpressions
import atomictest.eq

fun bmiMetricOld(
  kg: Double,
  heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun bmiMetricWithWhen(
  kg: Double,
  heightM: Double
): String {
  val bmi = kg / (heightM * heightM)
  return when {   // 인자가 없는 when 식 ☞ 각 매치 가지를 Boolean 조건에 따라 검사한다.
    bmi < 18.5 -> "Underweight"
    bmi < 25 -> "Normal weight"
    else -> "Overweight"
  }
}

fun main() {
  bmiMetricOld(72.57, 1.727) eq
    bmiMetricWithWhen(72.57, 1.727)
}