// NullableTypes/Amphibian.kt
package nullabletypes

class Amphibian

enum class Species {
  Frog, Toad, Salamander, Caecilian
}

fun main() {
  // 새 클래스 정의 => 코틀린이 자동으로 nullable type & non-nullable type을 추가해줌
  val a1: Amphibian = Amphibian()
  val a2: Amphibian? = null
  val at1: Species? = null
  val at2: Species = Species.Toad
}