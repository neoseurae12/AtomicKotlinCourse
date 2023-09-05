// DataClasses/Simple.kt
package dataclasses
import atomictest.eq

// data 클래스 => 반복적인 코드를 줄여줌
data class Simple(
  // 모든 생성자 파라미터 => val 또는 var로 선언
  val arg1: String,
  var arg2: Int
)

// 일반 클래스
class General(val name: String)

fun main() {
  val s1 = Simple("Hi", 29)
  val s2 = Simple("Hi", 29)
  s1 eq "Simple(arg1=Hi, arg2=29)"  // 1) data 클래스의 toString() 함수
  s1 eq s2                          // 2) data 클래스의 equals() 함수

  val g1 = General("mark")
  val g2 = General("mark")

  println(s1 == s2)   // data 클래스 => true
  println(g1 == g2)   // 일반 클래스 => false (equals() 함수를 아직 override하지 않은 상태)
}