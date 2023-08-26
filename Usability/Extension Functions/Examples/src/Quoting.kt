// ExtensionFunctions/Quoting.kt
package extensionfunctions
import atomictest.eq

// 확장 함수 (extension function)
fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

// 확장 프로퍼티는 없을까...? => 있다 (단, 뒤에서 더 자세히 배울 예정)
val String.single: String
  get() = "yes"

fun main() {
  "Hi".singleQuote() eq "'Hi'"
  "Hi".doubleQuote() eq "\"Hi\""
}