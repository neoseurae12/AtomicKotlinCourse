// Summary2/Task7.kt
package summaryIIExercise7
import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
  1000 to "M",
  900 to "CM",
  500 to "D",
  400 to "CD",
  100 to "C",
  90 to "XC",
  50 to "L",
  40 to "XL",
  10 to "X",
  9 to "IX",
  5 to "V",
  4 to "IV",
  1 to "I"
)

fun convertToRoman(number: Int): String {
  var result = ""

  /** 나의 답안
  var n = number


  for (d in intToRomanNumeralMap.keys) {    // entry 또는 (int, roman)으로 했으면, 일단 키 & 값 모두 받아둘 수 있었다
    while (n - d >= 0) {                    // 뭘 계속 빼고 있나... 나눗셈으로 처리했으면 될 걸..
      result += intToRomanNumeralMap[d]
      n -= d
    }
  }
  */

  var remainder = number
  for ((int, roman) in intToRomanNumeralMap) {
    val times = remainder / int
    result += roman.repeat(times)   // for, while 말고도 repeat() 함수 이용할 수 있다.
    remainder %= int
  }

  return result
}

fun main() {
  convertToRoman(23) eq "XXIII"
  convertToRoman(44) eq "XLIV"
  convertToRoman(100) eq "C"
  convertToRoman(2018) eq "MMXVIII"
}