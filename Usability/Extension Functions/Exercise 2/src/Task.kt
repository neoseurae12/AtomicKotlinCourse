// ExtensionFunctions/Task2.kt
package extensionFunctionsExercise2
import atomictest.eq

fun Int.isOdd(): Boolean = this % 2 != 0  // 또는 this % 2 == 1

fun Int.isEven(): Boolean = this % 2 == 0 // 또는 !isOdd()

fun main() {
  1.isOdd() eq true
  2.isEven() eq true
  13.isEven() eq false
}