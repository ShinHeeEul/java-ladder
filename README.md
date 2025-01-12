# java-ladder

## 학습

### **리팩토링에 대한 이해**<br>
> **리팩토링(Refactoring)이란?**<br>

리팩토링(refactoring)은 소프트웨어 공학에서 '결과의 변경 없이 코드의 구조를 재조정함'을 뜻한다.<br> 주로 **가독성을 높이고 유지보수를 편하게 한다.** 버그를 없애거나 새로운 기능을 추가하는 행위는 아니다. 사용자가 보는 외부 화면은 그대로 두면서 내부 논리나 구조를 바꾸고 개선하는 유지보수 행위이다.<br> 이를 토대로 여러명의 사람들과 협업 작업을 하게 될 때, 다른 사람의 코드에 대해 이해성을 높일 수 있도록 도와준다.

> **리팩토링 필요성**<br>

1. 소프트웨어 설계에서 질적 향상을 위해 리팩토링을 한다. 코드 중복을 제거하고 수정 용이성을 향상시키기 위함이다.
2. 소프트웨어 이해도를 향상, 가독성 향상을 위해 한다.
3. 버그를 찾는데 도움이 된다.
4. 프로그램 개발 속도가 향상된다. 좋은 설계 기반에서 개발 속도를 단축할 가능성이 높아진다.

> **리팩토링은 언제 하면 좋을까?**<br>

1. The Rule Of Three: 유사한 내용이 세번 이상 반복할 떄 리팩토링 고려
2. 새로운 기능을 추가할 때(새로운 기능을 추가하기 어려워 보인다면 고려)
3. 쓰레기 줍기 리팩토링(비효율적으로 처리하는 모습이 보일 때)
4. 코드 리뷰할 

> **두개의 모자**<br>

소프트웨어를 개발할 때 목적이 **기능 추가**인지, **리펙토링**인지 명확히 구분하여 작업해라.



### **TDD에 대한 이해**<br>
> **TDD(Test Driven Development)란?**<br>

 테스트 주도 개발(TDD)이란 소프트웨어 개발 방법론 중 하나로, 선 개발 후 테스트 방식이 아닌 선 테스트 후 개발 방식의 프로그래밍 방법을 말한다.<br>
        다시 말해 개발 종료 조건을 코드를 짜기 전에 조기에 작성을 하는 방식이다.<br>
        
> **TDD의 필요성**<br>

불확실성이 높을 때 피드백과 협력이 중요하기 때문에 피드백과 협력이 자주 이루어지는 TDD를 통해 좋은 결과를 만들 수 있다.<br>
내가 지금 만들려고 하는 코드가 어떠한 결과를 만들어낼 것 인지를 인지하고, 그 결과를 코드로 구현하는 것이다.<br>
        
> **TDD의 장점**<br>

1. 개발의 방향을 잃지 않게 유지<br>
2. 품질 높은 소프트웨어 모듈 보유<br>
3. 자동화된 단위 테스트 케이스를 가짐<br>
4. 사용 설명서 & 의사소통의 수단<br>
5. 설계 개선<br>
6. 보다 자주 성공<br>
7. 테스트되지 않는 코드가 없음<br>
8. 구현보다는 인터페이스에 집중하게 해줌<br>
        
> **TDD의 단점**<br>

1. 숙련되기까지 다소 시간이 많이 소요<br>
2. 선행 투자가 많이 필요 (**비용의 문제**)<br>
3. 확실성이 높은 프로젝트의 경우 비효율적인 개발 진행<br>
        
> **TDD 사용 툴**<br>

JUnit<br>
        
###  객체 지향에 대한 고민과 이해<br>

> **객체 지향이란?**<br>

우리가 실생활에서 쓰는 모든 것을 객체라 하며, 객체 지향 프로그래밍은 프로그램 구현에 필요한 객체를 파악하고 각각의 객체들의 역할이 무엇인지를 정의하여 객체들 간의 상호작용을 통해 프로그램을 만드는 것을 말한다. **객체는 클래스라는 틀에서 생겨난 실체(instance)** 이다.<br>
객체 지향 모델링은 기능이 아닌 **객체가 중심** 이 되며 "누가 어떤 일을 할 것인가?"가 핵심이 된다. 즉, 객체를 도출하고 각각의 역할을 정의해 나가는 것에 초점을 맞춘다<br>
        
> **객체 지향의 특징**<br>

1. **추상화**<br>

*  객체들의 공통적인 특징(기능, 속성)을 도출하는 것<br>

