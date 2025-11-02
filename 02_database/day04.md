Day4

1. insert into select
    - insert할 데이터를 직접 생성하는 것이 아니라
      다른 테이블로부터 가져오는 기술

2. CTAS(씨타스)
    - create table as select
    - 크게 2가지의 용도에서 매우 유용
        1) 테이블의 껍데기만 가져가서 새로 만들고 싶을 때
            -- all data copy(backup)
            create table movie_bak as
            select *
            from   movie
            ;

            -- frame만 만들기(데이터 필요 X)
            create table movie_frm as
            select *
            from   movie
            where  1 = 0
            ;

            -- 2개 이상의 테이블에서 가져온 컬럼으로
            -- 신규 테이블 생성하기
            -- 영화관 정보는 theater에 있다고 가정
            create table movie_theater_info as
            select m.movie_name, m.open_date
                 , t.theater_name, t.address
            from   movie m, theater t
            where  m.theater_id = t.theater_id
            ;

        2) 테이블의 일부만 남기고 지우고 싶을 때
            create table movie_bak as
            select *
            from   movie
            where  open_date >= '20000101'
            ;

            movie와 movie_bak을 바꾸면(exchange) 작업 끝

3. alias
    - 별명
    - 테이블이나 컬럼, 결과집합(ResultSet)의 이름을 다르게 정의
    - 테이블명이나 컬럼명이 길기 때문에 줄여서 부르고 싶을 때 사용

    - open_date => open(개봉) + date(일자)
    - zinv_svc_inv_spc zsis
    - 일반적으로는 테이블의 alias는 1글자 또는 2글자

    - a, b, c, d, e
    - t1, t2, t3 ....
    - m, t

    - movie_name as mn
    - movie_name as "영화명"
    - sum(amt) as "합계"
    - sum(amt) as sum_amt

4. Built-in Function
    - 설치와 동시에 사용 가능한 함수

(1) Single Row Function
    - 한 개의 데이터 입력 -> 한 개의 데이터 출력
    1) numeric
        abs, ceil, floor, round
        ceil(4.7) -> 5, ceil(-4.7) -> -4
        trunc(4.7) -> 4, trunc(-4.7) -> -4
        round(4.38, 1) -> 4.4
        round(4.38, 0) -> 4
    2) text
        lower(str), upper(str) : 소문자로, 대문자로
        length(str) : str의 길이(한글은 몇 글자로 인정?)
        substr : 문자열 자르기, substr(open_date, 1, 4) => 오픈연도
    3) to_char, to_date(str_to_date)
        날짜를 문자열로, 문자열을 날짜로


