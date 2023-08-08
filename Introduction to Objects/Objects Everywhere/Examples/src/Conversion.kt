// ObjectsEverywhere/Conversion.kt

fun main() {
  val s = "123"
  println(s.toInt())  // 수 타입 사이의 변환 => 코틀린에서는 '명시적으로' 해야 한다!
  val i = 123
  println(i.toString())
}
/* Output:
123
123
*/