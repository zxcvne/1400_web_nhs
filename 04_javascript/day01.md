Day1

1. Javascript(자바스크립트)
(1) 퍼즐 조각처럼 코드 형태로 HTML 내부에 저장
(2) Java와 아무 상관 없음
    - Java + Script
      당대 유명했던 언어 Java
      간단하게 구성하는 언어를 일컫는 Script의 합성어
    - Java is Javascript = Ham is Hamster
    - Javascript의 최초 이름은 Livescript
      당시 인기 언어였던 Java 프로그래머들을 유입하기 위한 목적
    - 학습 초기에는 Java와의 유사성이 잘 안보임
      중기 이후에는 Java와의 유사성이 많이 발견됨
(3) 컴파일 과정 없이 브라우저 내부의 자바스크립트 처리기로 해석
    * 개발의 발전을 통해 컴파일도 가능해졌으며,
      node.js로 서버 구축도 가능
    * github 기준으로 파일 개수 상 1위

    [index.html]
    <script>
        자바스크립트 코드 > 인터프리터 > 결과를 출력
    </script>

(4) 주요 기능
    - 웹 페이지는 크게 3요소(html, css, javascript)
    - javascript는 사용자의 입력을 처리하거나
      웹 어플리케이션을 작성하는 등 웹 페이지의 동적 제어에 사용

    1) 사용자의 입력 및 계산
        HTML의 form은 입력 창만 제공
        Key, Mouse의 입력 및 데이터 검증 등은 자바스크립트
    2) 웹 페이지 모양의 동적 제어
        HTML 태그의 속성이나 컨텐츠, CSS설정값을 변경하여
        웹 페이지의 동적인 변화를 일으키는 데 사용
    3) 브라우저 제어
    4) 웹 서버 통신 : Ajax(에이잭스)
    5) 웹 어플리케이션 작성(API)
        다양한 API가 제공되므로 다양한 웹 어플리케이션 개발 가능

2. 실습
    - 인터넷에서 같은 사진인데 칼라/흑백 을 다운로드한다.
    - 마우스 오버, 아웃, 클릭, 더블클릭 시 행동 프로그래밍        

3. Javascript의 위치
(1) HTML 태그 내의 이벤트 리스너(Event Listener) 속성에 작성
    HTML 태그에는 마우스를 클릭하거나 키보드의 키를 입력하는 등
    이벤트가 발생하는 경우 처리하는 코드를 등록하는
    리스너 속성이 있어 이 곳에 코드를 작성한다.
(2) <script> 태그 내
    <script> ~ </script>로 작성되며 html 어디에 있어도 가능
    또한 나누어서 작성해도 문제 없음
(3) 외부의 자바스크립트 파일에 작성
    자바스크립트 부분을 확장자가 js인 별도의 파일로 저장
    1) 코드가 매우 길어서 동적 부분을 분리
    2) 다수의 html에서 사용할 목적
(4) URL 부분에 작성
    <a> 태그 속성 중 href 속성이 있으며
    이 곳에 자바스크립트 작성 가능
    => javascript: 키워드 사용

4. Javascript로 HTML 요소 출력
    document.write() 또는 document.writeln()

    * writeln은 줄바꿈('\n') 문자가 삽입되지만
      HTML은 줄바꿈 문자를 인식하지 않으므로
      <pre> 태그를 이용하여 줄바꿈을 표현하거나
      <br>을 직접 전달하여 줄바꿈을 구현

5. Dialog
    * modal or modeless
      modal : 다이얼로그가 닫히기 전에 다른 액션 불가
      modeless : 다이얼로그와 별도로 다른 액션 가능

(1) alert
    alert("메시지");      
    warning의 방식 : 정보를 display -> 닫기 버튼

(2) confirm
    answer = confirm("메시지");
    확인/취소 버튼 존재
    사용자가 확인을 누르면 true가 리턴
    사용자가 취소를 누르면 false가 리턴

(3) prompt
    result = prompt("메시지", "디폴트 입력값");
    디폴트 입력값은 안 넣어도 됨(필수값 X)
    아무 것도 입력하지 않고 확인을 누르면 ""이 리턴
    취소 또는 강제로 닫으면 null이 리턴