// NumberTypes/IntegerOverflow.kt

fun main() {
  val i: Int = Int.MAX_VALUE  // 코틀린의 Int 타입 : 32 비트 (4 바이트)
  println(i + i)  // 오버플로우 발생
                  // 코틀린: 오버플로우 발생을 '경고'만 해주고, 오버플로우 발생을 막는 것은 '개발자의 몫'이다!
}
/* Output:
-2
*/