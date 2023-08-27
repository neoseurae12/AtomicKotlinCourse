// NamedAndDefaultArgs/Color2.kt
package color2
import atomictest.eq

fun color(  // 디폴트 인자
  red: Int = 0,
  green: Int = 0,
  blue: Int = 0,  // 덧붙은 콤마
) = "($red, $green, $blue)"

fun main() {
  color(139) eq "(139, 0, 0)"
  color(blue = 139) eq "(0, 0, 139)"
  color(255, 165) eq "(255, 165, 0)"
  color(red = 128, blue = 128) eq
    "(128, 0, 128)"
}