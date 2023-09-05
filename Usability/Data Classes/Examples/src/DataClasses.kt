// DataClasses/DataClasses.kt
package dataclasses
import atomictest.eq
import atomictest.neq

class Person(val name: String)  // 일반 클래스

data class Contact(   // data 클래스
  val name: String,
  val number: String
)

fun main() {
  // equals() 함수
  // These seem the same, but they're not:
  Person("Cleo") neq Person("Cleo")
  // A data class defines equality sensibly:
  Contact("Miffy", "1-234-567890") eq
  Contact("Miffy", "1-234-567890")
}

// toString() 함수
/* Sample output:
dataclasses.Person@54bedef2               // 일반 클래스
Contact(name=Miffy, number=1-234-567890)  // data 클래스
*/