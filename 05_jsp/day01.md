Day1

1. OrderServlet 테스트

2. Tomcat 관련 기본 용어
(1) 서버
    - 사용자의 요청에 맞는 서비스를 제공하는 것
    - 웹 통신은 request와 response로 이루어짐

(2) httpd
    - 클라이언트의 요청을 인식하는 프로그램
    - 요청을 받으면 웹 서버에 전달
    - 스레드 스케쥴링

(3) 웹 서버
    - http라고 하며 일반적으로 Apache라고 부름
    - Apache 프로젝트 산하 Apache http, Apache Tomcat
    - Apache http를 Apache라고 하고,
      Apache Tomcat을 Tomcat이라고 한다.
    - 사용자의 요청을 httpd가 보내주면
      정적인 페이지의 요청이면 html, 이미지 등 resource 제공
      동적인 페이지의 요청이면 웹 컨테이너에 요청을 보냄

(4) WAS(Web Application Server)
    - 웹 컨테이너 들을 관리
    - 사용자의 동적 데이터를 Servlet, jsp로 연산하거나 제어
    
(5) Web Server와 Was의 구성
    - 1대당 리소스는 WAS가 더 큼
    - Web 서버는 여러대, WAS는 1~2대
    
3. JSP(Java Server Page) 
    HTML을 중심으로 Java와 연동하여 사용하는 웹 언어
    HTML 안에 Java 코드를 작성할 수 있는 언어

    * 서블릿에서 HTML을 작성하는 것은 매우 번거롭기 때문에
      JSP에서 Java코드를 작성하는 것이 편하고 많이 사용함

(1) 스크립트 태그(script tag)
    HTML 코드에 Java 코드를 넣어 프로그램이 수행하는 기능 구현

    1) 선언문(declaration)
        <%! ~ %>
        자바 변수나 메서드를 정의할 때 사용

    2) 스크립틀릿(scriptlet)
        <% ~ %>
        자바 변수 선언 및 자바 로직 코드 작성에 사용

    3) 표현식(expression)
        <%=  ~  %>

(2) 디렉티브 태그(directive tag)
    <%@ page %> : <% 와 @사이에 공백이 없어야 함
                  현재 jsp의 정보를 설정하는 태그

    속성(기본값)
    1) language(java) : 현재 jsp가 사용할 언어
    2) contentType(text/html) : 현재 jsp가 생성할 문서
    3) pageEncoding(ISO-8859-1) : 페이지 인코딩 -> UTF-8을 추천
    4) import : 현재 jsp에서 사용할 자바 패키지, 클래스
    5) session(true) : 현재 jsp에서 세션을 사용할 것인지
    6) info : 현재 jsp에 대한 설명
    7) errorPage : 현재 jsp가 오류가 나면 보여줄 페이지
    

