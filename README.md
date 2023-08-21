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

### 16. 객체는 모든 곳에 존재한다.

- 객체: ⊂ 문제 해결방법
  - 해결하려는 문제의 '명사'를 찾아내어 이 명사를 '객체'로 변환한다.
- 코틀린: 하이브리드 객체-함수형 언어 (hybrid object-functional) ; 객체 지향 + 함수형
- `객체`: 데이터 저장 (by `프로퍼티`; 상태) + 동작 수행 (by `(멤버) 함수`; 행동)
- 객체와 관련된 용어
  - `클래스(class)`: 사용자 정의 타입; 새로운 데이터 타입의 기초가 될 프로퍼티 & 함수를 정의함
    - 클래스를 잘 정의하면, 프로그래머가 이해하기 쉽고 가독성도 높은 코드를 작성할 수 있다.
  - `멤버(member)`: 클래스의 프로퍼티 & 함수
  - `프로퍼티`: 데이터를 저장하는 val/var
    - 어떤 타입이든 가티
  - `멤버 함수(member function)`: 특정 클래스에 해당하는 객체가 있어야만 사용할 수 있는 함수
    - 특정 멤버 함수에 대해 알고 싶다면, '코틀린 문서'와 'IDE의 코드 완성(code completion) 기능'를 적극 참고할 것
    - API (애플리케이션 프로그래밍 인터페이스)
    - 객체에 대한 연산 수행 == 멤버 함수 호출 == 매세지를 보낸다
    - 코틀린의 함수적인 특성을 강조하기 위해, '메서드'라는 용어를 채택하지 않고, '함수'라는 표현을 사용한다.
  - `객체 생성` or `인스턴스 생성`: 클래스에 해당하는 val/var 값을 만드는 과정
    ```kotlin
    val nb = NoBody()
    var eb = EveryBody()
    ```
- '같은' 클래스 ⇉ '별도의' 객체(인스턴스)
  - 각 객체는 메모리에 자신만의 저장 공간을 가진다.
- 코틀린에서는 '수 타입 사이의 변환'을 "명시적"으로 해야 한다.
  - EX) i.toLong(), i.toDouble()체
- 컨테이너(컬렉션) ☞ 아주 유용한 유형의 객체 ('24. 리스트' 참고)


### 17. 클래스 만들기

- 클래스 ☞ 새로운 타입의 정의
  - class 키워드
  - 표현: '최대한 단순화한 클래스' or '더 복잡한 클래스 with 클래스 본문 ({})'
    ```kotlin
    // 본문이 없는 클래스 (최대한 단순화)
    class Giraffe
    
    // 본문({})이 있는 클래스 (더 복잡)
    class Dog {
        fun bark() = "yip!"
    }
    ```
- 클래스의 이름
  - 1번째 자리: 반드시 '글자 (A-Z, 대소문자, 한글 등 각국 언어 문자)'로 시작해야 한다.
    - 관례상 '대문자'
      - cf) val/var의 이름: 관례상 '소문자'
  - 2번째 자리~: 숫자, 밑줄 포함 가능
- 생성된 객체는 각각 고유한 주소(정체성)를 부여받는다.
  - (클래스 이름)@(컴퓨터 메모리 상의 위치의 16진수)
    ```kotlin
    Giraffe@28d93b30
    ```
- 함수
  1) 멤버 함수 ☞ 클래스에 속한 함수
     - 어떤 클래스에 속한 특정 인스턴스에 대해 작용한다.
     - `this`
       - 멤버 함수를 호출할 때 코틀린은 조용히 객체를 가리키는 참조(reference)를 함수에 전달해서 관심의 대상이 되는 객체를 추적한다.
         - 멤버 함수 안에서는 this라는 이름으로 이 참조에 접근할 수 있다.
       - 멤버 함수는 클래스에 속한 다른 요소들을, 객체를 지정하지 않고 멤버 이름만 사용하여 접근할 수 있다.
         - 최상위 함수와의 차이점
         - 원한다면 this를 사용해 이런 요소를 한정할 수 있다.
       ```kotlin
       class Hamster {
         fun speak() = "Squeak!"
         fun exercise() =
           this.speak() +   // this로 한정함
           speak()          // this로 한정하지 않음
       }
       ```
       - 불필요한 this는 사용하지 않는 것이 좋다.
       - 클래스 밖에서는 객체를 지정해 멤버 함수를 호출해야 한다.
  2) 최상위(top-level) 함수 ☞ 클래스에 속하지 않은 함수

