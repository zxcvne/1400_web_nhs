Day3

// 배치 : 정해진 시간에 돌도록 스캐쥴링이 되어있는

1. 사용자 입력
                
(1) 프로그램이 수행 시작될 때 입력받는 방법
    자바실행 : 1) javac.exe 클래스명.java -> 클래스명.class
              2) java.exe 클래스명
                 java.exe 클래스명 입력값1 입력값2 입력값N
                 회사, 학교, 기관에서 (보통) 야간 배치 작업을 할 때 주로 사용
                 입력값 샘플) 20250704
                 Run > Run Configuration... > argument 탭
                 ex) java UserInput 20250705 Admin 7

(2) 프로그램이 수행하다가 필요할 때 물어보는 방법
    -> Scanner 클래스 이용
    1) java.util.Scanner를 import
    2) Scanner sc = new Scanner(System.in);
    3) 다양한 방법으로 입력을 받는다.
        sc.next() : 문자열
        sc.nextInt() : 정수
        sc.nextFloat() : 소수(float)
        sc.nextDouble() : 소수(double)

2. Random 클래스
(1) 임의의 수를 얻는 도구
(2) 사용방법
    1) java.util.Random import
    2) Random rd = new Random();
    3) 다양한 방식으로 임의의 수를 얻는다.
        rd.nextInt(): 정수의 범위중 한 개의 수
        rd.nextInt(숫자): 0부터 숫자 -1까지 중 한개의 숫자
        rd.nextFloat(): 0부터 1 사이의 float 한 개
        rd.nextDouble(): 
3. 제어문(Control Statement)
    - 프로그램의 실행 순서를 변경하거나
      조건에 따라 실행하거나 안하거나
      특정 부분을 반복하거나 할 때 사용하는 구문

    - 제어문에는 크게 3종류가 존재
    1) 조건문 : if, switch
    2) 반복문 : while, for, do while(이거 거의 안씀)
    3) 기타 : break, continue

(1) if Statement
    1) 사용 방법
       if(조건1){
            // 조건1이 참일때
       }
       else if(조건2){
            // 조건1이 거짓이고 조건 2가 참일때
       }
       ...
       else if(조건N){
            // 앞의 조건이 모두 거짓이고 조건 N이 참일때        
       }
       else{
            // 모든 조건이 거짓일때 실행할 구문
       }

       다양한 케이스가 있을 수 있음
       if 
       if else
       if else if
       if else if else

(2) switch statement
    - switch case
    - 조건식의 결과가 아니라, 값으로 비교
    - 특정 조건 하에서 if보다 속도가 빠름

    switch(변수){
        case 값1:
        //  값이 1일때;
            break;
        case 값2:
        //  값이 2일때;
            break;
        case 값3:
        //  값이 3일때;
            break;
        ...
        default:
        //  모든 case에 해당하지 않을 때 수행할 문장;
    }


