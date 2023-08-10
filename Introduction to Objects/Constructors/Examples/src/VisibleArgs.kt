// Constructors/VisibleArgs.kt

class MutableNameAlien(var name: String)  // 프로퍼티 => 생성자 밖에서도 접근 가능
                                            // '암시적' 클래스 본문
                                            // var => 가변 프로퍼티

class FixedNameAlien(val name: String)      // val => 불변 프로퍼티

fun main() {
  val alien1 =
    MutableNameAlien("Reverse Giraffe")
  val alien2 =
    FixedNameAlien("Krombopulos Michael")

  alien1.name = "Parasite"
  // Can't do this:
  // alien2.name = "Parasite"
}