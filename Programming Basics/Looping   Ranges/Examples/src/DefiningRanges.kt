// LoopingAndRanges/DefiningRanges.kt

fun main() {
  // '범위'를 나타내는 방법 (2가지)
  val range1 = 1..10         // [1] .. : 양 끝을 '포함 O'
  val range2 = 0 until 10    // [2] until : 오른쪽 끝은 '포함 X'
                                      // ..< 와 동일한 결과.
                                      // 단, ..< 은 실수에 사용 가능하지만, until은 실수에 사용 불가.
  println(range1)
  println(range2)
}
/* Output:
1..10
0..9
*/