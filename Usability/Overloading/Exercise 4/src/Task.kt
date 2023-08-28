// Overloading/Task4.kt
package overloadingExercise4
import atomictest.eq

// Refactor this (⌃T) > Introduce parameter

fun f(n: Int = 0): Int {
  val i = 373
  return n + i
}

fun main() {
  f() eq 373
}