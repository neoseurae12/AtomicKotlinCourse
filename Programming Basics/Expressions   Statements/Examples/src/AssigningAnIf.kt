// ExpressionsStatements/AssigningAnIf.kt

fun main() {
  val result1 = if (11 > 42) 9 else 5 // 'if'는 '문'도, '식'도 될 수 있다.

  val result2 = if (1 < 2) {
    val a = 11  // 임시적인(temporary) 변수 => 변수가 선언된 영역(scope)을 벗어나면 버려진다.
    a + 42
  } else 42

  val result3 =
    if ('x' < 'y')
      println("x < y")
    else
      println("x > y")

  println(result1)
  println(result2)
  println(result3)
}
/* Output:
x < y
5
53
kotlin.Unit
*/