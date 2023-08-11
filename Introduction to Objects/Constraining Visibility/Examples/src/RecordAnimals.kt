// Visibility/RecordAnimals.kt

// 클래스, 최상위 프로퍼티, 최상위 함수 => '파일 내부에서만' 접근 가능

private var index = 0                  // [1] 최상위 프로퍼티

private class Animal(val name: String) // [2] 클래스

private fun recordAnimal(              // [3] 최상위 함수
  animal: Animal
) {
  println("Animal #$index: ${animal.name}")
  index++
}

fun recordAnimals() {
  recordAnimal(Animal("Tiger"))
  recordAnimal(Animal("Antelope"))
}

fun recordAnimalsCount() {
  println("$index animals are here!")
}