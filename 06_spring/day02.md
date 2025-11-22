## Day2

1. Lombok
   - Lombok은 인도네시아의 섬 이름, 동남아시아의 작은 고추 이름
   - getter/setter를 자동으로 생산성
     age getAge setAge
   - toString() 메서드를 자동 생성

   - Eclipse Spring Starter에서 dependecy에 lombok을 포함시켜도
     제대로 동작하지 않는다.
     => 별도로 설치해야 함.

1) google에서 lombok 검색
2) download 한다. => 더블클릭해서 설치창이 뜨는지 확인
   설치창이 뜨면 3), 4) skip
3) jdk의 bin 폴더에 해당 파일 copy
4) cmd를 통해 bin 폴더 이동 후 java -jar lombok.jar 실행
5) eclipse등(IDE)을 찾는다(자동)
6) eclipse가 위치한 폴더를 선택하여 추가해준다.
7) install/update 버튼을 누르면 설치된다.(0.1초)

- 제대로 설치 했다면 설치 완료 후 eclipse.exe가 설치된 디렉토리에 lombok.jar가 생겨있고
  eclipse.ini를 확인해보면 가장 마지막줄에 -javaagent:C:\설치경로~\eclipse\lombok.jar
  가 추가 되어있다.

  \* test
  com.koreait.board.bean.vo.SampleVO로 확인
  set/get series와 toString 메서드가 자동으로 생성되는지

2. 의존성 주입(Dependency Injection)

- 의존성(Dependency)
  하나의 객체가 다른 객체 없이는 역할을 할 수 없다.
  A객체가 B객체 없이 동작이 불가능한 경우
  'A객체가 B객체에 의존적이다'

- 주입(Injection)
  // user.do?sql=acnt_num=1122 // sql Injection
  외부에서 밀어넣는 것을 의미
  A가 B가 필요하다면 B를 넣어준다.
  A의 입장에서는 어떤 객체인지 모른다.

A >>>>>>>>>>>>>>>>>>>>>>>>> B
A객체에서 B객체를 직접 생성

\*\* 의존성 주입
A >>>>>>>>> ????? >>>>>>>>> B
A객체는 B가 필요하다는 신호만 보내고
B객체를 주입하는 것(갖다바치는 것)은 외부에서 이루어짐

의존성 주입을 위해 ?????? 존재가 필요하다.
?????의 성함은 ApplicationContext이며,
필요한 객체를 생성하고, 필요한 객체를 주입해주는 역할

따라서 개발자들은 기존의 프로그램 방식과 달리
객체와 객체를 분리해서 생성하고
이러한 객체를 엮는(Wiring) 작업의 형태로 개발한다.

3. SpringBoot

   - Spring의 각종 설정 요소들을 간편하게 관리
   - 개발의 복잡성, 설정 난이도, 웹 서버+빌드, 배포
     => 이런 것들을 간편하게 처리

4. 디렉토리 설명

   - src/main/java : 서버 단의 java 파일
   - src/test/java : 단위 테스트 java 파일
   - src/main/resources : 설정 파일 및 View
   - resoureces/static : css, js, image, font 경로
   - resoureces/template : html 파일 경로
   - pom.xml : 의존성 관리
   - application.properties : 서버 및 DB 설정 파일

5. MyBatis

   - 자바 퍼시스턴스 프레임워크 중 하나
     : 퍼시스턴스 프레임워크란 XML 서술자나
     데이터의 저장/조회/삭제/변경을 다루는
     클래스와 설정 집합
   - 어노테이션(annotation)이나 XML을 이용하여
     저장 프로시저나 SQL 문과 객체를 연결
   - 아파치 라이선스 2.0 -> Free S/W

6. MyBatis 사용 방법

   - Config를 통해 Config/Driver/SessionFactory 구성
   - Annotation 방식 또는 XML 방식의 활용

     \1) Annotation
     @Select("SELECT 1 FROM DUAL");
     public String getDual(); // String으로 값을 돌려줌

     \2) XML
     public String getDual2(); // in Java

     <select id = "getDual2">
        SELECT 1 FROM DUAL
     </select>
