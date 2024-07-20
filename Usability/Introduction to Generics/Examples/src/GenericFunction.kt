// IntroGenerics/GenericFunction.kt
package introgenerics
import atomictest.eq

// 제네릭 함수의 정의 방법: 부등호로 둘러싼 제네릭 타입 파라미터를 함수 이름 앞에 붙인다.
fun <T> identity(arg: T): T = arg

fun main() {
  identity("Yellow") eq "Yellow"
  identity(1) eq 1
  val d = identity(Dog()) // d 의 타입: Dog
  d.bark() eq "Ruff!"
}