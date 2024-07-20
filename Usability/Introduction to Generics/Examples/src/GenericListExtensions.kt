// IntroGenerics/GenericListExtensions.kt
package introgenerics
import atomictest.eq

// 제네릭 확장 함수
  // 제네릭 확장 함수의 정의 방법: 제네릭 명세를 수신 객체 앞에 둔다.
fun <T> List<T>.first(): T {
  if (isEmpty())
    throw NoSuchElementException("Empty List")
  return this[0]
}

fun <T> List<T>.firstOrNull(): T? = // 널이 될 수 있는 제네릭 타입
  if (isEmpty()) null else this[0]

fun main() {
  listOf(1, 2, 3).first() eq 1

  val i: Int? =                     // [1] T => Int?
    listOf(1, 2, 3).firstOrNull()
  i eq 1

  val s: String? =                  // [2] T => String?
    listOf<String>().firstOrNull()
  s eq null
}