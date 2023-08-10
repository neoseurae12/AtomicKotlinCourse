// Constructors/Scientist.kt

class Scientist(val name: String) {
  // 디폴트 toString() 함수 => 그다지 유용하지 않다. 아래와 같이 '직접' 구현이 가능하다.
  // override: 이미 정의되어있는 메서드의 정의를 대신할 진짜 새 정의를 제공하곘다는 뜻
    // - 코드의 의도를 더 명확히 할 수 있고,
    // - 의도치 않게 같은 이름의 함수를 정의하는 등의 실수를 줄일 수 있으며,
    // - 프로그램 오류를 찾고 수정할 때 유용하다 (디버깅)
  override fun toString(): String {
    return "Scientist('$name')"
  }
}

fun main() {
  val zeep = Scientist("Zeep Xanflorp")
  println(zeep)
}
/* Output:
Scientist('Zeep Xanflorp')
*/