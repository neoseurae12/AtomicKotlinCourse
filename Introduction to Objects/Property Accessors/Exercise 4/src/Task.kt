// PropertyAccessors/Task4.kt
package propertyAccessorsExercise4
import atomictest.eq

class AccessCounter {
  private var _accesses: Int = 0
  // The Kotlin style guide recommends naming auxiliary properties with a leading underscore.

  val accesses: Int
    get() = ++_accesses
}

fun main() {
  val counter = AccessCounter()
  counter.accesses eq 1
  counter.accesses eq 2
  counter.accesses eq 3

  val counter2 = AccessCounter()
  repeat(10) {
    counter2.accesses
  }
  counter2.accesses eq 11
}