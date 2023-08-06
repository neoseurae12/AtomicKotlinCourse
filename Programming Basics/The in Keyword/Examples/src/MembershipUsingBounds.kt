// InKeyword/MembershipUsingBounds.kt

fun main() {
  val percent = 35
  println(0 <= percent && percent <= 100)
  println(percent in 0..100)          // 위의 표현과 논리적으로 동일. BUT 더 나은 표현. 심지어 실행 속도도 거의 같음.
}
/* Output:
true
*/