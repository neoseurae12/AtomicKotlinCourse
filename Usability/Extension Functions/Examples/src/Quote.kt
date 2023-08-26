// ExtensionFunctions/Quote.kt
package other
import atomictest.eq
// 확장함수 import
import extensionfunctions.doubleQuote
import extensionfunctions.singleQuote

fun main() {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}