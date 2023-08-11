// Visibility/Cookie.kt

class Cookie(
  private var isReady: Boolean  // [1] private 프로퍼티 => 클래스 밖에서는 접근 불가
) {
  private fun crumble() =       // [2] private 멤버 함수
    println("crumble")

  public fun bite() =           // [3] public 멤버 함수 => 누구나 접근 가능
    println("bite")

  fun eat() {                   // [4] public
    isReady = true              // [5] private 멤버 => 같은 클래스의 멤버만 접근 가능
    crumble()
    bite()
  }
}

fun main() {
  val x = Cookie(false)
  x.bite()
  // Can't access private members:
  // x.isReady
  // x.crumble()
  x.eat()
}
/* Output:
bite
crumble
bite
*/