// Lists/ApparentlyMutableList.kt
import atomictest.eq

fun main() {
    var list = listOf('X')  // var
    list += 'Y'             // += 연산 => 불변 리스트가 마치 가변 리스트처럼 보임
    list eq "[X, Y]"
}