// Summary2/ColorSet.kt
package summary2
import atomictest.eq

val colors =
  "Yellow Green Green Blue"
    .split(Regex("""\W+""")).sorted()  // [1] split()과 정규식을 사용해 String을 분할하기

fun main() {
  colors eq
    listOf("Blue", "Green", "Green", "Yellow")
  val colorSet = colors.toSet()        // [2] toSet() => 중복 제거
  colorSet eq
    setOf("Yellow", "Green", "Blue")
  (colorSet + colorSet) eq colorSet    // [3] + 연산 => 두 set를 합한 '새로운' Set 생성
  val mSet = colorSet.toMutableSet()   // [4] toMutableSet() => '새로운' 가변 set 생성
  mSet -= "Blue"
  mSet += "Red"                        // [5] +=/-= 연산 => 원소의 추가/삭제
  mSet eq
    setOf("Yellow", "Green", "Red")
  // Set membership:
  ("Green" in colorSet) eq true        // [6] in, contains() => 집합의 원소인지 검사
  colorSet.contains("Red") eq false
}