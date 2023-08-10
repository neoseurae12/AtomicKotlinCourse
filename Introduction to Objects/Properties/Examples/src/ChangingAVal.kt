// Properties/ChangingAVal.kt

// 가변성: '내부' 상태를 바꿀 수 있다

class House {
  var sofa: String = ""   // 객체의 상태 변경 O
                            // => "가변 객체"
}

fun main() {
  val house = House() // 새 객체의 대입 X
  house.sofa = "Simple sleeper sofa: $89.00"
  println(house.sofa)
  house.sofa = "New leather sofa: $3,099.00"
  println(house.sofa)
  // Cannot reassign the val to a new House:
  // house = House()
}
/* Output:
Simple sleeper sofa: $89.00
New leather sofa: $3,099.00
*/