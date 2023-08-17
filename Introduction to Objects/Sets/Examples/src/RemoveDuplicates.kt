// Sets/RemoveDuplicates.kt
import atomictest.eq

fun main() {
  val list = listOf(3, 3, 2, 1, 2)
  list.toSet() eq setOf(1, 2, 3)      // List에서 중복을 제거하는 방법 (1): Set로 변환
  list.distinct() eq listOf(3, 2, 1)  // List에서 중복을 제거하는 방법 (2): distinct() 함수 호출
  "abbcc".toSet() eq setOf('a', 'b', 'c') // String에 들어 있는 유일한 문자들의 집합을 얻고 싶다면 ☞ toSet() 함수 호출
}