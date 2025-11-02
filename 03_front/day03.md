Day3

- 제니퍼소프트

1. list(리스트) 태그
(1) 순서가 없는 리스트(UL) : unordered list
    <ul>과 <li>
    <ul>
    <li>아이템1</li>
    ...
     <li>아이템n</li>
     </ul>

(2) 순서가 있는 리스트(OL) : ordered list
    <ol type="타입값" start="시작값">
        <li>아이템1</li>
    ...
     <li>아이템n</li>
    </od>

2. input 태그
    사용자로부터 입력을 받기위한 태그로

    * 속성 리스트
    size: 글 상자 크기
    maxlength : 값의 최대 길이
    placeholedr : 입력하기 전에 보여주는 텍스트
    readonly : 편집 불가
    value : 변수값
    required : 필수 항목
    type
        text : 일반 텍스트
        password : 비밀번호
        radio : 하나만 선택 가능
        checkbox : 여러 선택이 가능
        file : 파일 전송
        color : 색상
        email : 이메일
        url : http:// 체크
        tel : 전화번호
        date : 날짜
        number(min="" , max="", step =""): 숫자 크기를 조정하는 상하버튼
        range: 일정 범위 내 값만 입력 가능
        search : 검색어, 우측에 x 표시

3. 테이블(table)
(1) 테이블
    여러 종류의 데이터가 행과 열로 정리된 표
    <table> 태그 사용

    <body width= "80%">
    <table border = "선굵기" align = "정렬위치" width = "50%"> // width = 40% // 부모기준
        <tr>
            <th>이름</th>
            <td>데이터</td>
            <td>...</td>
            <td>데이터</td>
        </tr>
    </table>
    </body>
(2) merge

    1) 열병합
        colspan="합칠 열의 개수"
        <tr><td><td><td><td><td></tr>
        <tr><td><    td    ><td></tr>
        
    =>  <tr><td><td colspan="3"><td></tr>

    2) 행병합

        rowspan="합칠 행의 개수"
        <tr><td rowspan="2"><td><td><td><td></tr>
        <tr>                <td><td><td><td></tr>


(3) caption
    <caption> 태그로 테이블 상단에 짧은 설명을 붙일 수 있음
    테이블 1개당 1개만 가능