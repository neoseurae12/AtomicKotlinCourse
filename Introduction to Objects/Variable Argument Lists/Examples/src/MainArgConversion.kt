// Varargs/MainArgConversion.kt

fun main(args: Array<String>) {
  if (args.size < 3) return   // 충분한 인자가 주어지지 않으면 종료되도록 함
  val first = args[0]
  val second = args[1].toInt()  // Int로,
  val third = args[2].toFloat() // Float로, 변환할 수 없는 값을 제공한 경우, 런타임 오류 발생
  println("$first  $second  $third")
}