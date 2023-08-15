// Varargs/VarargSum.kt
package varargs
import atomictest.eq

fun sum(vararg numbers: Int): Int { // vararg => Array로 취급된다.
  var total = 0
  for (n in numbers) {
    total += n
  }
  return total
}

fun main() {
  sum(13, 27, 44) eq 84         // 모든 인자 => 지정하 타입에 속해야 한다.
  sum(1, 3, 5, 7, 9, 11) eq 36
  sum() eq 0  // 0개 가능
}