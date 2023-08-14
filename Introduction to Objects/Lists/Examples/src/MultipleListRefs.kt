// Lists/MultipleListRefs.kt
import atomictest.eq

fun main() {
  val first = mutableListOf(1)    // 가변 객체
  val second: List<Int> = first   // 읽기 전용 객체
                                    // first를 가리키는 alias. 즉, first와 second는 '똑같은' 객체를 가리킨다.
//  val second = first  // List<Int>를 명시하지 않았다면, 코틀린은 second의 타입을 '가변 객체에 대한 참조'로 추론한다.
  second eq listOf(1)

  first += 2

  // second는 변경될 수 없는 List지만, first를 통하면 List의 내부를 변경할 수 있다.
  // 따라서, second도 first에 의해 변경된 내용을 보게 된다:
  second eq listOf(1, 2)
}