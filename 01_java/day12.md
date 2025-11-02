Day12

1. SWING 
(1) 예전에는 Java GUI는 AWT
    SWING은 AWT의 후속 버전으로 기본으로 설치됨

    1) 기본 특징
        컴포넌트가 플랫폼 독립적
        커스터마이징을 통해 look and feel 설정 가능
        다수의 컴포넌트

    2) 사용 방법
        JFrame을 상속
        JFrame 객체를 멤버로 영입

(2) 리스너(Listener)
    이벤트(클릭 등)을 주시하는 역할
    리스너를 달지 않으면 이벤트 발생 시 무시

2. 웹 크롤링(=웹 스크래핑)
    cf) API 방식 : 정해진 약속에 따라 데이터 송수신

(1) 크롤링의 어원
    최초의 검색 엔진 : 크롤러
    클롤러는 무슨 일을 하나요? 크롤링

(2) 웹 상에서 데이터를 수집하고(html)
필요한 데이터만 추출하는 것

(3) 크롤링 라이브러리 
    JSoup 을 이용 : 파이썬의 BeautifulSoup의 자바 버전
    => 구문을 해석하여 필요한 내용만 추출
    JSoup은 HTML 코드에서 내가 필요한 내용만
    CSS Selector 문법으로 가져올 수 있는 라이브러리


(4) 크롤링 절차
    1) Jsoup 라이브러리 다운받기
    2) PC의 내가 아는 디렉토리로 저장
        ex) eclipse > extilb
    3) eclipse에서 프로젝트 우클릭
        맨 아래 Properties > Java Build Path
        > Libraies탭 >  classpath를 선택
        > add External Jars 번튼 클릭 후 파일 선택
        프로젝트 라이브러리에 포함된 것 확인

3. 스레드(Thread)
(1) 정의
    프로세스 내의 메모리 블럭
    동시에 수행 가능한 프로세스

(2) Thread 클래스
    멀티 스레드 구현 가능
    1) Thread(), Thread(String s)
    2) sleep(long msec) : msec 동안 아무 일도 하지 않음
       start() : 스레드 시작, run()를 호출
       run() : 스레드가 실행할 부분
       suspend(), resume() : 중단, 중단된 것을 다시 시작

(3) Thread 구현 방법
    1) Thread Class 상속
    2) Runnable Interface를 구현

* Front의 Ajax와 유사한 개념이 존재
