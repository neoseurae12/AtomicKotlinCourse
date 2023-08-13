// Exceptions/Task4.kt
package exceptionsExercise4

// Analyze Stacktrace

fun foo() {
  throw IllegalStateException("something is wrong")
}

fun bar() {
  foo()
}

fun main() {
  bar() // Uncomment this to see exception
}