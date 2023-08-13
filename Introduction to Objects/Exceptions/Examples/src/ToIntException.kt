// Exceptions/ToIntException.kt
package exceptions

fun erroneousCode() {
  // Uncomment this line to get an exception:
//   val i = "1$".toInt()        // [1] 예외를 주석 처리함
                                    // erroneousCode()의 문맥을 벗어나, main()의 현재 문맥으로 들어간다
}

fun main() {
  erroneousCode()
}

/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "1$"
    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    at java.base/java.lang.Integer.parseInt(Integer.java:668)
    at java.base/java.lang.Integer.parseInt(Integer.java:786)
    at exceptions.ToIntExceptionKt.erroneousCode(ToIntException.kt:6)   // 문제를 보여주는 줄-1
    at exceptions.ToIntExceptionKt.main(ToIntException.kt:10)           // 문제를 보여주는 줄-2
    at exceptions.ToIntExceptionKt.main(ToIntException.kt)
 */
