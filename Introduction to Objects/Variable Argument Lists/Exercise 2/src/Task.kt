// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(first: String, vararg second: Int) {
    /* 나의 오답:
    print(first)
    print("[")
    print(second.joinToString())
    print("]")
     */

    println("$first${second.toList()}")
}

fun main() {
  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */