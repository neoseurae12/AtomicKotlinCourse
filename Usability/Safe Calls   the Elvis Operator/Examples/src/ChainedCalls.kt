// SafeCallsAndElvis/ChainedCalls.kt
package safecalls
import atomictest.eq

class Person(
  val name: String,
  var friend: Person? = null
)

fun main() {
  // 호출을 연쇄시키는 중간에 null이 결과로 나올 수 있는데,
  // 최종 결과에만 관심이 있는 경우 안전한 호출을 사용하면 여러 호출을 간결하게 연쇄시킬 수 있다.

  // 안전한 호출을 사용해 여러 멤버에 대한 접근을 연쇄시키는 경우
    // 중간에 어느 하나라도 null을 내놓으면 전체 결과가 null이 된다.

  val alice = Person("Alice")
  alice.friend?.friend?.name eq null   // [1] alice.friend 에서 null 발생 => 최종 결과: null

  val bob = Person("Bob")
  val charlie = Person("Charlie", bob)
  bob.friend = charlie
  bob.friend?.friend?.name eq "Bob"    // [2] 모든 중간 단계 호출이 null이 아닌 값 반환 => 최종 결과: "Bob"

  (alice.friend?.friend?.name
    ?: "Unknown") eq "Unknown"         // [3] 연쇄 중간에 null 발생 -> 엘비스 연산자 => 최종 결과: "Unknown" (null의 대안값)
}