- 프로퍼티
  ```kotlin
  val temp = Temperature()
  
  temp.setFahrenheit(98.6)
  temp.getFahrenheit() eq 98.6
  temp.getCelsius() eq 37.0
  temp.setCelsius(100.0)
  temp.getFahrenheit() eq 212.0
  ```
  - val 정의는 temp라는 참조에 다른 새로운 객체가 재대입되는 것을 막을 뿐, 객체 자체의 내부 동작까지 막지는 못한다.
    - 따라서 temp는 val로 선언됐지만, 이후 Temperature 객체의 내부를 조작할 수 있는 것이다. 

### 18.

### 19. 생성자

- 생성자 ☞ 객체를 제대로 초기화 및 생성할 수 있는 메커니즘
  - 새 객체를 초기화하는 특별한 멤버 함수와 비슷하다.
  - 정보를 전달해 (by '파라미터 목록') 새 객체를 초기화할 수 있다.
  - 생성자 호출 VS. 함수 호출
    - 생성자 호출: 첫 글자가 '대문자'
    - 함수 호출: 첫 글자가 '소문자'
  - new 키워드를 '불필요한 중복'으로 보기 때문에 사용하지 않는다.
- 파라미터 목록
  1) `인자`
     - 생성자 밖에서는 접근 불가
     ```kotlin
     class Alien(name: String) { // 인자
         //name = "Mark" // 불가능
         var id = name
         //id = "Mark"   // 불가능 (∵ 클래스 안에는 only 프로퍼티 & 멤버 함수)
         
         override fun toString(): String {
             return "Alien: $id"        // 가능
             //return "Alien: $name"    // 불가능
         }
     }
    
     fun main() {
         val alien1 = Alien("Jason")
         //alien1.name       // 불가능
         alien1.id = "Jack"  // 가능
     }
     ```
  2) `프로퍼티`
     - 생성자 밖에서도 접근 가능
     - 새로운 이름을 명시적으로 선언하고 싶지 않을 때
     ```kotlin
     class MutableNameAlien(var name: String)   // 프로퍼티 (with 'val/var')
     class FixedNameAlien(val name: String, var years: Int) {   // 파라미터 여러 개일 경우 (1)
         //val id = name     // 불필요
     }
     class MultiParaAlien(  // 파라미터 여러 개일 경우 (2)
        val name: String,
        var years: Int
     )
    
     fun main() { 
         val alien1 = MutableNameAlien("Jason")
         alien1.name = "Jack"    // 가능
     }
     ```
     - 파라미터가 많아도 OK
- `println(객체)`
  - `객체.toString()`을 호출한 결과를 출력한다.
  1) 클래스에 직접 toString을 정의한 바 없다면
     - 디폴트 toString()이 호출된다.
     ```kotlin
     val krombopulos = AlienSpecies()
     println(krombopulos)
    
     /** 출력결과
     AlienSpecies@4d7e1886  // 그다지 유용하지 않은 출력..
     */
     ```
  2) 클래스에 직접 toString()을 구현하고자 한다면
      ```kotlin
      class Scientist(val name: String) {
        override fun toString(): String {
          return "Scientist('$name')"
        }
      }
      ```
     - `override` 키워드
       - 이미 정의되어있는 메서드의 정의를 대신할 진짜 새 정의를 제공하곘다는 뜻
       - 장점
         - 코드의 의도를 더 명확히 할 수 있고,
         - 의도치 않게 같은 이름의 함수를 정의하는 등의 실수를 줄일 수 있으며,
     - toString() 함수에 대한 override
       - 프로그램 오류를 찾고 수정할 때 유용하다 (디버깅)
       - cf) IDE의 '디버거(debugger)' 기능


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
      - 컴포넌트를 만드는 사람이 클라이언트 프로그래머에게 공개할 내용을 결정할 수 있다.
    - 위치: 클래스, 함수, 프로터피 정의 앞
    - public, private, protected, internal
