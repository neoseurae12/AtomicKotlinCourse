// Varargs/TwoFunctionsWithVarargs.kt
package varargs
import atomictest.eq

// 스프레드 연산자(*) => vararg로 받은 파라미터를 다시 다른 vararg를 요구하는 함수에 전달할 때 특히 유용하다.

fun first(vararg numbers: Int): String {
  var result = ""
  for (i in numbers) {
    result += "[$i]"
  }
  return result
}

fun second(vararg numbers: Int) =
  first(*numbers)

fun main() {
  second(7, 9, 32) eq "[7][9][32]"
}