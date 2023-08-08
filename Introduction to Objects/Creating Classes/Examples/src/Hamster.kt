// CreatingClasses/Hamster.kt

class Hamster {
  fun speak() = "Squeak! "
  fun exercise() =
    this.speak() +   // Qualified with 'this'
      speak() +      // Without 'this'  // 같은 클래스에 속한 다른 요소들은, 객체를 지정하지 않고 멤버 이름만으로 접근 가능.
      "Running on wheel"
    // this: 관심의 대상이 되는 객체를 추적한다 ; 객체 참조
      // 불필요한 this의 사용은 지양할 것.
}

fun main() {
  val hamster = Hamster()
  println(hamster.exercise())   // 클래스 밖에서 멤버 함수를 호출하는 방법 => (객체).(멤버 함수)
}
/* Output:
Squeak! Squeak! Running on wheel
*/