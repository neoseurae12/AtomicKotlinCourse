// Properties/Task4.kt
package propertiesExercise4

/*
When a constant appears in multiple places in your code, it's wise to extract it into a property.
It's better to place constants in val, so they are easy to change.
If the requirements change, it's error-prone to change the constant in more than one place.
It's too easy to change it in one place and forget to change elsewhere, which can lead to difficult-to-find bugs.
 */

class Counter {
  var value = 0

  private val sumConstant = 10  // Extract Property => ⌥ ⌘ F

  fun inc() {
    value += sumConstant
  }

  fun dec() {
    value -= sumConstant
  }
}