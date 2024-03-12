// NullableTypes/NullableInMap.kt
import atomictest.eq

fun main() {
  val map = mapOf(0 to "yes", 1 to "no")
  val first: String? = map[0]
  val second: String? = map[2]  // 각괄호([])를 사용한 Map의 값 가져오기 => nullable한 결과 반환
                                  // 이유: 각괄호 연산의 기저 구현인 자바 코드가 nullable한 결과를 반환하기 때문
  first eq "yes"
  second eq null
}