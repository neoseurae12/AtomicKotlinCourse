// Varargs/SpreadOperator.kt
import varargs.sum
import atomictest.eq

fun main() {
  val array = intArrayOf(4, 5)  // intArrayOf() 대신 arrayOf()로 쓰면 오류 발생함
//  val array1 = arrayOf(4, 5)
//  sum(*array1) eq 9 // 오류: Change parameter 'number' type of function 'sum' to 'Array<Int>'
  sum(1, 2, 3, *array, 6) eq 21  // [1] 스프레드 연산자 (*): Array 타입의 인자 하나 --> 인자 목록
  // Doesn't compile:
  // sum(1, 2, 3, array, 6)

  val list = listOf(9, 10, 11)
  sum(*list.toIntArray()) eq 30  // [2] 만약 List를 인자 목록에 전달하고 싶을 경우
}