* 클래스를 정의하는 것<br>

2. **캡슐화**<br>

* 실제 구현되는 부분을 외부에 드러나지 않도록 하는 것<br>

* 외부와 상호작용할 때는 메소드를 이용하여 통신<br>

3. **상속성**<br>

* 하나의 클래스가 가진  특징을 다른 클래스가 그대로 물려받는 것<br>

4. **다형성**<br>

* 약간 다른 방법으로 동작하는 함수를 동일한 이름으로 호출하는 것<br>

* 동일한 명령의 해석을 연결된 객체에 의존하는 것<br>

5. * **오버라이딩(Overriding), 오버로딩(Overloading)**<br>

- 오버라이딩(Overriding) - 부모 클래스의 메소드와 같은 이름을 사용하며 매개변수도 같되 내부 소스를 재정의하는 것<br>

- 오버로딩(Overloading) - 같은 이름의 함수를 여러 개 정의한 후 매개변수를 다르게하여 같은 이름을 경우에 따라 호출하여 사용하는 것<br>     

6. **동적 바인딩**<br>

* [가상 함수](https://ko.wikipedia.org/wiki/%EA%B0%80%EC%83%81_%ED%95%A8%EC%88%98)를 호출하는 코드를 컴파일할 때, [바인딩](http://www.tcpschool.com/php/php_oop_binding)을 실행 시간에 결정하는 것<br>
            
> **객체 지향 생활 체조 원칙 9단계 (소트웍스 엔솔로지)란?**<br>

마틴 파울러의 책 소트웍스 앤솔러지에 나온 9가지 원칙이다.<br>
객체지향 생활체조 원칙은 좋은 품질의 소프트웨어를 만들기 위한 **응집도(cohension), 느슨한 결합(loose coupling), 무중복(zero duplication), 캡슐화(encapsulation), 테스트 가능성(testability), 가독성(readability), 초점(focus)** 을 실현하기 위한 훈련 지침이다.<br>

> **[객체 지향 생활 체조 원칙 9단계](https://hudi.blog/thoughtworks-anthology-object-calisthenics/)**<br>
1. 한 메서드에 한 단계의 들여쓰기만 허락한다.<br>
2. else를 쓰지 않는다.<br>
3. 모든 원시값과 문자열을 객체로 포장(wrap)한다.<br>
4. 한줄에 점을 하나만 찍는다.<br>
* 디미터 법칙 : 친구하고만 대화하라<br>
5. 줄여쓰지 않는다.<br>
6. 모든 entity를 작게 유지한다.<br>
7. 2개 이상의 인스턴스 변수(기본형 또는 자료구조형 변수)를 가진 클래스를 쓰지 않는다.<br>
8. 일급 컬렉션을 쓴다.<br>
* 일급 컬렉션 장점 4가지<br>
-비즈니스에 종속적인 자료구조<br>
-불변 보장<br>
-상태와 행위를 한 곳에서 관리<br>
-컬렉션에 이름 붙이기 가능<br>
 9. getter/setter/property를 쓰지 않는다.<br>

## 실습
위 원칙을 지키며 사다리 게임을 제작하였다.
> LadderGameFactory Class

* 사다리 게임 유형에 따라 사다리 게임을 생성하는 정적 팩토리 메서드 클래스

> LadderGame Class

* 사다리 게임 전체를 관리하는 클래스

> LadderRunner Class

* 사다리 게임을 실행시키는 클래스

> LadderCreator Interface

* 사다리 게임 생성에 필요한 메서드들이 선언되어있는 클래스

> LadderNormalCreator Class

* 사다리 긋는 것을 사용자가 지정할 수 있게 해주는 클래스

> LadderRandomCreator Class

* 사다리 긋는 것을 랜덤하게 해주는 클래스

> Col Class

* 사다리의 열을 관리하는 클래스

> DrawLadder Class

* 사다리를 출력해주는 클래스

> Position, PositiveNum, LadderSize Class

* 사다리 게임에 필요한 변수들이 사다리 내부에서 움직일 수 있도록 Validate 해주는 클래스

> Direction Enum Class

* 좌,우, 아래의 값을 관리하는 Enum 클래스

## 결과
![image](https://user-images.githubusercontent.com/83682424/229282197-65495f77-68b5-4d28-8efd-9047cef5754b.png)
<br>
![image](https://user-images.githubusercontent.com/83682424/229282116-a0b6ecf0-b5bf-4f3e-b21c-7b4167147777.png)

