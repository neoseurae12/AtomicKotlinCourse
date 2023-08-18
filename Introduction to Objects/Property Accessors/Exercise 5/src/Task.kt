// PropertyAccessors/Task5.kt
package propertyAccessorsExercise5
import atomictest.eq

// Converting between Property and Function
  // => intention list(⌥ ⏎) -> Convert property to function 또는 Convert function to property

class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  fun getCapacity(): Int = maxCapacity - hamsters.size

  fun getFull(): Boolean = hamsters.size == maxCapacity

  fun put(hamster: Hamster): Boolean =
    if (getFull())
      false
    else {
      hamsters += hamster
      true
    }

  fun takeHamster(): Hamster =
    hamsters.removeAt(0)
}

fun main() {
  val cage = Cage(maxCapacity = 2)
  cage.getFull() eq false
  cage.getCapacity() eq 2
  cage.put(Hamster("Alice")) eq true
  cage.put(Hamster("Bob")) eq true
  cage.getFull() eq true
  cage.getCapacity() eq 0
  cage.put(Hamster("Charlie")) eq false
  cage.takeHamster()
  cage.getCapacity() eq 1
}