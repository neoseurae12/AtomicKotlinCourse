// Properties/Task3.kt
package propertiesExercise3

// 너무 좋은 코드...

class Robot {
  var x = 0
  var y = 0
  val fieldSize = 100   // 100이라고 직접 쓰지 말고, fieldSize라는 변수를 적극 사용할 것

  fun borderLooping(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    // 아래의 표현이 원래 나의 표현(→)보다 더 나음: if () {return A} else {return B}
      // return의 반복을 피할 것
    return if (inBounds >= 0) {
      inBounds
    } else {
      fieldSize + inBounds
    }
  }

  // 표현의 일관성을 보일 것
  // 공통되지만 다른 동작은 borderLooping() 함수로 따로 빼서 처리할 것

  fun right(steps: Int) {
    x += steps
    x = borderLooping(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = borderLooping(x)
  }

  fun down(steps: Int) {
    y += steps
    y = borderLooping(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = borderLooping(y)
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/