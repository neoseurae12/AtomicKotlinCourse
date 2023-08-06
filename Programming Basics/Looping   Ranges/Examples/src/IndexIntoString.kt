// LoopingAndRanges/IndexIntoString.kt

fun main() {
  val s = "abc"
  for (i in 0..s.lastIndex) { // s.lastIndex : s의 마지막 인덱스 값
    print(s[i] + 1) // 인덱스 접근
                    // 문자는 '아스키 코드'에 해당하는 숫자 값으로 저장된다 => 문자 + 정수 = 새로운 문자
  }
}
/* Output:
bcd
*/