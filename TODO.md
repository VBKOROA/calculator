### Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

- [ ]  **양의 정수(0 포함)를 입력받기**
    - [ ]  Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
    - [ ]  양의 정수는 각각 하나씩 전달 받습니다.
    - [ ]  양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        		    System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            }
        }
        ```
        
- [ ]  **사칙연산 기호(➕,➖,✖️,➗)를 입력받기**
    - [ ]  Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
    - [ ]  사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (`charAt(0)`)
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ...
                System.out.print("사칙연산 기호를 입력하세요: ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. 
            }
        }
        ```
        
- [ ]  **위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기**
    - [ ]  키워드 : `if` `switch`
    - [ ]  사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
    - [ ]  입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
    - [ ]  연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
        - [ ]  ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“
        - 예시 코드
            
            ```java
            public class App {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ...
                    int result = 0;
                    /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                    System.out.println("결과: " + result);
                }
            }
            ```
            
- [ ]  **반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기**
    - [ ]  키워드 : 무한으로 반복, 수정하기 (처음부터 무한 반복하는 것이 아니라, 위 스텝별로 진행하며 수정)
    - [ ]  반복문을 사용합니다. (예를 들어, for, while…)
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                /* 반복문 사용 해서 연산을 반복 */
                ...
                System.out.println("결과: " + result);
                
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
            }
        }
        ```
        

### Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

- [ ]  사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    - [ ]  사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    - [ ]  연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    - [ ]  1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
    - 예시 코드
        
        ```java
        public class Calculator {
            /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
        
            public 반환타입 calculate(...매개변수) {
                /* 위 요구사항에 맞게 구현 */
                /* return 연산 결과 */
            }
        }
        ```
        
- [ ]  **Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정**
    - [ ]  연산 수행 역할은 Calculator 클래스가 담당
        - [ ]  연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    - [ ]  소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.
    - 예시 코드
        
        ```java
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```
        
- [ ]  **App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
    - [ ]  간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
    - [ ]  간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)
    - [ ]  위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.
    - 예시 코드
        
        ```java
        public class Calculator {
        		/* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
        		
            public 반환타입 calculate(...매개변수) {
                ...
            }
            
            /* Getter 메서드 구현 */
            /* Setter 메서드 구현 */
        }
        
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```
        
- [ ]  Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    - [ ]  키워드 : `컬렉션`
        - [ ]  컬렉션에서 ‘값을 넣고 제거하는 방법을 이해한다.’가 중요합니다!
    - 예시 코드
        
        ```java
        public class Calculator {
        		/* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
        		
            public 반환타입 calculate(...매개변수) {
                ...
            }
            
            ...
            
            public void removeResult() {
                /* 구현 */
            }
        }
        
        public class App {
            public static void main(String[] args) {
                /* Calculator 인스턴스 생성 */
        
                Scanner sc = new Scanner(System.in);
        
                /* 반복문 시작 */
                    System.out.print("첫 번째 숫자를 입력하세요:");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();
        
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);
        
                    /* 위 요구사항에 맞게 소스 코드 수정 */
        
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    ...
                /* 반복문 종료 */
            }
        }
        ```