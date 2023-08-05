// NumberTypes/LongConstants.kt

fun main() {
  val i = 0          // Infers Int
  // 코틀린의 Long 타입 : 64 비트 (8 바이트) (Int의 2배)
  val l1 = 0L        // i) L creates Long
  val l2: Long = 0   // ii) Explicit type
  println("$l1 $l2")
}
/* Output:
0 0
*/