// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
  val side1: Double = 1.0,      // val 로 설정해보겠다
  val side2: Double = 2.0,
  var color: String = "yellow", // var 로 설정해보겠다
) {
  override fun toString(): String {
    return "$color rectangle $side1 x $side2"
  }
}

fun main() {
  println(Rectangle())

  // Without argument names
  println(Rectangle(1.1))
  println(Rectangle(1.1, 2.2, "blue"))

  // Mixed positional and named arguments
  println(Rectangle(1.1, 2.2, color = "blue"))
  println(Rectangle(side1 = 1.1, side2 = 2.2, "blue"))

  // Names for all arguments
  println(Rectangle(color = "blue"))
  println(Rectangle(side1 = 1.1, side2 = 2.2, color = "blue"))
  println(Rectangle(side1 = 2.0))       // val 변수여도 OK.
                                          // 기존의 값을 변경하는 게 아니라, 애초부터 디폴트가 아닌 값으로 생성하는 거다.
}