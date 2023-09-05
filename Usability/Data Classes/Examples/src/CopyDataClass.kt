// DataClasses/CopyDataClass.kt
package dataclasses
import atomictest.eq

data class DetailedContact(
  val name: String,
  val surname: String,
  val number: String,
  val address: String
)

fun main() {
  val contact = DetailedContact(
    "Miffy",
    "Miller",
    "1-234-567890",
    "1600 Amphitheater Parkway")
  val newContact = contact.copy(  // copy() 함수
    // 변경하고 싶은 인자만 이름 붙은 인자로 지정
    number = "098-765-4321",
    address = "Brandschenkestrasse 110")
  newContact eq DetailedContact(
    "Miffy",
    "Miller",
    "098-765-4321",
    "Brandschenkestrasse 110")
}