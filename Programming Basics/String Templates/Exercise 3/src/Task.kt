// StringTemplates/Task3.kt
package stringTemplatesExercise3

fun show(i: Int, s: String, c: Char, d: Double) {
    // 트리플 큰 따옴표에서는 \n 가 안 먹힘!
    println("i: $i")
    println("""s: "$s"""")    // ""(큰 따옴표)는 트리플 큰 따옴표로 처리 필요
    println("c: '$c'")        // ''(작음 따옴표)는 싱글 큰 따옴표로 처리 가능
    println("d: $d")
}

fun main() {
  show(1, "abc", 'd', 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/