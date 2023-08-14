// Lists/ListUsefulFunction.kt
import atomictest.eq

fun main() {
  val doubles =
    listOf(1.1, 2.2, 3.3, 4.4)            // Double의 List
  doubles.sum() eq 11.0

  val strings = listOf("Twas", "Brillig",
    "And", "Slithy", "Toves")             // String의 List
  strings eq listOf("Twas", "Brillig",
    "And", "Slithy", "Toves")
  strings.sorted() eq listOf("And",
    "Brillig", "Slithy", "Toves", "Twas") // sorted() 함수 => 새로운 List 생성 및 반환
  strings.reversed() eq listOf("Toves",
    "Slithy", "And", "Brillig", "Twas")   // reversed() 함수 => 새로운 List 생성 및 반환
  strings.first() eq "Twas"               // first() 함수
  strings.takeLast(2) eq
    listOf("Slithy", "Toves")             // takeLast(n) 함소
}