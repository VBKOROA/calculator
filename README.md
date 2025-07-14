<div align="center">

# 🚀 Sparta Calculator 🚀

**Modern Java를 활용한 고성능 콘솔 계산기**

<p>
  <img src="https://img.shields.io/badge/Java-17-blue.svg?style=for-the-badge&logo=java" alt="Java 17"/>
  <img src="https://img.shields.io/badge/Gradle-8.7-green.svg?style=for-the-badge&logo=gradle" alt="Gradle 8.7"/>
</p>

</div>

> 💡 단순한 연산을 넘어, Java의 ENUM, Generic, Lambda, Stream 등 모던 기능을 통해 객체지향 설계 원칙과 클린 코드를 학습하고 적용하는 것을 목표로 합니다.

---

## ✨ 주요 기능

| - | 기능 | 설명 |
| :---: | :--- | :--- |
| 🛡️ | **타입-안전 연산** | `Enum`과 `Lambda`를 결합하여 연산자별 로직을 캡슐화하고, 컴파일 타임에 타입 안정성을 보장합니다. |
| 💎 | **유연한 결과 관리** | `Generic`을 활용하여 정수, 실수 등 다양한 숫자 타입의 계산 결과를 유연하게 저장하고 관리합니다. |
| ⚡ | **고성능 데이터 처리** | `Stream API`를 사용하여 저장된 결과 목록을 간결하고 효율적으로 필터링하고 검색합니다. |
| 🚨 | **맞춤형 예외 처리** | `DivideByZeroException` 등 비즈니스 로직에 특화된 맞춤형 예외를 통해 코드의 안정성을 높입니다. |

---

## 🏁 시작하기

### ✅ 요구 사항

*   JDK 17 이상
*   Gradle 8.7 이상

### 🛠️ 실행 방법

1.  프로젝트를 로컬 환경에 클론합니다.
    ```bash
    git clone https://github.com/your-username/sparta-calculator.git
    ```
2.  프로젝트 루트 디렉토리로 이동하여 Gradle Wrapper를 실행합니다.
    ```bash
    ./gradlew run
    ```
3.  콘솔 안내에 따라 계산을 진행합니다.

<details>
<summary>🖥️ 실행 예시 보기</summary>
<br>

```
첫 번째 정수: 10
두 번째 정수: 5
연산자 (+, -, *, /): *
결과: 50

종료하시겠습니까?(exit):
```

</details>
