// Packages/FullyQualify.kt

fun main() {
  // 코드 안에서 임포트한 이름의 패키지 경로를 전부 다 쓴 경우
  println(kotlin.math.PI)
  println(kotlin.math.cos(kotlin.math.PI))
  println(kotlin.math.cos(2 * kotlin.math.PI))
}
/* Output:
3.141592653589793
-1.0
1.0
*/