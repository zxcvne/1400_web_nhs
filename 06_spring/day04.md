## Day4

### 1. Controller

1. 사용자의 Request를 받고 처리하여 웹 페이지로
   데이터를 전달하는 역할

2. HandlerMapping은 Request를 담당하는 Controller
   를 찾기 위해 존재하며, 찾은 후 해당 Controller 동작

3. Controller는 Request를 처리하는 비즈니스 로직으로 작성하며
   View(html 등)에게 전달하는 데이터는 Model에 담아 전송
