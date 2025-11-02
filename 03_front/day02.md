Day2

1. HTML, CSS, JavaScript
(1) 웹 페이지의 구성 요소
    - 웹 페이지 구성(구조) 및 내용 : HTML
    - 웹 페이지의 모양 : CSS(Cascading Style Sheet) //중첩
    - 웹 페이지의 행동 및 응용 : JS

(2) HTML5
    - 표준화된 태그로 웹 페이지를 작성하는 언어(프로그래밍 언어 X)
      <img>, <hr>, <table>, <li>
    - 비표준 기술의 혼재, 웹 브라우저의 비호환성
      ActiveX, 플러그인, 플래쉬 등 비표준 기술이 난립
    - 인터넷 기기가 다양화 
      PC, Mobile 등에서 모두 웹 사용,
      기존 페이지가 모바일에서 작동하지 않음
    - 새로운 웹 표준의 필요성 -> HTML5 + CSS3
      
(3) HTML과 웹 표준
1) HTML(HyperText Markup Language)
    웹 페이지에서 다른 페이지로 이동할 수 있게 하는 마크업 언어
    마크업 언어 : 태그 방식으로 문서나 데이터의 구조를 기술하는 언어

2) CSS(Cascading Style Sheet)
    어떤 스타일로 요소가 표시될 것인가를 정하는 규격
    HTML로 문서 구조 및 꾸미기를 할 수도 있으나
    동일한 디자인을 사용한 페이지가 여러 개 있다면
    변경 시 모두 다 수정해야 함
    CSS는 웹 페이지에서 내용과 스타일을 분리한 것

3) XML(Extensible Markup Language)
    태그로 데이터를 설명

(4) 인코딩
1) EUC-KR
    완성형 - 만들어져 있는 글자를 찾아서 사용

2) UTF-8
    조합형 - 자음, 모음, 받침 등 글자를 만들기 위한 요소를
            찾아서 사용 - 햏자

(5) 웹 접근성
    모든 사용자가 신체적, 환경적 조건에 관계없이 웹에 접근
    마우스가 없어서 키보드로 조작해야 하는 상황
    신체적 장애로 특수 환경에서 접속하거나
    모바일 환경에서 접속하는 경우 등을 모두 충족해야 함

2. HTML 개발 준비
(1) Chrome 브라우저
(2) Visual Studio Code
    - 무설치 버전 압축 풀기 + 빈 data 폴더 생성
(3) Visual Studio Code Setting
    - File > preference > Configure User Snippets
    - 파일 > 기본설정 > 코드 조각 구성

3. HTML의 요소
    <p> My name is None. </p> 
    1   2                3

    1 : Opening Tag - 요소의 이름과 <>로 구성
    2 : Contents(text) - 요소의 내용이며 단순한 텍스트
    3 : Closing Tag - 1과 같으나 이름 앞에 /가 있음

4. Nested Element(중첩 요소)
    요소 안에 다른 요소 넣기
    <p>I'm <strong>very</strong> happy.</p>

5. Paragraph Tag(단락 태그)
    단락 : 내용상 끊어서 구분할 수 있는 하나의 부분
          다른 말로는 "문단"이라고도 함

    <p> 태그로 단락 표현

    단락의 제목 태그 : <h1> ~ <h6>

6. 서식 태그
    <strong>, <b> : 강조(진한 글씨)
    <em>, <i> : 글씨 기울이기(italic)
    <mark> : 하이라이트(형광)
    <del> : 취소선, 텍스트 중간에 가로줄 긋기
    <ins> : 텍스트 아래에 줄긋기
    <sup>, <sub> : 위 첨자, 아래 첨자
    
7. link(링크) 태그
    HTML link : 현재 페이지에서 다른 페이지로 이동하는 목적
    하이퍼링크 또는 링크라고 부르며 <a> 태그를 사용
    <a href="경로 또는 외부 사이트 주소" target="보여줄 창">
        문자열 또는 이미지 등
    </a>

8. image(이미지) 태그
    웹에서 주로 사용되는 이미지를 불러오는 태그
    <img src="이미지 경로" alt="대체 문자열">
    이미지 경로는 절대 경로와 상대 경로가 있음
    절대 경로는 /images/intro/4224.jpg
    상대 경로는 html이 위치한 곳에서 ..(한단계 위) .(현재 위치)
    /webdoc/html/각종html
    /webdoc/images/각종image => ../images/이미지파일명

    /webdoc/html/각종html
    /webdoc/html/images/각종image => ./images/이미지파일명
    
    이미지 3개를 다운 받고 src/images에 복사하시오.

