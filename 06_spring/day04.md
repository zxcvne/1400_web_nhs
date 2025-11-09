## Day4

### 1. Controller

1. 사용자의 Request를 받고 처리하여 웹 페이지로
   데이터를 전달하는 역할

2. HandlerMapping은 Request를 담당하는 Controller
   를 찾기 위해 존재하며, 찾은 후 해당 Controller 동작

3. Controller는 Request를 처리하는 비즈니스 로직으로 작성하며
   View(html 등)에게 전달하는 데이터는 Model에 담아 전송

4. View는 실제 응답을 보내야 하는 데이터를 HTML 등을 이용하여
   생성하는 역할을 한다.

**특징**

- HttpServletRequest와 HttpServletResponse을 사용안함
- 다양한 타입의 파라미터 처리, 다양한 타입의 리턴 처리
- GET/POST 등 전송 방식에 대한 처리를 어노테이션으로 처리
- 상속/인터페이스 방식 대신 어노테이션 만으로 설정 가능