#### ► public 정의

- 공개성
  - **클라이언트 프로그래머**가 접근할 수 있다.
  - 클라이언트 코드에 직접적으로 영향을 미친다.
- 기술적으로는 불필요한 중복
  - 변경자를 지정하지 않으면 자동으로 public이 되기 때문이다.
  - 하지만, 의도를 명확하게 드러내기 위해 여전히 public을 써야 하는 경우가 가끔 있다.

#### ► private 정의

- 비공개성
  - ('클래스 멤버'의 경우) **같은 클래스에 속한 다른 멤버들만**, ('클래스, 최상위 함수/프로퍼티'의 경우) **파일 내부에서만** 접근할 수 있다.
  - 클라이언트 코드에 직접적인 영향이 없다. (변경, 심지어 삭제하더라도)
- 주로 '클래스 멤버'에 사용된다.
- 라이브러리 설계자는 클라이언트 프로그래머에게 필요한 함수와 클래스만 외부에 노출시키고, 가능한 한 많은 요소를 private으로 선언하다.
- 내부 구현을 노출시켜야 하는 경우(극히 드묾)를 제외하고는, 프로퍼티를 private으로 만들어라.
  - 하지만 클래스 내부에 있는 참조를 private으로 정의한다 해도 그 참조가 가리키는 객체에 대한 public 참조가 없다는 사실을 보장해주지는 못한다.
    - `에일리어싱(aliasing)`: 한 객체에 대해 참조를 여러 개 유지하는 경우
- 장점
  - 같은 패키지 안의 다른 클래스에 영향을 끼칠지 걱정하지 않으면서 코드 변경이 가능하다.
  - 클래스 외부에서 실수로 사용하는 경우를 방지할 수 있다.
  - 마음대로 변경하거나 제거하지 못하게 할 수 있다.
    - 이러한 이유로 '도우미 함수'는 private으로 선언해야 한다.
    - `도우미 함수(helper function)`: 클래스 안에서만 쓰이는 함수

#### ► internal 정의

- private과 public의 중간
  - private으로 정의하자니 제약이 너무 심하다고 느껴지고, public으로 정의하자니 공개 API의 일부분으로 포함시키기는 애매할 경우
  - **모듈 내부에서만** 접근할 수 있다.
    - `모듈(module)`: 코드 기반상에서 논리적으로 독립적인 각 부분
    - 큰 프로그램을 하나 이상의 모듈로 분리하면 유용하다.
      - cf) 프로젝트를 모듈로 나누는 방법은 '빌드 시스템'(EX. 그레이들, 메이븐)에 따라 달라진다.
    - 모듈은 고수준 개념이지만, `패키지`를 사용하면 더 세밀한 구조를 정의할 수 있다.
  - `라이브러리`: 일반적으로, 다양한 '패키지'가 들어있는 단일 '모듈'로 구성된다.
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
  - 패키지의 컴포넌트 사용 가능
  - 하나 이상의 name을 현재 namespace에 도입한다.
  - 별표(*) => 패키지에 속한 모든 컴포넌트를 임포트
    - 컴포넌트를 개별적으로 선택도 가능

