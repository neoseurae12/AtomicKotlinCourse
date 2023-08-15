# AtomicKotlinCourse

Cracking the Kotlin...! </br>
코틀린.. 깨부시기...!

## Contents
1. Programming Basics
2. Introduction to Objects
3. Usability
4. Functional Programming
5. Object-Oriented Programming
6. Preventing Failure
7. Power Tools
8. Appendices

## 1. Programming Basics
## 2. Introduction to Objects

### 20. 가시성 제한하기

- 리팩터링
: 작성한 코드를 며칠 또는 몇 주 동안 보지 않다가 다시 살펴보면 그 코드를 작성하는 더 좋은 방법이 보일 수 있다.

- 코드 변경/개선에서의 긴장감 (particularly in '라이브러리')
  - 코드 사용자(클라이언트 프로그래머)
    : 코드가 '안정적'이길 원한다. 즉, 코드가 그대로 유지되길 바란다.
  
  - 코드 설계자
    : 코드를 자유롭게 수정하고 개선하고 싶어한다 (자신이 변경한 내용이 클라이언트의 코드에 영향을 끼치지 않는다는 확신을 바탕으로).

> "변화"해야 하는 요소 vs. "유지"해야 하는 요소를 분리하라!

- 접근 변경자 (access modifier)
    - 목적: 가시성 제어
    - 위치: 클래스, 함수, 프로터피 정의 앞
    - public, private, protected, internal 등
#### ► public 정의

- 공개성
  - **클라이언트 프로그래머**가 접근할 수 있다.
  - 클라이언트 코드에 직접적으로 영향을 미친다.
- 기술적으로는 불필요한 중복
  - 변경자를 지정하지 않으면 자동으로 public이 되기 때문이다.
  - 하지만, 의도를 명확하게 드러내기 위해 여전히 public을 써야 하는 경우가 가끔 있다.

#### ► private 정의

- 비공개성
  - **같은 클래스에 속한 다른 멤버들만**, 또는, **파일 내부에서만** 접근할 수 있다.
  - 클라이언트 코드에 직접적인 영향이 없다. (변경, 심지어 삭제하더라도)
  - 주로 '클래스 멤버'에 사용된다.
  - 라이브러리 설계자는 클라이언트 프로그래머에게 필요한 함수와 클래스만 외부에 노출시키고, 가능한 한 많은 요소를 private으로 선언하다.
  - 내부 구현을 노출시켜야 하는 경우(극히 드묾)를 제외하고는, 프로퍼티를 private으로 만들어라.
  - 하지만 클래스 내부에 있는 참조를 private으로 정의한다 해도 그 참조가 가리키는 객체에 대한 public 참조가 없다는 사실을 보장해주지는 못한다.
    - 에일리어싱 (aliasing): 한 객체에 대해 참조를 여러 개 유지하는 경우
  - 장점
    - 같은 패키지 안의 다른 클래스에 영향을 끼칠지 걱정하지 않으면서 코드 변경이 가능하다.
    - 클래스 외부에서 실수로 사용하는 경우를 방지할 수 있다.
    - 마음대로 변경하거나 제거하지 못하게 할 수 있다.

#### ► internal 정의

- private과 public의 중간
  - private으로 정의하자니 제약이 너무 심하다고 느껴지고, public으로 정의하자니 공개 API의 일부분으로 포함시키기는 애매할 경우
  - **모듈 내부에서만** 접근할 수 있다.
    - 모듈 (module): 코드 기반상에서 논리적으로 독립적인 각 부분
    - 큰 프로그램을 하나 이상의 모듈로 분리하면 유용하다.
  - 라이브러리: 일반적으로, 다양한 '패키지'가 들어있는 단일 '모듈'로 구성된다.
    - 라이브러리 내부 => internal 사용 가능
    - 라이브러리를 소비하는 쪽 => internal 접근 불가

### 21. 패키지

