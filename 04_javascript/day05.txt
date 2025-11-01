Day5

1. BOM(Browser Object Model)
(1) window 객체
    - 웹 브라우저의 창을 나타내는 객체
    - 자바스크팁트의 모든 객체, 전역변수, 전역함수들은
      자동으로 window 객체의 프로퍼티가 됨

      1) window.onload = funtion(){

         }

        윈도우가 준비가 끝났다 -> 실행
      2) window.open() 
          - 새로운 브라우저 창을 여는 메서드
          - 내 페이지에, 새 페이지에, 부모 페이지에, 자식 페이지에
          - 기본 사용법
              var 객체명 = window.open(url, name, spec)  
                  url : 이동할 주소
                  name : _blank(새창), self(현재 페이지)
                         _parent(부모 프레임), _child(자식 프레임)
                  spec : 크기  

(2) location 객체
        - 현재 브라우저에 표시된 HTML 주소와 관련
        - var site = location.href; // 현재 주소를 사이트에 저장
        - location.href = "http://www.naver.com";
        - location.href = "https://search.naver.com/search.naver?query=" + 변수명

1.5 Vanilla Javascript : 순수 js

2. jQuery 
    유용하게 쓰이는 자바스크립트의 모음
    요소(Element)들을 선택하는 강력한 방법을 제공
    간결한 문법
    선택한 요소들을 효고하저긍로 제어하는 라이브러리
    => jQuery 등 때문에 순수한 javascript를 vanilla js라고 부름

(2) jQuery의 단점
    순수 자바스크립트 보다 속도가 느림
    파일 자체가 무거움
    60% 이상의 사이트가 사용 중이며 상황에 따라 사용 여부 결정
    => React, Vue.js

(3) 기본 문법
    document.querySelectorAll("div.container");
    $("div.container")
    
    $("CSS Selector")
    - # : 아이디
    - . : 클래스
    - 태그 : 태그명
    - 태그[속성명=속성값] input[name="야"]

(4) 사용 방법
    
    - 값을 가져오기 
        <button value="AAA">BBB</button>
        $("button").val() => AAA
        $("button").text() => BBB
    
    - 값을 변경하기
        $("button").val("CCC") => AAA가 CCC로 변경
        $("button").text("DDD") => BBB가 DDD로 변경
    - 반복문
        $(...).each(iterator, function(index, item){

        });

(5) 설치 방법
    Google 등 검색엔진에서 jQuery 검색 -> 사이트 방문
    1) 다운을 받아 저장한 후 <script src="파일명"></script>
    2) Web을 직접 링크

3. KakaoMap
    - 카카오개발자 사이트 로그인/등록하기
    - developers.kakao.com
    - 내 앱 생성
        - 각종 key가 발급됨(javascript)
    - 플랫폼 등록 (web)
        - http://127.0.0.1:5500
    - 카카오맵의 활성화 설정을 ON으로 변경
    - Visual Studio Code에서 Five Server
    - Alt + L + O => 현재 코딩 페이지가 서버로 기동
    - 화면 권환에 위치 정보 허용