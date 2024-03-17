// NonNullAssertions/ValueFromMap.kt
import atomictest.capture
import atomictest.eq

fun main() {
  // 널 아님 단언 -- 꼭 필요할 때만 사용하고, 웬만하면 사용을 자제하라.
  // '안전한 호출 & 자세한 예외를 반환하는 특별한 함수' 또는 '명시적인 null 검사'를 권장한다.

  // 널 아님 단언이 도입된 이유
    // 1. 코틀린과 자바가 상호 작용하는 경우
    // 2. 아주 드물지만, 코틀린이 널 가능성을 제대로 검사하지 못하는데 대상이 null이 아님을 알 수 있는 경우

  val map = mapOf(1 to "one")
  map[1]!!.uppercase() eq "ONE"
  map.getValue(1).uppercase() eq "ONE"
  // 프로그램 로직에서 Map에 특정 키가 꼭 존재해야 하고
  // 키가 없을 경우 아무 일도 일어나지 않는 것보다는 예외가 발생하는 편이 좋다고 가정 시
  capture {
    map[2]!!.uppercase()
  } eq "NullPointerException" // '각괄호 + 널 아님 단언' 보다는 ..
  capture {
    map.getValue(2).uppercase()
  } eq "NoSuchElementException: " +
    "Key 2 is missing in the map."  // .. NoSuchElementException이라는 자세한 예외를 반환하는 getValue() 함수를 사용하길 권장한다.
}