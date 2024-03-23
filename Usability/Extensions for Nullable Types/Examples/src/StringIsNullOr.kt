// NullableExtensions/StringIsNullOr.kt
import atomictest.eq

fun main() {
  /*
  널이 될 수 있는 타입의 확장 함수
  => 안전한 호출 또는 null 여부 검사를 사용하지 않고도 호출 가능
  - 장점: 가독성이 좋다.
  - 단점: 널 가능성을 감춰 코드를 읽는 독자를 혼란스럽게 할 수 있다.
   */

  val s1: String? = null      // s1 => nullable type
  s1.isNullOrEmpty() eq true  // BUT 안전한 호출 또는 null 여부 검사를 하지 않고 있다
  s1.isNullOrBlank() eq true  // 이유: nullable type에 대한 '확장 함수'

  val s2 = ""
  s2.isNullOrEmpty() eq true
  s2.isNullOrBlank() eq true

  val s3: String = " \t\n"
  s3.isNullOrEmpty() eq false // isNullOrEmpty() => null 또는 빈 문자열인지 검사
  s3.isNullOrBlank() eq true  // isNullOrBlank() => isNullOrEmpty() + 공백 문자(공백, \t, \n)
}