// Summary1/Task4.kt
package summaryIExercise4

// Let's test 'Long' and 'Double'!

fun testLong() {
  println(Long.MAX_VALUE + 1) // Long의 경우, 오버플로우 발생
}

fun testDouble() {
  println(Double.MAX_VALUE)
  println(Double.MAX_VALUE + 1) // Double의 경우, MAX_VALUE에 아무리 뭘 더해도 MAX_VALUE 값 유지
  println(Double.POSITIVE_INFINITY)
}

fun testDouble2() {
  println(Double.MAX_VALUE == Double.MAX_VALUE + 1) // 놀랍게도.. true
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
1.7976931348623157E308
Infinity
true
 */