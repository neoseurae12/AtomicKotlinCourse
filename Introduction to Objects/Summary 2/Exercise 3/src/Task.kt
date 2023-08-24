// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val maxNumOfAny: Int) {
  private val mutableList= mutableListOf<Any>()
  val size: Int
    get() {
      return mutableList.size
    }
  val full: Boolean
    get() = (size == maxNumOfAny)

  fun add(a: Any) {
    if (full) {
      throw IllegalStateException("The container is full")
    }
    mutableList += a
  }
}

fun main() {

  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"

}