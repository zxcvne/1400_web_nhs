## Day1

1.  Spring 프레임워크는 어렵다?

    - 기능이 매우 좋은 장비를 구입하였다.
    - 매뉴얼을 공부하는 시간이 필요한 것은 당연
      => 어려운데 가장 많이 쓰이는 이유가 분명히 있음
      => 전자정부 프레임워크 등 다수의 기업체의 근간 프레임워크

2.  프레임워크

    - 소프트웨어 개발은 분석 > 설계 > 개발
    - 건축과 소프트웨어 개발은 유사성이 높다.

    - 정의
      뼈대나 근간을 이루는 코드들의 묶음

    - 왜 사용하는가?
      개발자들의 개인별 능력차가 크고
      개발자들의 구성에 따라 프로젝트의 성패가 좌우
      이런 상황을 극복하기 위한 코드의 결과물이 프레임워크
      프로그램의 기본적인 흐름이나 구조를 정해져 있는 상태로 시작
      자신의 코드를 추가하는 방식으로 개발

    - 프레임워크의 장점
      개발에 필요한 구조를 이미 코드로 구현
      실력이 부족한 개발자여도 일정 부분 완성한 상태에서
      필요한 부분을 조합하는 형태의 개발이 가능
      => 기업 : 일정한 품질의 결과물을 기대함
      => 개발자 : 완성된 구조에 자신의 코드를 개발하므로
      개발 시간이 단축

3.  웹 개발의 역사

    (1) Http 통신으로 정적 데이터만 전송
    (2) 동적으로 페이지를 보여주는 CGI 등장
    (3) 자바 버전 CGI라고 불리는 서블릿 등장
    (4) 서블릿의 html 작성 방식의 불편함을 줄인
    JSP의 등장
    (5) 자바로 기업 환경의 어플리케이션을 만드는 데 필요한
    스펙들을 모아둔 J2EE(후에 Java EE로 개명) 등장
    -> J2EE는 너무 많은 기술, 다양한 스펙의 집합체
    -> 특히 대규모의 분산처리 시스템을 구축하는
    EJB(Enterprise Java Beans)는 너무 복잡
    -> 서비스의 비즈니스 로직을 구현하는 것보다
    EJB 컨테이너를 사용하기 위해 설정하는 시간이 더 오래 걸림
    -> 개발 시간보다 환경 구축에 더 많은 시간이 소요되어
    EJB 사용이 대세였던 이 기간을 Winter라고 부름

4.  Spring

    - EJB의 통치 기간을 Winter로 비유하면서 지어진 이름
    - 창시자는 로드 존슨(Rod Johnson)
      EJB를 비판하며 책을 쓰고 개선점을 구현한 3만 줄의 예제 제공
      => 책 출간 후 전문가들의 폭발적인 관심으로 오픈 소스 프로젝트 시작

5.  Spring 프레임워크의 특징

    - 복잡함이 싫어서 만들어진 프레임워크
    - 프로젝트 전체 구조를 설계할 때 유용한 프레임워크
    - 다른 프레임워크와 혼용하여 사용 가능(포용)
    - 개발 생산성을 높이며 다양한 개발 도구 지원

(1) POJO 기반의 구성
POJO(Plain Old Java Object)
오래된 방식의 간단한 자바 객체라는 의미 - Java 코드에서 일반적으로 객체를 구성하는 방식을
스프링에서 그대로 사용 가능

(2) 의존성 주입(DI)을 통한 객체간의 관계 구성
(3) AOP(Aspect-Oriented Programming)
(4) 편리한 MVC 구조
(5) 단위 테스트 지원
(6) Annotation 기반의 개발 구조

6. First Work

   (1) Java 21(25), Eclipse JEE 설치
   (2) Eclipse 실행 > Help > MarketPlace
   (3) Spring 검색 > STS 최신(현재는 4) 버전 설치
   (4) 한참 설치 + 2번의 trust > Eclipse 재시작
   (5) New > Spring Starter Project로 프로젝트 생성
   (6) Java 21, Maven, Jar를 선택하고 프로젝트명은 board
   (7) Dependency 9개 추가 - springboot Devtools - Lombok - Spring configuration Processer - JDBC API - MyBatis Framework - MariaDB Driver - Thymeleaf - Spring web - Spring webServices

(8) 우측 하단에 다운로드 표시줄 완료 되기를 기다리기
(9) 프로젝트 우클릭 > Run as > Spring Boot App
=> 반갑게 오류로 맞아줌
(10) BoardApplication.java에서
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
=> DB 자동 연결 해제
(11) Application.properties(나뭇잎) 더블클릭
=> server.port = 10000설정
(12) 웹 브라우저에서 localhost:10000
=> whiteLable Error => 이건 성공이다.
(13) resource/template에
index.html 작성 후 재실행 => 드디어 성공
