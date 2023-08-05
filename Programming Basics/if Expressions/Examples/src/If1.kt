// IfExpressions/If1.kt

fun main() {
  if (1 > 0)  // 결과값이 'Boolean'(true/false)인 '식'을 대입해도 OK
    println("It's true!")
  if (10 < 11) {
    println("10 < 11")
    println("ten is less than eleven")
  }
}
/* Output:
It's true!
10 < 11
ten is less than eleven
*/