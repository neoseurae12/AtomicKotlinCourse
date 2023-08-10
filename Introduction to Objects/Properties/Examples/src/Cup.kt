// Properties/Cup.kt

// 프로퍼티 => 클래스에 속한 var/val

class Cup {
  var percentFull = 0
}

fun main() {
  val c1 = Cup()
  c1.percentFull = 50   // 각각의 객체 => 프로퍼티를 저장할 자신만의 공간을 따로 할당받음
  val c2 = Cup()
  c2.percentFull = 100

  // 프로퍼티 => 객체의 상태 유지
  println(c1.percentFull)
  println(c2.percentFull)
} 
/* Output:
50
100
*/