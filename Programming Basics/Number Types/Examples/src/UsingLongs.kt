// NumberTypes/UsingLongs.kt

fun main() {
  // Long의 위치와 상관없이, 피연산자 중 하나가 Long 타입이기만 하면, 그 결과 타입도 Long 타입.
  val i = Int.MAX_VALUE
  println(0L + i + i)              // [1]
  println(1_000_000 * 1_000_000L)  // [2]
}
/* Output:
4294967294
1000000000000
*/