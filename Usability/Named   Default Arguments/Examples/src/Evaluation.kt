// NamedAndDefaultArgs/Evaluation.kt
package namedanddefault

class DefaultArg
val da = DefaultArg()

fun g(d: DefaultArg = da) = println(d)    // 디폴트 인자로 '객체 인스턴스'를 전달하는 경우

fun h(d: DefaultArg = DefaultArg()) =     // 디폴트 인자로 '함수 호출' 또는 '생성자 호출'을 사용하는 경우
  println(d)

fun main() {
  g()
  g()
  h()
  h()
}
/* Sample output:
namedanddefault.DefaultArg@7440e464
namedanddefault.DefaultArg@7440e464
namedanddefault.DefaultArg@49476842
namedanddefault.DefaultArg@78308db1
*/