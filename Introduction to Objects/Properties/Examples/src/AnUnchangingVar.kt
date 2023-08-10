// Properties/AnUnchangingVar.kt

class Sofa {
  val cover: String = "Loveseat cover"  // 객체의 상태 변경 X
                                          // => "불변 객체"
}

fun main() {
  var sofa = Sofa() // 새 객체의 대입 O
  // Not allowed:
  // sofa.cover = "New cover"
  // Reassigning a var:
  sofa = Sofa()
}