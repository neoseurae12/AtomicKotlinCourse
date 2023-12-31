// Constructors/Task4.kt
package constructorsExercise4

// automatically generate the toString() member function => ⌘ N

class Human(
  val name: String,
  val age: Int
) {
  override fun toString(): String {
    return "Human(name='$name', age=$age)"
  }
}

fun main() {
  val human = Human("Rick", 70)
  println(human)
}
/* Output:
Human(name='Rick', age=70)
*/