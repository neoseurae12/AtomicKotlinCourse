// LoopingAndRanges/ForWithRanges.kt

fun showRange(r: IntProgression) {  // IntProgression : 정수 수열, 코틀린 기본 제공 타입
  for (i in r) {
    print("$i ")
  }
  print("    // $r")
  println()
}

fun main() {  // showRange()에 전달하는 범위 r의 값
  showRange(1..5)
  showRange(0 until 5)
  showRange(5 downTo 1)          // [1] downTo : '역방향' 이터레이션
  showRange(0..9 step 2)         // [2] step : '간격' (1이 아닌 값으로 조정 가능)
  showRange(0 until 10 step 3)   // [2],[3] step을 until과 downTo와 함께 사용할 수 있다
  showRange(9 downTo 2 step 3)
}
/* Output:    // IntProgression을 '표준' 형태로 변환해 String으로 변환한 결과 (위의 'showRange()에 전달하는 범위 r의 값'과 다른 경우가 많다.)
1 2 3 4 5     // 1..5
0 1 2 3 4     // 0..4
5 4 3 2 1     // 5 downTo 1 step 1
0 2 4 6 8     // 0..8 step 2
0 3 6 9     // 0..9 step 3
9 6 3     // 9 downTo 3 step 3
*/