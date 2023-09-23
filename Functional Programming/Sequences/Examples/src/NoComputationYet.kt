// Sequences/NoComputationYet.kt
import atomictest.eq
import sequences.isEven
import sequences.square

fun main() {
  // '시퀀스'의 경우
  val r = listOf(1, 2, 3, 4)
    .asSequence()
    .filter(Int::isEven)
    .map(Int::square)
  r.toString().substringBefore("@") eq
    "kotlin.sequences.TransformingSequence"
  //r.toString() eq "kotlin.sequences.TransformingSequence@2cb4c3ab"
  //r eq "kotlin.sequences.TransformingSequence@2cb4c3ab"

  // '리스트'의 경우
  val r2 = listOf(1, 2, 3, 4)
    .filter(Int::isEven)
    .map(Int::square)
  r2.toString() eq listOf(4, 16).toString()  //[4, 16]
  //r2 eq listOf(4, 16) //[4, 16]
}