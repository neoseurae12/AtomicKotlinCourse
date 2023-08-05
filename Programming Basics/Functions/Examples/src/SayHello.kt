// Functions/SayHello.kt

// Unit 생략한 버전
fun sayHello() {
  println("Hallo!")
}

// Unit 생략하지 않은 버전
fun sayGoodbye(): Unit {
  println("Auf Wiedersehen!")
}

fun main() {
  sayHello()
  sayGoodbye()
}
/* Output:
Hallo!
Auf Wiedersehen!
*/