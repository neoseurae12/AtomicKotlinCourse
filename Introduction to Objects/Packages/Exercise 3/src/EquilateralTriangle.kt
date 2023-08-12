// Packages/EquilateralTriangle.kt
package pythagorean

import kotlin.math.sqrt
import kotlin.time.times

class EquilateralTriangle(val side: Double) {
    fun area(): Double {
        return sqrt(3.0) / 4 * side * side
    }
}