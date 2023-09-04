// Enumerations/Task3.kt
package enumerationsExercise3
import atomictest.eq
import enumerationsExercise3.Result.*
import enumerationsExercise3.Rochambeau.*

// 너무 좋은 코드3...

enum class Rochambeau {
  ROCK, PAPER, SCISSORS
}

enum class Result {
  DRAW, FIRST_WINS, SECOND_WINS
}

/** 나의 첫 답안
// 순서가 중요하기에, List를 사용함
// 그저 경우를 나열함.
fun winner(first: Rochambeau, second: Rochambeau): Result = when (listOf(first, second)) {
  listOf(ROCK, SCISSORS), listOf(SCISSORS, PAPER), listOf(PAPER, ROCK) -> FIRST_WINS
  listOf(SCISSORS, ROCK), listOf(PAPER, SCISSORS), listOf(ROCK, PAPER) -> SECOND_WINS
  else -> DRAW
}
*/

// Map을 사용한, 훨씬 깔끔한 방법
fun winner(first: Rochambeau, second: Rochambeau): Result {
  if (first == second) return DRAW  // 비긴 것은 워낙 간단하니, 더 지체하지 말고 바로 처리해버리자
  val winningCombinations = mapOf(  // 이기는(winning) 경우를 명확히 밝힌다
    ROCK to SCISSORS,
    SCISSORS to PAPER,
    PAPER to ROCK)
  return if (winningCombinations[first] == second) {
    FIRST_WINS
  } else {
    SECOND_WINS
  }
}


fun main() {
  winner(ROCK, SCISSORS) eq FIRST_WINS
  winner(SCISSORS, ROCK) eq SECOND_WINS
  winner(PAPER, PAPER) eq DRAW
}