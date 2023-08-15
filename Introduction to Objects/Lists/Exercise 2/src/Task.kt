// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var cnt = 0
  for (e in list) {
    if (e == number) {
      cnt++
    }
  }
  return cnt
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}