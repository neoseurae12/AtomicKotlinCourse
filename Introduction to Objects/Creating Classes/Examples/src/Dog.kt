// CreatingClasses/Dog.kt

class Dog {
  fun bark() = "yip!"   // 멤버 함수 (코틀린에서는 '메서드'라는 표현을 채택하지 않고 있다 for 코틀린의 함수적인 특성 강조)
}

fun main() {
  val dog = Dog()
}