// Testing/TDDStillFails.kt
package testing2
import atomictest.eq

// ② => 실패
  // Double이 아닌 Int를 사용해서, 식의 결과값이 모두 0으로 나오기 때문이다.

fun main() {
  // Everything fails:
//  calculateBMI(160, 68) eq "Normal weight"  // [Error]: Underweight != Normal weight
//  calculateBMI(100, 68) eq "Underweight"
//  calculateBMI(200, 68) eq "Overweight"     // [Error]: Underweight != Overweight
}

fun calculateBMI(
  lbs: Int,     // Double이 아닌 Int 사용
  height: Int
): String {
  // 몸무게가 어느 범주에 속하는지 검사하는 코드 추가
  val bmi = lbs / (height * height) * 703.07
  return if (bmi < 18.5) "Underweight"
  else if (bmi < 25) "Normal weight"
  else "Overweight"
}