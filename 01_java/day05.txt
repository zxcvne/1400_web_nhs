Day5

1. 배열(Array)
    - 동일한 특성을 갖는 여러 개의 변수의 모음
    - 학생 이름에 대한 1000개의 변수
    stdName000 ~ stdName999에 학생 이름 부여
    이상한 요구 : 모든 학생 이름 앞에 knight.
    - stdName000 = "knight." + stdName000;
    ...
    stdName999 = "knight." + stdName999;
    - String[] stdName = new String [1000];
    for(int i = 0; i < stdName.length; i++){
        stdName[i] = "knight." + stdName[i];
    }
    - 배열은 자체적으로 length라는 변수 보유
      => 배열의 길이(개수)가 얼마인가 => 배열이름.length
    - 값 한 개만 존재 : scalar
      값 여러 개가 존재 : vector(1차원 배열)
      여러 개가 여러 묶음 : matrix(다차원 배열)

2. 클래스와 객체 지향(Object-Orinented)
(1) 정의 
    클래스(class) : 설계도
    객체는(object) : 설게도로 만든 제품

    클래스는 객체로 만들어져야 의미가 있다.
    cf) Apple 과 An Apple

    객체 지향 언어는 개발 최소화가 목적
    객체 지향 프로그래밍은 클래스를 디자인 하는 것

    학생 A, 학생 B, 학생 C
    다 학생
    다 사람
    다 동물
    다 만물(Object)