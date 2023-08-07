// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int): Int = a + b

fun g(s1: String, s2: String): String = s1 + s2

fun h() = println("h()")

fun main() {
  val fVal: Int = f(1, 3)
  val gVal: String = g("can", "not")
  val hVal: Unit = h()

  println("Int")
  println("String")
  println("Unit")
}