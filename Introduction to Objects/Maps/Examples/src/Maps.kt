// Maps/Maps.kt
import atomictest.eq

fun main() {
  val constants = mapOf(    // mapOf(), to
    "Pi" to 3.141,
    "e" to 2.718,
    "phi" to 1.618
  )
  constants eq
    "{Pi=3.141, e=2.718, phi=1.618}"

  // Look up a value from a key:
  constants["e"] eq 2.718                     // [1] [] 연산자
  constants.keys eq setOf("Pi", "e", "phi")   // keys   // Set
  constants.values eq "[3.141, 2.718, 1.618]" // values

  var s = ""
  // Iterate through key-value pairs:
  for (entry in constants) {           // [2] entry(맵 항목)
    s += "${entry.key}=${entry.value}, "
  }
  s eq "Pi=3.141, e=2.718, phi=1.618,"

  s = ""
  // Unpack during iteration:
  for ((key, value) in constants)      // [3] 키-값 분리
    s += "$key=$value, "
  s eq "Pi=3.141, e=2.718, phi=1.618,"
}