- DRY (Don't Repeat Yourself)
  - 반복하지 말라
  - 반복이 여러 차례 발생하면
    - 더 많은 유지 보수
    - 실수할 가능성 커짐

- import 키워드
  - 다른 파일에 정의된 코드의 재사용
  - 패키지의 원소 사용 가능
  - 별표(*) => 패키지에 있는 모든 내용을 임포트함

- 패키지 (package)
  - 연관 있는 코드들의 모음 ; ⊃ 여러 함수 & 클래스
  - 목적
    - 보통 특정 문제를 풀기 위해 고안됨
    - 코드의 재사용
    - main()이 아닌 함수, 클래스 등을 정의하는 파일이, 다른 파일에 정의된 이름과 충돌하지 않도록 방지하기 위함
      - 다만, main() 함수만 들어 있는 파일에는 보통 package 문을 넣지 않음
  - package 키워드
    - 위치: 코드의 가장 앞부분
  - JAVA와 달리, 코들린에서는
    - '소스 코드 파일 이름'과 '클래스 이름'이 일치하지 않아도 OK
    - '패키지 이름'도 임의로 선택 가능. 
      - BUT '패키지 이름'과 '패키지 파일이 들어 있는 디렉터리의 경로'를 똑같이 하는 것이 '좋은 스타일'로 여겨진다.
  - EX: kotlin.math 라이브러리로부터 수학 상수와 함수 임포트 하기
    - toInt() => 소수점 버림
    - roundToInt() => 소수점 반올림

- as 키워드
  - 서드파티(third-party) 라이브러리에 있는, 같은 이름의 클래스나 함수를 임포트해서 사용하고 싶을 때, 또는 라이브러리에서 이름을 잘못 선택했을 때, 또는 이름이 너무 길 때, **이름을 변경하여 임포트 가능**
  - 물론, 코드 안에서 임포트한 이름의 패키지 경로를 전부 다 쓸 수도 있다.
    - 단점: 가독성이 떨어짐
    - 장점: 각 요소의 출처를 명확하게 알 수 있음

### 22. 테스트

- '콘솔 출력(println())'으로 코드의 올바름을 검증하면 좋지 않은 이유
  - 오류를 찾는 데 시각적인 검사는 부실하고 신뢰할 수 없는 방법이기 때문이다.
    - 매번 출력을 자세히 살펴봐야 함
    - 의식적으로 각각의 출력이 올바른 출력인지 확인해야 함

#### ► 프로그램의 일부분인 '테스트'

- 프로그램을 '빠르게' 개발하려면 '지속적인 테스트'가 필수다.
  - 테스트를 통해 문제의 원인을 최대한 빨리 발견하는 것이 결과적으로 훨씬 적은 시간을 들이기 때문이다.

- 테스트는 '언제' 가장 효과적일까?
  - 소프트웨어 개발 과정에 포함되어 있을 때
  - 이유: 테스트를 작성하면 원하는 결과를 확실히 얻을 수 있기 때문이다.

- 실전에서 많이 사용하는 테스트 시스템 (import 必)
  - JUnit: 자바 & 코틀린의 테스트 프레임워크
  - 코테스트(Kotest): 코틀린 전용
  - 스펙(Spek) 프레임워크: 명세 테스트

- 경계 조건(boundary condition)을 검사하는 테스트

1) 중위 표기법 (infix notation)

  - a.함수(b)라는 호출을 a 함수 b처럼, 깔끔하고 편안한 코드로 작성할 수 있게 해주는 기능
  - infix 키워드
  - infix eq, infix neq
    ```kotlin
    식 eq 예상값
    식 neq 예상값
    ```
  - eq & neq => 유연하다. 즉, 테스트 식에 거의 모든 코틀린 식을 넣어도 된다.
    - '예상값'이
      - String일 경우 => 식이 String으로 변환된 후에 비교
      - String이 아닐 경우 => 식과 예상값을 직접 비교 (변환 X)
  - 항상 식의 결과값을 콘솔에 표시한다.
    - 식 == 예상값 ☞ 식의 결과값
    - 식 != 예상값 ☞ 식의 결과값 + 오류 메세지
  - eq & neq => 테스트 + 콘솔 출력

