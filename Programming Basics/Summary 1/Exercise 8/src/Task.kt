// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
//  var result = ""
//  var decimal = number
//  while (decimal > 0) {
//    result += (decimal % 10).toString()
//    decimal /= 10
//  }
//
//  return result.toInt()

  // 위의 코드가 '오답'인 이유:
    // input이 0일 경우에 에러가 발생하기 때문이다.

  var result = 0
  var decimal = number  // number는 val이기 때문에 number를 decimal로 따로 받아서 조작해야 한다.

  while (decimal > 0) {
    result *= 10
    result += decimal % 10
    decimal /= 10
  }

  return result
}

fun main() {
  println(reverseDecimal(1234))  // 4321
  println(reverseDecimal(0))
}