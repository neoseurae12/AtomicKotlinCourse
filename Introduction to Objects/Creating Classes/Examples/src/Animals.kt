// CreatingClasses/Animals.kt

// '클래스'를 이용하여, 미리 정의된 타입을 사용할 수 있을뿐만 아니라, '새로운 타입을 정의'할 수 있다

// Create some classes:
class Giraffe   // 최대한 단순화하여 정의한 클래스    // 일반적으로는 '클래스 본문'과 함께 작성함
class Bear
class Hippo

// '객체'는 내가 가진 문제를 해결하는 방법 중 일부분이다.
  // 문제를 해결할 때 필요한 '개념'을 '객체'로 표현하는 것부터 생각해보는 것이 맨 처음의 대략적인 해법이다.
  // 객체의 분류(classification)

fun main() {
  // Create some objects:
  val g1 = Giraffe()
  val g2 = Giraffe()
  val b = Bear()
  val h = Hippo()

  // Each object() is unique:
  println(g1)
  println(g2)
  println(h)
  println(b)
}
/* Sample output:   // (클래스 이름)@(컴퓨터 메모리 상의 16진수 위치)
Giraffe@28d93b30
Giraffe@1b6d3586
Hippo@4554617c
Bear@74a14482
*/