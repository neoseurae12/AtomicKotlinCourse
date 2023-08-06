// InKeyword/IterationVsMembership.kt

fun main() {
  val values = 1..3
  for (v in values) { // in 키워드 for '이터레이션'
    println("iteration $v")
  }
  val v = 2
  if (v in values)  // in 키워드 for '원소 여부 검사'
    println("$v is a member of $values")
}
/* Output:
iteration 1
iteration 2
iteration 3
2 is a member of 1..3
*/