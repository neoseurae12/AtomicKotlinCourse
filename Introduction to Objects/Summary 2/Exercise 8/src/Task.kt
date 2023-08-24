// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
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
).map{(k, v) -> v to k}.toMap() // 키랑 값을 서로 교체함

fun convertFromRoman(roman: String): Int {
  var result: Int = 0

  /** 내 답안
  var remainRoman = roman

  while (remainRoman != "") {     // 거의 뭐 brute force...
    for ((k, v) in romanNumeralToIntMap) {
      if (remainRoman.startsWith(k)) {
        remainRoman = remainRoman.removeRange(0 until k.length)
        result += v

        break
      }
    }
  }
  */


  // 로마 숫자는 아래와 같이 변경하는 메커니즘이 별도로 있다고 함.
  var max = 0

  for (romanNumeral in roman.reversed()) {    // '뒤' 글자부터 숫자로 변경 (<--)
    val int = romanNumeralToIntMap.getValue("$romanNumeral")
    if (int >= max) {   // 뒷 글자보다 '그 이상'이면 덧셈(+) 연산
      result += int
      max = int           // max 갱신
    } else {            // 뒷 글자보다 '미만'이면 뺄셈(-) 연산
      result -= int
    }
  }

  return result
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}