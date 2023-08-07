// ExpressionsStatements/PostfixVsPrefix.kt

fun main() {
  var i = 10
  println(i++)  // '증가/감소 연산자 (++/--)'는 '식'이다.
  println(i)
  var j = 20
  println(++j)
  println(j)
}
/* Output:
10
11
21
21
*/