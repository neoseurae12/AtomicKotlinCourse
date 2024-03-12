// NullableTypes/NullableTypes.kt
import atomictest.eq

fun main() {
  val s1 = "abc"             // [1] null 참조 불가

  // Compile-time error:
  // val s2: String = null   // [2] String 타입: non-null type

  // Nullable definitions:
  val s3: String? = null     // [3] String? 타입: nullable type
  val s4: String? = s1       // [4] nullable type => 1) null, 2) 정상적인 값, 모두 담을 수 있음

  // Compile-time error:
  // val s5: String = s4     // [5] non-null type에 nullable type을 대입할 수는 없다. 즉, `String` != `String?`
  val s6 = s4                // [6] 타입 추론 => s6: nullable type

  s1 eq "abc"
  s3 eq null
  s4 eq "abc"
  s6 eq "abc"
}