// Exceptions/IntroducingCapture.kt
import atomictest.*

fun main() {
  capture {
    // [2] AtomicTest 패키지가 제공하는 capture() 함수 사용
      // 목적: 예외를 주석 처리 했다가 해제하는 일을 방지하기 위함
      /* capture() 함수
        - 발생한 예외와 예상 오류 메시지를 비교할 수 있다.
        - 예외 메시지를 보여주는 동시에 빌드 시스템을 통과시켜야 하는 이 책을 위해 특별히 고안된 함수
          - 따라서 일반 프로그래밍에는 그리 유용하지 않다.
      */
    "1$".toInt()
  } eq "NumberFormatException: " +
    """For input string: "1$""""
}