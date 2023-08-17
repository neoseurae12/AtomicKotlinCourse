// Maps/ContactMap.kt
package maps
import atomictest.eq

class Contact(
  val name: String,
  val phone: String
) {
  override fun toString(): String {
    return "Contact('$name', '$phone')"
  }
}

fun main() {
  val miffy = Contact("Miffy", "1-234-567890")
  val cleo = Contact("Cleo", "098-765-4321")
  val contacts = mapOf(
    miffy.phone to miffy,
    cleo.phone to cleo)   // Map의 키와 값으로 '클래스 인스턴스'를 설정할 수 있다.
  contacts["1-234-567890"] eq miffy
  contacts["1-111-111111"] eq null
}