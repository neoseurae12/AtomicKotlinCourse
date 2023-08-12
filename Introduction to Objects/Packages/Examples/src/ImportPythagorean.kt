// Packages/ImportPythagorean.kt
import pythagorean.RightTriangle  // 패키지의 원소 사용 가능

fun main() {
  val rt = RightTriangle(3.0, 4.0)
  println(rt.hypotenuse())
  println(rt.area())
}
/* Output:
5.0
6.0
*/