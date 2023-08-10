// Constructors/Task1.kt
package constructorsExercise1

class Floating(val d: Double) {
  override fun toString(): String {
    return d.toString()
  }
}

fun main() {
  val f = Floating(10.5)
  println(f)
}