// NumberTypes/Task3.kt
package numberTypesExercise3

fun convertFahrenheitToCelsius(f: Int): Double =
  (f - 32) * (5.0 / 9)
  // 반환 타입이 'Double'이 되도록 5를 5.0으로 표현줘해야 함

fun convertCelsiusToFahrenheit(c: Int): Double =
  c * (9.0 / 5) + 32
  // 반환 타입이 'Double'이 되도록 9를 9.0으로 표현해줘야 함

fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}