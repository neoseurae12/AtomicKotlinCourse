// NamedAndDefaultArgs/Task3.kt
package namedAndDefaultArgumentsExercise3
import atomictest.eq

fun joinComments(s: String): String =
  s.trimMargin("// ").lines().joinToString("; ")
  // trimMargin(marginPrefix: String = "|"): String
    // Trims leading whitespace characters followed by marginPrefix from every line of a source string and removes the first and the last lines if they are blank (notice difference blank vs empty).
  // lines(): List<String>
    // Splits this char sequence to a list of lines delimited by any of the following character sequences: CRLF, LF or CR.
  /** joinToString(
        separator: CharSequence = ", ",
        prefix: CharSequence = "",
        postfix: CharSequence = "",
        limit: Int = -1,
        truncated: CharSequence = "...",
        transform: ((T) -> CharSequence)? = null
      ): String
  */
    // Creates a string from all the elements separated using separator and using the given prefix and postfix if supplied.

fun main() {
  val s = """
        // First
        // Second
        // Third
        """
  joinComments(s) eq "First; Second; Third"
}