- 패키지 (package)
  - 연관 있는 코드들의 모음 ; ⊃ 여러 함수 & 클래스
  - 목적
    - 보통 특정 문제를 풀기 위해 고안됨
    - 코드의 재사용
      - 재사용이 가능한 라이브러리 컴포넌트를 원하는 만큼 묶을 수 있다.
      - 한 파일 안에 여러 컴포넌트를 넣어도 되고, 같은 패키지 이름으로 여러 파일에 컴포넌트를 분산시킬 수도 있다.
    - main()이 아닌 함수, 클래스 등을 정의하는 파일이, 다른 파일에 정의된 이름과 충돌하지 않도록 방지하기 위함
      - 다만, main() 함수만 들어 있는 파일에는 보통 package 문을 넣지 않음
  - package 키워드
    - 위치: 코드의 가장 앞부분
  - 패키지 이름
    - 유일(unique)해야 한다.
    - 관습적으로 도메인 이름을 '역순으로' 한 이름으로 시작한다.
      ```kotlin
      // 도메인 이름: yoururl.com
      package com.yoururl.libraryname
      ```
    - 코틀린 VS. JAVA
      1. 코틀린
         - '소스 코드 파일 이름'과 '클래스 이름'이 일치하지 않아도 OK
         - '패키지 이름'과 '디렉터리의 경로'가 무관하다.
           - BUT 패키지 이름과 디렉터리의 경로를 '똑같이' 하는 것이 '좋은 스타일'로 여겨진다.          

         i) 코틀린과 자바 프로젝트를 섞어 쓰는 경우
            - 자바의 관습을 유지할 것을 권장 in 코틀린 스타일 가이드
         
         ii) 순수 코틀린 프로젝트의 경우
            - 프로젝트 디렉터리 구조의 최상위에 패키지 이름(ex. libraryname)을 위치시킨다.
      2. JAVA
         - '소스 코드 파일 이름'과 '클래스 이름'이 일치해야 한다.
         - 완전한 '패키지 이름'과 '디렉터리의 경로'가 일치해야 한다.
            ```kotlin
            // 디렉터리의 경로: com/yoururl/libraryname
            package com.yoururl.libraryname
            ```

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
  - `sorted()`, `reversed()`: '새로운' List를 생성하여 돌려준다. 따라서 List의 원본은 그대로 잘 남아있다.
  - `sort()`: List의 원본을 직접(in place) 바꾼다.
  - `first()`: 맨 첫 원소
  - `takeLast(n)`: 맨 뒤에서 n개의 원소
  - `sum()`: 모든 원소의 합

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

### 26. 집합 (Set)

- 자동으로 중복을 없애고 '오직 하나'의 값만 남기는 컬렉션
- 원소 순서는 중요하지 않다.
- `in`, `contains()` ☞ 원소인지 여부 검사
- 일반적인 벤 다이어그램 연산
  - 점 표기법(set.union(other)) 또는 중위 표기법(set union other)
    - 부분집합 ☞ `containsAll()`
    - 합집합 ☞ `union()`
    - 교집합 ☞ `intersect()`
    - 차집합 ☞ `subtract()`, `뺄셈 연산자(-)`
- 원소의 추가/삭제 ☞ `+=, -= 연산자`
- List에서 중복을 제거하고 싶다면
  1) Set으로 변환한다.
  2) List를 반환하는 distinct() 함수를 사용한다.
- String에 들어 있는 유일한 문자들의 집합을 얻고 싶다면
  - toSet() 함수를 호출한다.
- Set의 생성 함수 (2가지)
  - List와 마찬가지로
  1) `setOf()` ☞ 읽기 전용 집합
  2) `mutableSetOf()` ☞ 가변 집합
  
### 27. 맵 (Map)

- 연관 배열 (associative array)
  - 키(key)와 값(value)을 연결한다. 
    - 즉, 키가 주어지면 그 키와 연결된 값을 찾아준다.
  - `mapOf()`, `to`
    ```kotlin
    val constants = mapOf(
        "Pi" to 3.141,
        "e" to 2.718,
        "phi" to 1.618
    )
    constants eq "{Pi=3.141, e=2.718, phi=1.618}"
    ``` 
  - 간단하고 작은 데이터베이스와 비슷하다.
- Map의 연산
  - `[] 연산자` ☞ 키를 사용해 값을 검색함
  - `맵.keys` ☞ 모든 키 조회
    - 반환값: Set 타입
    - Map에서 각 키는 유일하기 때문이다.
  - `맵.values` ☞ 모든 값 조회
  - `entry(맵 항목)` ☞ 키-값 쌍
    ```kotlin
    for (entry in constants) {
      s += "${entry.key}=${entry.value}, "
    }
    ```
  - 키-값 분리
    ```kotlin
    for ((key, value) in constants) {
        s += "${key}=${value}, "
    }
    ```
  - `map[key] = value` ☞ key와 연관된 value의 추가 및 변경
  - `map += key to value` ☞ 키-값 쌍의 명시적인 추가
  - `+ 연산` ☞ 기존 맵의 원소와 더해진 원소를 포함하는 새 Map의 생성
    - 원래의 Map에는 영향 미치지 않음
    - 읽기 전용의 Map에 원소를 추가하고 싶다면, 새로운 Map을 만드는 수밖에 없다.