2) trace 객체

- 출력을 저장해서 나중에 사용할 수 있게 해준다.
- println()을 trace()로 대치 가능
  - trace 객체에 결과를 추가하는 것이, 함수 호출처럼 보이기 때문이다.

3) 테스트 주도 개발 (TDD; Test Driven Development)

- 코드를 구현하기 전에 테스트를 먼저 작성해 실패시킨 후, 나중에 테스트를 통과하도록 코드를 작성하는 기법
- 장점
  - 자신이 생각하는 대상을 정말로 테스트하고 있는지 확실히 확인할 수 있다.
  - 테스트를 염두에 두고 코드를 작성하면, 코드를 작성하는 방식이 달라진다.
    - 테스트를 위해 함수가 무언가를 반환하도록 한다.
    - 파라미터(입력)을 받아 반환값(출력)만 만들어내고 다른 일(부수 효과)은 하지 않는 함수를 사용한다.

### 23. 예외

- I take **exception** to that.
: 프로그래머는 프로그램이 진행되는 과정에서 프로그래머가 가정한 일반적인 정상 경로를 벗어나는 상황에 반대한다.
  
- 오류 보고 메커니즘
- 예외 객체 / 예외 문제
: 문제를 처리하기에 충분한 정보가 현재 문맥에 존재하지 않아 오류가 발생한 지점에서 현재 함수 또는 현재 영역의 진행을 중단하고 적절한 조치를 취할 수 있는 현재 문맥의 바깥쪽으로 '던져지는' 객체
    
  - ↔︎ 일반적인 문제: 그 문제를 처리하기에 충분한 정보가 현재 맥락에 존재하는 경우

- 예외를 잡아내지(catch) 않은 경우 ☞ 프로그램 중단 + 스택 트레이스 출력
  - 스택 트레이스(stack trace): 예외에 대한 상세 정보 (예외가 발생한 파일과 위치 등)
- 예외를 잡아내는 방법
  1. 주석으로 예외를 가린다.
     - 단점: 예외를 주석 처리 했다가 해제하면 예외가 발생한다.
  2. AtomicTest 패키지가 제공하는 capture() 함수를 사용한다.
      - 장점
        - 예외를 주석 처리 했다가 해제하는 일을 방지할 수 있다.
        - 발생한 예외와 예상 오류 메시지를 비교할 수 있다.
      - 단점: 일반 프로그래밍에는 그리 유용하지 않다.
          - 예외 메시지를 보여주는 동시에 빌드 시스템을 통과시켜야 하는 이 책을 위해 특별히 고안된 함수이기 떄문이다.
  3. 디폴트 예외 객체를 던진다.
     - 단점: 왜 오류가 발생했는지에 대해 아무런 정보를 주지 않는다.
  4. null을 반환하도록 한다.
     - 장점
       - 문제가 발생한 이유를 좀 더 명확히 생성하도록 만들 수 있다.
          - 함수가 null을 반환할 수 있는 경우, 코틀린은 그 함수의 결과값을 사용하기 전에 null인지 여부를 먼저 검사한다.
     - 예시: String.toIntOrNull() 함수
  5. 좀 더 자세한 오류 메세지가 포함된 구체적인 예외를 던진다.
     - throw 키워드
     - 목표: 향후 애플리케이션을 더 쉽게 지원할 수 있도록 가장 유용한 메세지를 제공하는 것

### 24. 리스트

- 컨테이너(container) (=컬렉션(collection))
: 다른 객체를 담는 개체

- 리스트
  - ⊂ 표준 코틀린 패키지
    - import 할 필요 없음
  - listOf() 함수
    - ⊂ 표준 라이브러리 함수

