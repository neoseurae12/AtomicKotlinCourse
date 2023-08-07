// ExpressionsStatements/ForIsAStatement.kt

// Statement(문):
    // A Statement changes state. ; '문'은 상태를 변경한다. (부수적인 일, 효과) 즉, 결과 X
// Expression(식):
    // An Expression expresses. ; '식'은 결과값을 짜낸다. 즉, 결과 O

fun main() {
  // 다음과 같이 할 수는 없다:
  // val f = for(i in 1..10) {}     // 'for 루프'는 '문'이다.
  // 컴파일러 오류 메세지:
  // for is not an expression, and
  // only expressions are allowed here
}