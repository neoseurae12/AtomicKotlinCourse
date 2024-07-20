// IntroGenerics/RigidHolder.kt
package introgenerics
import atomictest.eq

data class Automobile(val brand: String)

// 정확한 타입의 파라미터 (`Automobile`) => '하나의' 객체만을 담을 수 있음
  // 단점: 재사용성이 그다지 좋지 않음
class RigidHolder(private val a: Automobile) {
  fun getValue() = a
}

fun main() {
  val holder = RigidHolder(Automobile("BMW"))
  holder.getValue() eq
    "Automobile(brand=BMW)"
}