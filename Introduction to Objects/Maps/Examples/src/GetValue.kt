// Maps/GetValue.kt
import atomictest.*

fun main() {
  val map = mapOf('a' to "attempt")
  map['b'] eq null    // 1) <기본> null 반환
  capture {
    map.getValue('b')
  } eq "NoSuchElementException: " +   // 2) getValue() 함수 => NoSuchElementException을 던짐
    "Key b is missing in the map."
  map.getOrDefault('a', "??") eq "attempt"  // 3) getOrDefault() 함수 => 가장 나은 대안
  map.getOrDefault('b', "??") eq "??"
}