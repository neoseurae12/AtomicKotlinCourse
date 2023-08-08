// CreatingClasses/Task2.kt
package creatingClassesExercise2

class Giraffe {
    /*
    나의 첫 답안:
    fun displayID() = println(this.toString().substringAfter("@"))
     */
    fun displayID() = println(toString().substringAfter("@"))
    // this의 생략이 가능하다
}

fun main() {
  /*
  val giraffe1 = Giraffe()
  val giraffe2 = Giraffe()
  val giraffe3 = Giraffe()
  giraffe1.displayID()
  giraffe2.displayID()
  giraffe3.displayID()
  */
}