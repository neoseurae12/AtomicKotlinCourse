// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val properAlignment = (rows * columns - 1).toString().length + 1
  for (i in 1..rows) {
    val start = columns * (i - 1)
    val end = columns * i - 1
    if (i % 2 == 1) {
      for (j in start..end) {
        print("%${properAlignment}d".format(j))
      }
    } else {
      for (j in end downTo start) {
        print("%${properAlignment}d".format(j))
      }
    }
    println()

    /*
    참고 (정답):
    val width = (rows * columns).toString().length + 1
    for (i in 0 until rows) {
      for (j in 0 until columns) {
        val value = if (i % 2 == 0) {
          i * columns + j
        } else {
          i * columns + (columns - 1 - j)
        }
        print("%${width}d".format(value))
      }
      println()
    }
     */
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/