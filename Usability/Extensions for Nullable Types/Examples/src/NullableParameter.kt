// NullableExtensions/NullableParameter.kt
package nullableextensions
import atomictest.eq

// 비-확장함수 ver.
fun isNullOrEmpty(s: String?): Boolean =
  s == null || s.isEmpty()  // 명시적으로 null 여부 & 빈 문자열 여부 검사 가능
  // 쇼트 서킷(short circuit)
    // ||에서 첫 번째 식이 true면 전체 식이 true로 결정되므로, 두 번째 식은 아예 계산하지 않음
    // 따라서 s.isEmpty()에서, s가 null이어도 NPE 발생 안 함

fun main() {
  isNullOrEmpty(null) eq true
  isNullOrEmpty("") eq true
}