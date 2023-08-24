// Summary2/Task5.kt
package summaryIIExercise5

fun va1( vararg ints1: Int) {
  println("va1:")
  for (i in ints1) {
    println(i)
  }
}

fun va2(vararg ints2: Int) {
  println("va2:")
  va1(*ints2)
}

fun main() {
/*
  va1(1, 2, 3)
  va2(4, 5, 6)
*/
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */