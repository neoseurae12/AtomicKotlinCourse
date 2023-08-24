// Summary2/TicTacToe.kt
package summary2
import atomictest.eq

class Cell {
  var entry = ' '                   // [1] var => 변경 가능
                                      // ' '로 초기화했기 때문에, entry에 대입되는 모든 값은 "Char" 타입이어야 한다.
  fun setValue(e: Char): String =   // [2] Cell이 비어있는지 & 올바른 문자가 넘어왔는지 검사하는 멤버 함수
    if (entry == ' ' &&
      (e == 'X' || e == 'O')) {
      entry = e
      "Successful move"               // 반환값: 성공/실패를 표현하는 String
    } else
      "Invalid move"
}

class Grid {
  val cells = listOf(
    listOf(Cell(), Cell(), Cell()),
    listOf(Cell(), Cell(), Cell()),
    listOf(Cell(), Cell(), Cell())
  )
  fun play(e: Char, x: Int, y: Int): String =
    if (x !in 0..2 || y !in 0..2)     // [3]-1: x와 y 인자가 올바른 범위에 속하는지 검사하는 멤버 함수
      "Invalid move"
    else
      cells[x][y].setValue(e)                     // [3]-2: 행렬을 인덱스로 찾아서 setValue()를 호출하고 그 결과를 돌려줌
}

fun main() {
  val grid = Grid()
  grid.play('X', 1, 1) eq "Successful move"
  grid.play('X', 1, 1) eq "Invalid move"
  grid.play('O', 1, 3) eq "Invalid move"
}