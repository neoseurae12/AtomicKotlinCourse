// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int): Double = h / 2.0 * (x + y)

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25

  rectangleArea(4, 5) eq 20
  rectangleArea(2, 100) eq 200
  rectangleArea(5, 5) eq 25

  trapezoidArea(3, 4, 1) eq 3.5
  trapezoidArea(5, 9, 2) eq 14.0
  trapezoidArea(6, 8, 100) eq 700.0
}