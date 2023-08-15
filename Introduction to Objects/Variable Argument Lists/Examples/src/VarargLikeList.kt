// Varargs/VarargLikeList.kt
package varargs
import atomictest.eq

fun evaluate(vararg ints: Int) =  // 대부분의 경우, vararg가 Array를 생성한다는 사실은 모르는 척 하고 List인 것처럼 취급해도 괜찮다.
  "Size: ${ints.size}\n" +
  "Sum: ${ints.sum()}\n" +
  "Average: ${ints.average()}"

fun main() {
  evaluate(10, -3, 8, 1, 9) eq """
    Size: 5
    Sum: 25
    Average: 5.0
  """
}