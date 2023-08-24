// Summary2/ClassBodies.kt
package summary2

class NoBody      // 본문이 없는 클래스

class SomeBody {  // 본문이 있는 클래스
  val name = "Janet Doe"        // String 타입의 프로퍼티
}

class EveryBody {
  val all = listOf(SomeBody(),
    SomeBody(), SomeBody())     // SomeBody 객체들로 이뤄진 List 타입인 프로퍼티
}

fun main() {
  val nb = NoBody()
  val sb = SomeBody()
  val eb = EveryBody()
}