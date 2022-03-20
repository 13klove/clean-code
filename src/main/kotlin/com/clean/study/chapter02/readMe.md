# 의미 있는 이름

----

## intro
* 변수, 함수, class에 이름을 붙인다.
* 이름을 잘 지으면 의도를 한 번에 파악할 수 있다.
-----
## 의도를 분명히 밝혀라
* 이름에는 존재 이유, 수행 기능, 사용 방법과 같은 의도를 분명하게 밝혀야 한다.


```kotlin
import java.time.Instant
// 지금을 timestamp로 나타낸다.
// 변수로만 의미를 알기 어렵다.
// 의미를 알기 위해서는 코드의 맥락을 알고 있어야 한다.
val d = Instant.now().toEpochMilli()

// 변수명으로 의미를 알기 쉽다.
val currentTimestamp = Instant.now().toEpochMilli()
```

## 그릇된 정보를 피하라
* 잘못된 정보로 이름을 붙이지 않는다.
* 널리 쓰이는 의미가 있는 단어를 다른 의미로 사용하면 안된다.
* 서로 비슷한 이름을 사용하지 않도록 주의한다.
* 유사한 개념은 유사한 표기법을 사용한다.
  * 일관성이 떨어지는 표기법은 그릇된 정보다.

## 의미 있게 구분하라
* 연속된 숫자를 덧분이거나 불용어를 추가하는 방식은 적절하지 못하다.
* 불용어(없어도 의미가 전달되는 단어)로 중복을 발생시키지 않는다.
* 이름이 달라야 한다면 의미도 달라져야 한다.
```kotlin
// 아래 class는 동일한 정보를 가지고 있다.
// 불용어를 추가함으로 중복을 가질 수 있다.
class PersonData()
class PersonInfo()

// 아래 코드에서 개발자는 어떤걸 사용할지 알기 어렵고 중복되는 결과를 가져올 확률이 높다.
fun getActiveAccount() {}
fun getActiveAccounts() {}
fun getActiveAccountInfo() {}
```

## 발음하기 쉬운 이름을 사용하라
* 발음하기 어려운 단어는 협업에도 영향을 준다.
```kotlin
import java.time.Instant

// generate date, year, month, day, hour, minute, second 를 나타낸다.
// genymdhms 변수이름으로 협업보다는 generationTimestamp로 하는게 더 자연 스럽다.
val genymdhms = Instant.now().toEpochMilli()

val generationTimestamp = Instant.now().toEpochMilli()
```

## 검색하기 쉬운 이름을 사용하라.
* 문자 하나를 사용하는 이름, 상수는 텍스트 코드에서 쉽게 눈에 띄지 않는다.
* 상수, 변수는 검색하기 쉬운 이름을 사용한다.
```kotlin
var s = 0
for (i in 0 until 34) {
    s += (t[j]*4)/5
}

// 로직에서 버그 찾기, 가독성을 비교해바도 아래코드가 더 바람직하다.
val realDaysPerIdealDay = 4
const val WORK_DAYS_PER_WEEK = 5
val sum = 0;
for(i in 0 until WORK_DAYS_PER_WEEK) { 
    val realTaskDays = taskEstimate[j] * realDaysPerIdealDay
    val realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK)
  sum += realTaskDays
}
```

## 인코딩을 피하라
* 헝가리식 표기법을 지양한다.
* 자바 프로그래머는 변수 이름에 타입을 인코딩할 필요가 없다.
* 맴버 변수에 접두어를 붙일 필요도 없다.
```kotlin
// 아래와 같이 이름에 타입을 정의하지 않는다.
class PhoneNumber()

val phoneString = PhoneNumber()
```
* 인터페이스 클래스에 인코딩을 하기보다는 구현 클래스에 인코딩을 줄 수 있다.

## 자신의 기억력을 자랑하지 마라
* 변수이름은 문제 영역이나 해법 영역에서 선택해야 한다.
* 문자 하나만 사용하는 변수 이름은 loop에서 반복 횟루를 세는 정도 까지다.

## 클래스 이름
* 명사나 명사구가 적합하다.
* Good
  * Customer, WikiPage, Account
* Bad
  * Manager, Processor, Data, Info

## 메서드 이름
* 동사나 동사구가 좋다.
* Good
  * postPayment, deletePage, save
  * javabean 표준에 따라 get, set, is도 좋다.
* 생성자를 중복정의할 떄는 정적 팩토리 메서드를 사용한다.
```kotlin
val fulcrumPoint = Complex.FromRealNumber(23.0)
```

## 기발한 이름은 피하라
* 특정 문화에서만 사용하는 농담은 피하는편이 좋다.
* 의도를 분명하고 솔직하게 표현하라


## 한 개념에 한 단어를 사용하라
* 추상적인 개념 하나에 단어 하나를 선택해 이를 고수한다.
* 똑같은 매서드를 클래스마다 fetch, retrieve, get으로 ㅈ각각 부르면 혼란스럽다.
* 메서드의 이름은 독자적이고 일관적이어야 한다.

## 말장난을 하지 마라
* 한 단어를 두 가지 목적으로 사용하지 않는다.
  * add라는 메서드는 값 2가지를 받아 결과값을 낸다.
  * 우리는 값 2가지가 아니라 기존 값에 1개의 값을 더하는 기능이 추가되면 add보다는 insert, append와 같은 네이밍이 정확하다.
* 다른 개념에 같은 단어를 사용하면 혼란을 준다.

## 해법 영역에서 가져온 이름을 사용하라
* 전산 용어, 알고리즘, 패턴, 수학 용어 등을 사용해도 좋다.

## 문제 영역에서 가져온 이름을 사용하라
* 적절한 해법 영역에서 용어가 없다면 문제 영역에서 이름을 가져온다.

## 의미 있는 맥락을 추가하라
* 극단적인 예시로 firstName, lastName, street, houseNumber, city, state는 변수를 보면 주소라는 사실을 알게 된다.
* 변수 이름만 firstName이 사용된다면 의미를 파악하기 어렵다. 
* firstName보다는 addrFirstName이 의미있는 맥락이다.
* 하지만 Address라는 클래스를 정의하는게 더 좋은 방법이다.

## 불필요한 맥락을 없애라
* 짧은 이름이 긴 이름보다 좋다. 단 의미가 분명한 경우 한정이다.
* 모든 클래스를 아우르는 맥락을 접두어로 두지 않는다.
* 클래스의 이름으로 좋은것과 인스턴스의 이름으로 좋은것은 다르다.