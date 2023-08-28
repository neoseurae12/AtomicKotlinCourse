// Overloading/WithoutDefaultArguments.kt
package withoutdefaultarguments
import atomictest.eq

// 안 좋은 예
  // 코틀린은 디폴트 인자를 지원함에도 불구하고, 오버로딩을 사용해 디폴트 인자를 흉내내고 있음

fun f(n: Int) = n + 373
fun f() = f(0)

fun main() {
  f() eq 373
}