- `mapOf()` VS. `mutableMapOf()`
  - 원소가 Map에 전달된 순서가 유지된다.
    - 단, 다른 Map 타입에 대해서는 이를 보장하지 않는다.
  1) mapOf(): 읽기 전용 맵
  2) mutableMapOf(): 가변 맵
- Map에 주어진 키에 해당하는 원소가 존재하지 않는다면
  1) <기본> null을 반환한다.
  2) getValue() 함수
     - 항상 null이 아닌 값을 반환한다.
     - NoSuchElementException을 던진다.
  3) getOrDefault() 함수
     - 가장 나은 대안
     ```kotlin
     val map = mapOf('a' to "attempt")
     map.getOrDefault('a', "디폴트값") eq "attempt"
     map.getOrDefault('c', "디폴트값") eq "디폴트값"
     ```
- Map의 키와 값으로 '클래스 인스턴스'를 설정할 수 있다.

### 28. 프로퍼티 접근자 (Property Accessor)

- 코틀린은 '함수'를 호출하여 프로퍼티의 읽기 & 쓰기 연산을 수행한다.
  1. **get() 함수** ☞ 읽기 연산, 게터(getter)
  2. **set() 함수** ☞ 쓰기 연산, 세터(setter)
  - 위치: **프로퍼티 정의 바로 뒤**
    - 연결된 프로퍼티보다 더 안쪽으로 **들여쓴다**. 다만, 코틀린은 들여쓰기를 신경 쓰지 않는다. 
    - 즉, 프로퍼티와 게터/세터 연결은 들여쓰기 때문이 아니라, 프로퍼티 정의 바로 뒤에 게터/세터를 정의했기 때문이다.
  - 순서: 중요하지 않다.
  - 게터/세터 모두 정의함 OR 하나만 정의함 OR 모두 정의 안 함, 모두 가능하다.
    - 따로 정의하지 않으면, '프로퍼티의 디폴트 행동 방식'을 따른다.
    - 프로퍼티의 디폴트 행동 방식
      - 게터: 저장된 값을 돌려준다.
      - 세터: 저장된 값을 변경한다.
  - field
    - 게터/세터 안에서 저장된 값에 직접 접근 가능한 이름
    - 게터/세터 안에서만 접근 가능하다.
  - 직접 '프로퍼티 접근자'를 작성하여, 프로퍼티 읽기와 쓰기 연산을 **커스텀화**할 수 있다.

- 프로퍼티를 **private**으로 정의하면, 두 접근자 모두 private이 된다.
  - 세터는 private, 게터는 public으로 설정 가능하다.
    - 이렇게 하면 프로퍼티 값을 읽는 것은 밖에서도 가능하지만, 프로퍼티 값을 변경하는 일은 클래스 내부에서만 가능하다.
    - private set
- 일반적으로 프로퍼티는 값을 필드에 저장한다.
  - cf) 필드 없는 프로퍼티
    - 내부에 저장된 상태가 없고, 접근이 이뤄질 때 결과를 계산해 돌려준다.
    - '함수'와 비슷하다.
    - 코틀린 스타일 가이드에서는, 계산 비용이 많이 들지 않고 객체 상태가 바뀌지 않는 한, 같은 결과를 내놓는 함수의 경우 '프로퍼티'로 변환하는 편이 낫다고 안내한다.
      - 프로퍼티의 장점: 어떤 객체의 특성(property)일 경우, '함수'보다는 "프로퍼티"를 사용한 코드가 **더 가독성이 좋다**.
      - BUT 무조건 모든 함수를 프로퍼티로 변환하지는 말라. 먼저 어떻게 읽히는지를 살펴보고 판단하라.
- 프로퍼티 접근자는 프로퍼티에 대한 일종의 보호 수단을 제공한다.
  - 장점
    - '필드 접근'처럼 쉽게 프로퍼티에 접근하도록 허용한다. 
    - 프로퍼티 접근을 제어하거나 변경할 수 있는 코드를 쉽게 추가할 수 있다.
  - VS. 필드 접근

## 3. Usability
## 4. Functional Programming
## 5. Object-Oriented Programming
## 6. Preventing Failure
## 7. Power Tools
## 8. Appendices