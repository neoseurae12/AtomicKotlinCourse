// NumberTypes/BMIEnglish.kt

fun bmiEnglish(
  weight: Int,
  height: Int
): String {
  val bmi =
    weight / (height * height) * 703.07 // [1]
  return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main() {
  val weight = 160
  val height = 68
  val status = bmiEnglish(weight, height)
  println(status)

  /* Output:
  Underweight
  */

  // 같은 연산임에도 '703.07의 위치'(맨 앞/맨 뒤)에 따라 결과가 완전히 달라짐
  val doubleFront = 160 / (68 * 68) * 703.07  // 맨 뒤 => 앞의 계산에서 Int 연산으로 이미 0이 되어, 703.07을 뒤에서 곱해도 0이 됨
  val intFront = 703.07 * 160 / (68 * 68)     // 맨 앞 => 맨 앞의 703.07 때문에 시작부터 Double 연산이 강제됨

  println("doubleFront: $doubleFront, intFront: $intFront")
  /*
  완전히 다른 계산결과:
  doubleFront: 0.0, intFront: 24.327681660899657
   */
}
