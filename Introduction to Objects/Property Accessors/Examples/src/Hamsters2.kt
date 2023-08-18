// PropertyAccessors/Hamsters2.kt
package propertyaccessors

class Cage2(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()
  fun capacity(): Int =     // 필드 없는 프로퍼티 => '함수'와 비슷하다.
    maxCapacity - hamsters.size
  fun isFull(): Boolean =   // 필드 없는 프로퍼티 => '함수'와 비슷하다.
    hamsters.size == maxCapacity
}