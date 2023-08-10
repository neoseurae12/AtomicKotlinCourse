// Properties/References.kt

class Kitchen {
  var table: String = "Round table"   // 객체의 상태 변경 O
                                        // => "가변 객체"
}

fun main() {
  val kitchen1 = Kitchen()  // 새 객체의 대입 X
  val kitchen2 = kitchen1   // var & val => '객체'가 아니라 "참조"를 제한한다.
                              // var => 참조가 가리키는 대상을 다른 대상으로 다시 엮을 수 있음
                              // val => 다른 대상을 엮을 수 없음
  println("kitchen1: ${kitchen1.table}")
  println("kitchen2: ${kitchen2.table}")
  kitchen1.table = "Square table"
  println("kitchen1: ${kitchen1.table}")
  println("kitchen2: ${kitchen2.table}")
}
/* Output:
kitchen1: Round table
kitchen2: Round table
kitchen1: Square table
kitchen2: Square table
*/