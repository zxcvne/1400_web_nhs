Day4

1. advanced <a>
link : 아직 방문한 적이 없음
visited : 한번이라도 가본 적 있음
hover : 마우스를 올려 놓으면
active : 마우스를 클릭하고 있으면
    
    페이지 책갈피
    현재 페이지에서 이동하고 싶은 곳으로 이동하는 법
    <a> 태그의 name 속성을 이용하여 책갈피 생성
    
2. iframe
    - 외부 사이트를 가져와서 링크
    - 내 페이지 안에 있는 것처럼 표현
3. semantic
    - 기존의 <div> 등 의미가 적은 태그들 대신
    의미가 있는 태그를 사용하는 방식
    - <header>, <nav>, <section>, <article>
    <aside>, <footer> 등이 있음
4. CSS
(1) Layout
    - 요소(Element, 버튼 등 웹을 구성하는 모든 것)
    화면에 배치하는 것
    - 기본적으로 위에서 아래로 배치
    - 웹은 다양한 표현이 가능해야 하므로
    속성을 통해서 다양한 배치가 구현 가능
    - 주요 속성
    display : block, inline, inline-block, flex
    position : static, relative, absolute, fixed
    float : left, right

(2) CSS와 External CSS
- CSS는 head 안에 style 태그로 해당 페이지의 스타일을 정의
- 여러 페이지에서 공통적인 style을 사용할 때(거의 대부분)
외부 파일로 CSS를 만들고 이를 link 태그를 통해 사용

1. Display 속성
(1) block
벽돌을 쌓듯이 쌓는 방식
다른 요소가 같은 라인에 존재할 수 없음
대표적인 block 속성의 엘리먼트
- div, header, h1~h6, p, canvas, ol, ul, section
width와 height를 지정할 수 있음

(2) inline
한 줄을 차지하지 않고 우측으로, 아래쪽으로 빈 자리를 차지하며 흐름
대표적인 inline 속성의 엘리먼트
- span, button, map, select, textarea, img
width와 height를 지정할 수 없음

(3) inline-block
inline이면서 block
정렬 등은 inline 속성, width, height 등은 block의 속성

(4) flex
block 속성의 요소들을 여러 형태로 배치해주는 스타일
block 속성의 요소들을 가로로도 배치 가능함

webflow