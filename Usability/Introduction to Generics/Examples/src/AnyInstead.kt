// IntroGenerics/AnyInstead.kt
package introgenerics
import atomictest.eq

// 유니버설 타입 (`Any`)
class AnyHolder(private val value: Any) {
  fun getValue(): Any = value
}

class Dog {
  fun bark() = "Ruff!"
}

fun main() {
  // `Any` 버전
  val holder = AnyHolder(Dog())
  val any = holder.getValue() // any 의 타입: Any (Dog 가 아님)
  // 컴파일 실패
    // Dog 객체를 Any 타입으로 대입하면서 객체 타입이 Dog 라는 사실을 더 이상 추적할 수 없게 됨
  // any.bark()

  // `T` 버전
  val genericHolder = GenericHolder(Dog())
  val dog = genericHolder.getValue()  // any 의 타입: Dog
  // 컴파일 성공
    // Dog 객체를 T 타입으로 대입해도 Dog 라는 구체적인 객체 타입에 대한 정보를 유지함
  dog.bark() eq "Ruff!"
}