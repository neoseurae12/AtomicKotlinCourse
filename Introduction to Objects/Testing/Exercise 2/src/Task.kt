// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(2, 3, 5) eq 10                          // 10
  sum(2, 3, 5) neq 30                         // 10

  sum(100, 200, 300) eq 600                   // 600
  sum(100, 200, 300) neq 6_000_000            // 600

  sum(-200, 100, 100) eq 0                    // 0
  sum(-200, 100, 100) neq 1                   // 0

  sum(-500, 100, 200) eq -200                 // -200
  sum(-500, 100, 200) neq 0                   // -200

  sum(Int.MAX_VALUE, 1, 1) eq Int.MAX_VALUE+2    // -2147483647
  sum(Int.MAX_VALUE, 1, 1) neq -100              // -2147483647
}