// Varargs/Task4.kt
package variableArgumentListsExercise4
import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
  val singleList = mutableListOf<String>()
  for (l in listOfLists) {
//    singleList += l
    singleList.addAll(l)    // addAll() 함수
  }

  return singleList
}

fun main() {
  val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
  flatten(listOfLists) eq listOf("a", "b", "c", "d")
}