// Enumerations/RecursiveEnumImport.kt
package enumerations
import atomictest.eq

// enum class가 정의된 파일에서 enum 값을 임포트할 수 있다.
import enumerations.Size.*            // [1] 이때 임포트는 이넘 정의가 들어 있는 파일에서 해당 이넘의 정의보다 더 먼저 작성되어야 한다.

// 이넘 정의
enum class Size {
  Tiny, Small, Medium, Large, Huge, Gigantic
}

fun main() {
  Gigantic eq "Gigantic"              // [2] import를 사용해 이넘에 정의된 모든 이름을 현재의 이름 공간으로 불러오면 더 이상 이넘 이름을 한정시키지 않아도 된다.
  // [3] values() ☞ 이넘의 값에 대해 이터레이션 가능
    // 반환 타입: Array
  Size.values().toList() eq
    listOf(Tiny, Small, Medium,
      Large, Huge, Gigantic)
  Tiny.ordinal eq 0                   // [4] ordinal ☞ 이넘 상수의 순서 (시작: 0~)
  Huge.ordinal eq 4
}