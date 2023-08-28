// Overloading/MemberVsExtension.kt
package overloading
import atomictest.eq

// 우선순위 (시그니처가 중복된다는 가정 하):
  // 멤버 함수 >>> 확장 함수

class My {
  fun foo() = 0
}

fun My.foo() = 1             // [1] 멤버 함수와 시그니처가 중복되는 확장 함수는 결코 호출될 수 없다.

fun My.foo(i: Int) = i + 2   // [2] 파라미터 목록을 달리함으로써 멤버 함수를 확장 함수로 오버로딩할 수 있다.

fun main() {
  My().foo() eq 0
  My().foo(1) eq 3
}