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

## 3. Usability
## 4. Functional Programming
## 5. Object-Oriented Programming
## 6. Preventing Failure
## 7. Power Tools
## 8. Appendices