// ExpressionsStatements/Confusing.kt

fun main() {
  var i = 1
  println(i++ + ++i)  // 예상: 4 (정답!)
}