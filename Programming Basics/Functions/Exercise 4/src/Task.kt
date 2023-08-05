// Functions/Task4.kt
package functionsExercise4

/*
fun foo() = "abc" // '식 본문'일 때만 반환 타입을 추론함
*/

fun foo(): String {
  return "abc"
  // '블록 본문'일 때는 반환 타입을 추론하지 않음. \
  // 즉, Unit 타입이 아닌 이상, 반드시 명시해야 함
}

fun main() {
  println(foo())
}