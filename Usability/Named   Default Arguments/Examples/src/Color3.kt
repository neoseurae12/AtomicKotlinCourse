// NamedAndDefaultArgs/Color3.kt
package color3
import atomictest.eq

class Color(    // '생성자'에 이름 붙은 인자, 디폴트 인자, 덧붙은 콤마 모두 사용 가능
  val red: Int = 0,
  val green: Int = 0,
  val blue: Int = 0,
) {
  override fun toString() =
    "($red, $green, $blue)"
}

fun main() {
  Color(red = 77).toString() eq "(77, 0, 0)"
}