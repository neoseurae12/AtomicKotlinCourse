// ExtensionFunctions/Task4.kt
package extensionFunctionsExercise4
import atomictest.eq

// Convert receiver to parameter & Convert parameter to receiver

class Book(val title: String)

/** ① 원래
fun Book.categorize(category: String) =
  """title: "$title", category: $category"""
*/

/** ② Convert receiver to parameter
fun categorize(book: Book, category: String) =
  """title: "${book.title}", category: $category"""
*/

// ③ Convert parameter to receiver
fun Book.categorize(category: String) =
  """title: "$title", category: $category"""

fun main() {
  Book("Dracula").categorize("Vampire") eq
    """title: "Dracula", category: Vampire"""
}