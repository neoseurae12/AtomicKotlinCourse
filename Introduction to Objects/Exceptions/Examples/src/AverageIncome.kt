// Exceptions/AverageIncome.kt
package firstversion
import atomictest.*

fun averageIncome(income: Int, months: Int) =
  income / months

fun main() {
  averageIncome(3300, 3) eq 1100
  capture {
    averageIncome(5000, 0)
  } eq "ArithmeticException: / by zero"
  // [1] ArithmeticException 예외를 던짐
    // 왜 오류가 발생했는지에 대해 아무런 정보를 주지 않는다.
}