// Packages/PythagoreanTheorem.kt
package pythagorean       // package 키워드  // 좋은 스타일: 패키지 이름과 패키지 파일이 들어 있는 디렉터리의 경로를 똑같이 하는 것
import kotlin.math.sqrt   // import 키워드

class RightTriangle(  // 소스 코드 파일 이름과 '다른' 클래스 이름
  val a: Double,
  val b: Double
) {
  fun hypotenuse() = sqrt(a * a + b * b)
  fun area() = a * b / 2
}