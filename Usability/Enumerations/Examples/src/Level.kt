// Enumerations/Level.kt
package enumerations
import atomictest.eq

enum class Level {  // 이넘
  Overflow, High, Medium, Low, Empty  // 이넘 상수
}

fun main() {
  Level.Medium eq "Medium"  // 이넘의 이름 한정
}