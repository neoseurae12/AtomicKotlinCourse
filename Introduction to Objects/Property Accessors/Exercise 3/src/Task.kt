// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3
import atomictest.eq

class MessageStorage {
    private val _messages: MutableList<String> = mutableListOf()
    val messages: List<String>
        get() {
            return _messages
        }

    fun addMessage(str: String) {
        _messages += str
    }
}

fun main() {

  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
  // doesn't compile:
//  messageStorage.messages.remove("first")

}