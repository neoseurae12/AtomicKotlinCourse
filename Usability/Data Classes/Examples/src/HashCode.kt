// DataClasses/HashCode.kt
package dataclasses
import atomictest.eq

data class Key(val name: String, val id: Int)

fun main() {
  val korvo: Key = Key("Korvo", 19)
  korvo.hashCode() eq -2041757108   // hashCode() 함수
  val map = HashMap<Key, String>()  // HashMap
  map[korvo] = "Alien"
  map[korvo] eq "Alien"
  val set = HashSet<Key>()          // HashSet
  set.add(korvo)
  set.contains(korvo) eq true
}