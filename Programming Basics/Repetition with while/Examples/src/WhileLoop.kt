// RepetitionWithWhile/WhileLoop.kt

fun condition(i: Int) = i < 100  // [1] 불리언 값

fun main() {
  var i = 0
  while (condition(i)) {         // [2] while 문
    print(".")
    i += 10                      // [3] += 연산
  }
}
/* Output:
..........
*/