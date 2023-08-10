// Constructors/Arg.kt

class Alien(name: String) {   // 인자 => 생성자 밖에서 접근 불가
  val greeting = "Poor $name!"
}

fun main() {
  val alien = Alien("Mr. Meeseeks")
  println(alien.greeting)
  // alien.name // Error     // [1]
}
/* Output:
Poor Mr. Meeseeks!
*/