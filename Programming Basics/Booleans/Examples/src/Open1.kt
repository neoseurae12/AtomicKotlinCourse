// Booleans/Open1.kt

fun isOpen1(hour: Int) {
  val open = 9
  val closed = 20
  println("Operating hours: $open - $closed")
  val status =
    if (hour >= open && hour < closed) // [1] && (논리곱; and)
      true
    else
      false                           // if 식
  println("Open: $status")
}

fun main() = isOpen1(6) // 식 본문 함수
/* Output:
Operating hours: 9 - 20
Open: false
*/