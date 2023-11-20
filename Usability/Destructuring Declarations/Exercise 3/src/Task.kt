// Destructuring/Task3.kt
package destructuringDeclarationsExercise3

data class Person(
  val name: String,
  val surname: String,  // [1-a] Person 객체를 구조 분해에 사용한 이후에 맨 마지막이 아닌 위치에 프로퍼티를 추가한 경우
  val age: Int
)

fun displayPersonInfo(person: Person) {
  val (name, age) = person
  println("Name: $name")
  println("Age: $age")
}

fun main() {
  // data 클래스의 프로퍼티는 이름에 의해 대입되는 것이 아니라 '순서대로' 대입된다.
  //val person = Person("Alice",  30) // displayPersonInfo() works incorrectly.
  val person = Person("Alice", "Johnson", 30)
  displayPersonInfo(person)
  /* 출력 결과
  Name: Alice
  Age: Johnson
   */
  // [1-b] 새 프로퍼티가 기존에 다른 값을 대입받던 식별자에 대입되면서 예상과 다른 결과를 낳을 수 있다.
  // [1-c] 추가된 프로퍼티의 타입과 원래 그 위치에 있던 프로퍼티의 타입이 같으면 컴파일러조차도 이 문제를 감지할 수 없다.
}