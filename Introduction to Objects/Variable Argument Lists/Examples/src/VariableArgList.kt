// Varargs/VariableArgList.kt
package varargs

fun v(s: String, vararg d: Double) {} // vararg => 가변 인자 목록
                                        // 최대 하나만, 마지막 파라미터

fun main() {
  v("abc", 1.0, 2.0)
  v("def", 1.0, 2.0, 3.0, 4.0)
  v("ghi", 1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
}