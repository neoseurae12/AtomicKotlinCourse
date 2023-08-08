// ObjectsEverywhere/IntRanges.kt

// 해결하려는 문제의 '명사'를 찾아내어 이 명사를 '객체'로 변환한다.
// 객체: 데이터 저장 (by 프로퍼티) + 동작 수행 (by 함수)
// 코틀린: 객체 지향 + 함수형 ; 하이브리드 언어

fun main() {
  val r1 = IntRange(0, 10)
  val r2 = IntRange(5, 7)
  // '같은' 클래스 ⇉ '별도의' 객체 (인스턴스)

  println(r1)
  println(r2)
}
/* Output:
0..10
5..7
*/