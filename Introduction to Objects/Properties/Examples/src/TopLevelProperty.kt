// Properties/TopLevelProperty.kt

// 클래스 밖의 '최상위 프로퍼티'

val constant = 42   // val => 안전

var counter = 0     // var => 안티패턴 (안전X)
                      // 프로그램이 복잡해질수록 '공유된 가변 상태'에 대해 제대로 추론이 어려워지기 때문임
                      // 따라서, 가변 상태는 '클래스 안'에 가두는 것이 가장 좋다.

fun inc() {
  counter++
}