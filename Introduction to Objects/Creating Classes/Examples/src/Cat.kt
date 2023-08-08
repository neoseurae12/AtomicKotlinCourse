// CreatingClasses/Cat.kt

class Cat {
  fun meow() = "mrrrow!"
}

fun main() {
  val cat = Cat()
  // Call 'meow()' for 'cat':
  val m1 = cat.meow()   // 멤버 함수: 어떤 클래스에 속한 특정 객체(인스턴스)에 대해 작용한다.
  println(m1)
}
/* Output:
mrrrow!
*/