// SafeCallsAndElvis/ElvisCall.kt
package safecalls
import atomictest.eq

fun checkLength(s: String?, expected: Int) {
  // 보통은 '엘비스 연산자'를 '안전한 호출' 다음에 사용한다.
    // 안전한 호출이 null 수신 객체에 대해 만들어내는 null 대신 디폴트 값을 제공하기 위함
  val length1 =
    if (s != null) s.length else 0    // [1]
  val length2 = s?.length ?: 0        // [2] [1]과 같은 효과를 낸다.
  length1 eq expected
  length2 eq expected
}

fun main() {
  checkLength("abc", 3)
  checkLength(null, 0)
}