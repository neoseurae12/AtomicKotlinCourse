// BuildingMaps/TransformingMap.kt
import atomictest.eq

fun main() {
  val even = mapOf(2 to "two", 4 to "four")
  even.map {                            // [1]
    "${it.key}=${it.value}"
  } eq listOf("2=two", "4=four")

  even.map { (key, value) ->            // [2]
    "$key=$value"
  } eq listOf("2=two", "4=four")

  even.mapKeys { (num, _) -> -num }     // [3]
    .mapValues { (_, str) -> "minus $str" } eq
    mapOf(-2 to "minus two",
      -4 to "minus four")

  even.map { (key, value) ->
    -key to "minus $value"
  }.toMap() eq mapOf(-2 to "minus two", -4 to "minus four") // [4] map()의 반환타입: List
                                                              // => Map을 생성하기 위해서는 "toMap()" 호출 必

  val evensWithMapFun = even.map { (key, value) ->
    -key to "minus $value"
  }
  evensWithMapFun eq listOf(-2 to "minus two", -4 to "minus four")  // [5] 만약 toMap() 호출하지 않았다면?
                                                            // Pair를 원소로 가지는 List가 반환된다.
                                                            // [(-2, minus two), (-4, minus four)]
  //println(evensWithMapFun[0].javaClass) // class kotlin.Pair
}