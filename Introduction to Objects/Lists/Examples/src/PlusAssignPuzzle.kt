// Lists/PlusAssignPuzzle.kt
import atomictest.eq

fun main() {
    // 1) val/var & 가변 List
    val list1_1 = mutableListOf('A')
    var list1_2 = mutableListOf('A')
    list1_1 += 'A'
    list1_2 += 'A'  // 다음 줄과 같다
    list1_1.plusAssign('A') // [1] '제자리에서' 변경 가능    // list1에 다른 리스트가 재대입될 일이 없어서, val이든 var이든 상관 없음
    list1_2.plusAssign('A')     // var보다는 val로 바꾸는 편이 더 나음

    // 2) val & 불변 List
    val list2 = listOf('B')
//    list2 += 'B'  // 다음 줄과 같다
//    list2 = list2 + 'B'           // [2] val ☞ list2에 새로 만든 리스트를 재대입할 수 없음다다
                                        // 즉, += 연산이 컴파일될 수 없음

    // 3) var & 불변 List
    var list3 = listOf('C')
    list3 += 'C'    // 다음 줄과 같다
    val newList = list3 + 'C'       // [3] list3가 가리키는 listOf('C')는 변경하지 않고, newList를 생성함
    list3 = newList                 // [4] var ☞ list3에 새로 만든 리스트 newList를 재대입할 수 있음
                                        // list3가 가변 리스트인 것 같은 착각을 불러일으킨다.

    list1_1 eq "[A, A, A]"
    list1_2 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"
}