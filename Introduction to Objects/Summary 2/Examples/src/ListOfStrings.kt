// Summary2/ListOfStrings.kt
import atomictest.*

fun main() {
  val wocky = """
    Twas brillig, and the slithy toves
      Did gyre and gimble in the wabe:
    All mimsy were the borogoves,
      And the mome raths outgrabe.
  """.trim().split(Regex("\\W+"))
  // `trim()`: 문자열의 맨 앞과 맨 뒤에 있는 연속적인 공백(new line 포함)을 제외한 새 String을 만든다.
  // `split()`: 주어진 인자를 기준으로 String을 분할한다.
  // `Regex` 객체: 정규식을 만든다.
    // 정규식(regular expression): 분할 기준이 되는 하위 문자열과 일치하는 패턴
    // \W: 단어를 이루는 문자가 아닌 문자들
      // String 리터럴에서의 역슬래시(\): 제어 문자(EX. 새줄 문자(\n), 탭(\t))를 표현할 때 쓰는 특별한 문자
      // 실제 문자열 안에 \를 집어넣기 위해서는 역슬래시를 "두 개" 써서, \\처럼 써야 한다.
      // 따라서 정규식에 역슬래시를 넣으려면, 항상 \를 한 번 "더" 넣어야 한다.
      // 이런 번거로움을 피하면 싶다면, 삼중 큰따옴표 문자열 리터럴을 사용해 """\W+"""로 표현해도 OK.
    // +: 앞에 온 패턴을 한 번 이상 반복
  // `split(Regex("\\W+"))`: 단어를 이룰 수 없는 문자를 하나 이상 포함하는 부분을 기준으로 텍스트를 분할하라.
    // 즉, 텍스트를 구성하는 단어들로 분할하라.

  trace(wocky.take(5))
  trace(wocky.slice(6..12))
  trace(wocky.slice(6..18 step 2))
  trace(wocky.sorted().takeLast(5))
  trace(wocky.sorted().distinct().takeLast(5))
  trace eq """
    [Twas, brillig, and, the, slithy]
    [Did, gyre, and, gimble, in, the, wabe]
    [Did, and, in, wabe, mimsy, the, And]
    [the, the, toves, wabe, were]
    [slithy, the, toves, wabe, were]
  """
}