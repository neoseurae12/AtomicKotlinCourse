// Overloading/OverloadedVsDefaultArg.kt
package overloadingvsdefaultargs
import atomictest.trace

fun foo(n: Int = 99) = trace("foo-1-$n")  // X

fun foo() {     // O
                  // 함수 시그니처가 가장 가깝게 일치되는 함수
  trace("foo-2")
  foo(14)
}

fun main() {
  foo()
  trace eq """
    foo-2
    foo-1-14
  """
}