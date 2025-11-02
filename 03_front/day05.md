Day5

1. Display 속성 실습
    12_css_display.html, css

2. Display: flex 속성 실습
    13_css_flex.html, css

    - div 등의 블럭 속성을 일렬로 배치 가능하도록 조정
    - flex와 justify-Content 속성을 통해 다양한 배치 구현
    * justify-Content
        space-around
        space-evenly
        space-between
        center
        flex-start(left)
        flex-end(right)

3. Layout - position
    - 각 요소가 배치되는 방식(위치)

(1) static(기본)
    - 나오는 순서대로 배치

(2) absolute
    - top, left, right, bottom
    - 상위 엘리먼트의 기준점을 기준으로 위치 지정

(3) relative
    - top, left, right, bottom
    - 내가 원래 있어야 하는 위치를 기준으로 위치 지정

(4) fixed
    - 전체 화면(Viewport)을 기준으로 위치 지정

4. transition(전환)
    - 전환 효과가 적용되는 CSS속성
    - opacity, width, height
      top, bottom, left, right
      color, background-color
      transform

    - 예제
        transition: opacity 0.6s ease-in-out, width
        transition: all 0.6s ease-in-out

        0.6s : 0.6초 동안 변화
        ease-in : 효과를 점점 빠르게
        ease-out : 효과를 점점 느리게
        ease-in-out : 처음에 느렸다가 빨라졌다가 다시 느려지는
        
5. transform
    - 엘리먼트의 이동, 회전, 크기 조정, 기울기 등 적용
    - scale() : 가로/세로 줌을 늘이거나 줄임
    - rotate() : 회전 효과
    - skew() : 기울이는 효과
    - translate() : 이동 효과

* Homework
    CSS의 animation 속성도 찾아보시기 바랍니다.