- 인덱스
  - in 키워드 ☞ 1 차이로 인한(off-by-one) 오류를 없앨 수 있다.
    - in 키워드: 컨테이너 전체에 대한 이터레이션
    - 1 차이로 인한(off-by-one) 오류: 인덱스가 '0'부터 시작하다는 사실을 깜빡했을 경우 발생
      - ArrayIndexOutOfBoundException: 수 발생
  - for(i in ints)에서의 i => val i라고 정의하거나 i의 타입을 지정할 필요 없음
    - 이유: 코틀린이 문맥을 보고 i가 for 루프에 쓰일 식별자라는 사실을 알 수 있기 때문이다.

- List 연산 (일부)
  - sorted(), reversed(): '새로운' List를 생성하여 돌려준다. 따라서 List의 원본은 그대로 잘 남아있다.
  - sort(): List의 원본을 직접(in place) 바꾼다.
  - first(): 맨 첫 원소
  - takeLast(n): 맨 뒤에서 n개의 원소

#### a. 파라미터화한 타입

- 타입 파라미터(type parameter)
: 이 컨테이너는 '파라미터' 타입의 객체를 담는다.

  - 홑화살괄호(<>)
  - '함수의 반환 타입'일 경우, 타입을 명시하려면, 반드시 타입 파라미터까지 모두 명시해야 한다.
    - 즉, 타입 추론을 하든, 타입 명시를 하든, 모두 가능하다.
    - 다만, 타입 명시일 경우에는, 단순히 List라고만 쓰면 안 된다. List<E>로 명시해야 한다.
  - ↔ 타입 추론
    ```kotlin
    // 타입 추론
    val numbers = listOf(1, 2, 3)
  
    // 타입 명시
    val numbers2: List<Int> = listOf(1, 2, 3)
    ```

#### b. listOf() & mutableListOf()

- MutableList과 List 간의 변환 가능 여부
  1) MutableList ⇒ List
  2) List ⇏ MutableList
- 에일리어싱(aliasing)
  - 내부 구현을 MutableList로 하면서 이 MutableList에 대한 참조를 유지했다가 나중에 이 가변 List에 대한 참조를 통해 원소를 변경하면, 읽기 전용 리스트에 대한 참조임에도 불구하고 그 리스트 내부가 바뀐 모습을 볼 수 있다.

1) listOf(): '**읽기 전용**' 리스트
  - 상태 변화의 함수가 들어 있지 않다.
2) mutableListOf(): '**가변**' 리스트
  - 상태 변화의 함수가 들어 있다.
    - add(), addAll()
    - += 연산

#### c. += 연산자

- += 연산자의 동작 ☞ 다른 컬렉션에서도 마찬가지다.
- 혼동을 방지하려면, var보다는 **val**을 사용하라.

- += 연산에 대한, val/var & 가변/불변 List의 다양한 조합
  1) **val/var** & **가변 List**
     - 다음과 동일하다
       ```kotlin
       val list1 = mutableListOf<Char>()
       // 또는
       // var list1 = mutableListOf<Char>()
       
       list1.plusAssign('A')
       ```
     - list1에 다른 리스트가 재대입되지 않고 제자리에서 변경하기 때문에, val이든 var이든 상관 없음
     - var보다는 **val**로 바꾸는 편이 더 나음
  2) **val** & **불변 List**
     - 다음과 동일하다
       ```kotlin
       val list2 = List<Char>()
       
       list2 = list2 + 'B'
       ```
     - **val** ☞ list2에 새로 만든 리스트를 재대입할 수 없음
     - 따라서, += 연산이 불가능하다(컴파일될 수 없다).
  3) **var** & **불변 List**
     - 다음과 동일하다
       ```kotlin
       var list3 = List<Char>()
       
       val newList = list3 + 'C'
       list3 = newList
       ```
     - list3가 가리키는 listOf('C')는 변경하지 않고, newList를 생성함
     - **var** ☞ list3에 새로 만든 리스트 newList를 재대입할 수 있음
     - += 연산자로 인해, list3가 가변 리스트인 것 같은 착각을 불러일으킨다.

