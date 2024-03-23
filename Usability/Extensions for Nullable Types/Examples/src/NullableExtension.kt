// NullableExtensions/NullableExtension.kt
package nullableextensions
import atomictest.eq

// 확장함수 ver.
fun String?.isNullOrEmpty(): Boolean =
  this == null || isEmpty()

/*
상황이 단순하고 함수 이름에서 수신 객체가 null일 수 있음을 암시하는 경우 (ex. isNullOrEmpty(), isNullOrBlank())
=> 널이 될 수 있는 타입의 확장 함수가 유용함

일반적인 경우
=> 널이 될 수 "없는" 타입의 확장 함수를 정의하는 편이 나음
 */

fun main() {
  "".isNullOrEmpty() eq true  // 가독성이 좋음
}