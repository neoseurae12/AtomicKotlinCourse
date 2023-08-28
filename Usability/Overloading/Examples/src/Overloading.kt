// Overloading/Overloading.kt
package overloading
import atomictest.eq

class Overloading {
  // 다른 파라미터 목록, 같은 함수 이름
  fun f() = 0
  fun f(n: Int) = n + 2
}

fun main() {
  val o = Overloading()
  o.f() eq 0
  o.f(11) eq 13
}