// Functions/MultiplyByTwo.kt

fun multiplyByTwo(x: Int): Int {  // [1] 함수 시그니처
  println("Inside multiplyByTwo") // [2] 함수 본문
  return x * 2
}

fun main() {
  val r = multiplyByTwo(5)        // [3] 함수 호출
  println(r)
}
/* Output:
Inside multiplyByTwo
10
*/