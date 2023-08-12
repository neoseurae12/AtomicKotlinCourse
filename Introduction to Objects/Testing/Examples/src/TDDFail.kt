// Testing/TDDFail.kt
package testing1
import atomictest.eq

// ①(최초 구현) => 실패
  // 아직 기능을 구현하지 않았기 때문

fun main() {
  calculateBMI(160, 68) eq "Normal weight"
//  calculateBMI(100, 68) eq "Underweight"  // [Error]: Normal weight != Underweight
//  calculateBMI(200, 68) eq "Overweight"   // [Error]: Normal weight != Overweight
}

fun calculateBMI(lbs: Int, height: Int) =
  "Normal weight"