// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 1..n) {
    repeat(n - i) {
      print(' ')
    }
    repeat(i * 2 - 1) {
      print('#')
    }
    println()
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/