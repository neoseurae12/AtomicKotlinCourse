// Constructors/DisplayAlienSpecies.kt

fun main() {
  val krombopulosMichael =
    AlienSpecies("Gromflomite", 2, 2, 2)
  println(krombopulosMichael)   // 객체.toString()가 호출된다. 이때, 객체에 '디폴트' toString() 함수가 이미 정의되어있다.
}
/* Sample output:
AlienSpecies@4d7e1886   // @ 뒤의 '객체의 물리적 주소'는 실행할 때마다 달라지는 주소이다.
*/