// Overloading/WithDefaultArguments.kt
package withdefaultarguments
import atomictest.eq

// 좋은 예
  // 코틀린이 지원하는 디폴트 인자를 적절히 잘 사용하고 있음

fun f(n: Int = 0) = n + 373

fun main() {
  f() eq 373
}