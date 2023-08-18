// PropertyAccessors/Default.kt
package propertyaccessors
import atomictest.*

class Default {
  var i: Int = 0
    get() {         // 프로퍼티 정의 뒤에 게터 함수 정의 with 들여쓰기
      trace("get()")
      return field       // [1] 게터: 저장된 값 돌려줌
                          // field: 게터/세터 안에서, 저장된 값에 직접 접근
    }
    set(value) {   // 프로퍼티 정의 뒤에 세터 함수 정의 with 들여쓰기
      trace("set($value)")
      field = value      // [2] 세터: 저장된 값 변경함
    }
}

fun main() {
  val d = Default()
  d.i = 2
  trace(d.i)
  trace eq """
    set(2)
    get()
    2
  """
}