### 25. 가변 인자 목록 (vararg)

- 가변 인자 목록 (variable argument list)
  - 임의의 길이로(0 포함) 인자 목록을 받을 수 있는 함수
    - ex) listOf(), vararg 등
  - 함수 정의에 vararg 인자 '최대 하나만' 선언 가능
  - vararg 인자의 '위치' ☞ 상관없음
    - 다만, 일반적으로 '마지막' 파라미터를 vararg로 선언하는 게 간편함
  - 모든 인자 ☞ 지정한 타입에 속해야 함
  - '**Array**'로 취급된다.
- Array(배열) VS. List(목록)
  1) Array
     - 특별한 저수준 지원 필요
       - 다른 언어(ex. JAVA)와의 호환성을 고려해 생겨난 타입
     - 용도 (제한적)
       - 서브파티 API가 Array를 요구할 경우
       - vararg를 다뤄야 하는 경우
     - arrayOf()
     - 항상 '가변' 객체이다.
  2) List
     - 일반적인 라이브러리 클래스
     - 용도 (일반적)
       - 일상적인 프로그램에서 간단한 시퀀스가 필요한 경우
     - listOf()
     - 가변(mutableList) 객체, 불변(List) 객체 모두 가능하다.
  - 하지만, 대부분의 경우, vararg가 Array를 생성한다는 사실은 모르는 척 하고 List인 것처럼 취급할 수 있다.
- 스프레드 연산자 (*)
  - Array를, 'Array 타입의 인자 하나'가 아닌, '**인자 목록**'으로 변환한다.
  - **Array**에만 적용 가능
    - 만약 **List**를 인자 목록에 전달하고 싶을 경우
      - ① List를 Array로 변환한다 (toArray()).
        - (Array가 원시 타입일 경우) 원시 타입의 Array로 변환한다 (toIntArray()).
      - ② 스프레드 연산자를 적용한다.
  - **원시 타입의** Array인 경우
    - 구체적인 타입 이름이 지정된 Array 생성 함수를 사용해야 한다.
      - EX) IntArray, ByteArray, BooleanArray 등
    - 원시 타입: Byte, Char, Short, Int, Long, Float, Double, Boolean
      - String은 코틀린 기본 타입이지만, 원시 타입은 아니다.
  - IntArray VS. Array<Int>
    - IntArray: Int 원시 타입의 2진 표현 값을 직접 저장한다.
    - Array<Int>: Int 객체에 대한 참조를 모아둔 배열
      - 훨씬 더 메모리 많이 차지함
      - 처리 속도가 늦음
  - vararg로 받은 파라미터를 다시 다른 vararg를 요구하는 함수에 전달할 때 특히 유용하다.

#### ▶︎ 명령줄 인자 (Command-Line Arguments)

- Command Line에서 프로그램을 시작할 때 프로그램이 command-line arguments를 받게 하려면,
  1. main() 함수에 미리 정해진 파라미터를 지정한다.
     - 파라미터 이름: (전통적으로) args
     - args의 타입: 반드시 Array\<String>이어야 한다.
       - String 파라미터를 원하는 타입으로 바꾸고 싶다면 => 변환 함수
         - EX) toInt(), toFloat()
         - 명령줄 인자의 '순서' 고려
     ```kotlin
     fun main(args: Array<String>) {}
     ```
  2. 인텔리J IDEA의 'Run configuration'을 통해 프로그램에 인자를 전달한다.
  3. kotlinc 컴파일러를 통해 Command Line 프로그램을 생성한다.
        ```shell
        kolinc MainArgs.kt
        kotlin MainArgsKt hamster 42 3.14159
        ```

## 3. Usability
## 4. Functional Programming
## 5. Object-Oriented Programming
## 6. Preventing Failure
## 7. Power Tools
## 8. Appendices