// Lists/Lists.kt
import atomictest.eq

fun main() {
  val ints = listOf(99, 3, 5, 7, 11, 13)
  ints eq "[99, 3, 5, 7, 11, 13]"   // [1] List => 각괄호([])

  // Select each element in the List:
  var result = ""
  for (i in ints) {                 // [2] in 키워드 => 컨테이너 전체에 대한 이터레이션
                                        // val i라고 정의하거나 i의 타입을 지정할 필요 없음
    result += "$i "
  }
  result eq "99 3 5 7 11 13"

  // "Indexing" into the List:
  ints[4] eq 11                     // [3] 인덱스 => List의 원소 읽기
}