// Visibility/MultipleRef.kt

// 클래스 내부에 있는 참조를 private으로 정의한다 해도 그 참조가 가리키는 객체에 대한 public 참조가 없다는 사실을 보장해주지는 못한다.
  // 에일리어싱 (aliasing): 한 객체에 대해 참조를 여러 개 유지하는 경우

class Counter(var start: Int) {
  fun increment() {
    start += 1
  }
  override fun toString() = start.toString()
}

class CounterHolder(counter: Counter) {
  private val ctr = counter
  override fun toString() =
    "CounterHolder: " + ctr
}

fun main() {
  val c = Counter(11)                 // [1]
  val ch = CounterHolder(c)           // [2] 새로 생긴 CounterHolder 객체가, c가 가리키는 Counter 객체와 똑같은 객체를 참조할 수 있다.
  println(ch)
  c.increment()                       // [3] ch 안에서는 private으로 인식되는 Counter를, 여전히 c를 통해 조작할 수 있다.
  println(ch)
  val ch2 = CounterHolder(Counter(9)) // [4] CounterHolder 안에 있는 ctr 외에는 Counter(9)을 가리키는 참조 존재 X.
                                                    // 즉, ch2를 제외한 그 누구도 이 객체에 대한 조작 불가.
  println(ch2)
}
/* Output:
CounterHolder: 11
CounterHolder: 12
CounterHolder: 9
*/