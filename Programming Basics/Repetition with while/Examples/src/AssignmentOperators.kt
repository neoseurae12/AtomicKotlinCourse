// RepetitionWithWhile/AssignmentOperators.kt

fun main() {
  var n = 10
  val d = 3
  print(n)
  while (n > d) {
    n -= d            // -= 연산
    print(" - $d")
  }
  println(" = $n")

  var m = 10
  print(m)
  m %= d              // %= 연산
  println(" % $d = $m")
}
/* Output:
10 - 3 - 3 - 3 = 1
10 % 3 = 1
*/