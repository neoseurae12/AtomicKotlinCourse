// IntroGenerics/GenericHolder.kt
package introgenerics
import atomictest.eq

// 타입 파라미터 (`T`) => '여러 다른 타입의' 객체들을 담을 수 있음
  // 제네릭 타입 정의 방법: 클래스 이름 뒤에, 내부에 하나 이상의 제네릭 플레이스홀더가 들어있는 부등호(<>)를 추가한다.
  // T 라는 플레이스홀더
    // 지금은 알 수 없는 어떤 타입을 대신함
    // 제네릭 클래스 안에서는 일반 타입처럼 쓰임
class GenericHolder<T>(               // [1] 타입 파라미터 (`T`)
  private val value: T
) {
  fun getValue(): T = value
}

fun main() {
  val h1 = GenericHolder(Automobile("Ford"))
  val a: Automobile = h1.getValue()   // [2] T => Automobile
  a eq "Automobile(brand=Ford)"

  val h2 = GenericHolder(1)
  val i: Int = h2.getValue()          // [3] T => Int
  i eq 1

  val h3 = GenericHolder("Chartreuse")
  val s: String = h3.getValue()       // [4] T => String
  s eq "Chartreuse"
}