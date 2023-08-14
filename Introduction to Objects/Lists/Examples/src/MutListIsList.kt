// Lists/MutListIsList.kt
package lists
import atomictest.eq

// MutableList ⇒ List
fun getList(): List<Int> {
  return mutableListOf(1, 2, 3)
}

fun main() {
  // getList() produces a read-only List:
  val list = getList()
  // list += 3 // Error   // List ⇏ MutableList
  list eq listOf(1, 2, 3)
}