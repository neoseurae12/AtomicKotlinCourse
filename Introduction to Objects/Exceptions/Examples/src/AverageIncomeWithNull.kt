// Exceptions/AverageIncomeWithNull.kt
package withnull
import atomictest.eq

fun averageIncome(income: Int, months: Int) =
  if (months == 0)
    null    // [2] null을 반환함
              // 함수가 null을 반환할 수 있는 경우, 코틀린은 그 함수의 결과값을 사용하기 전에 null인지 여부를 먼저 검사한다.
  else
    income / months

fun main() {
  averageIncome(3300, 3) eq 1100
  averageIncome(5000, 0) eq null
}