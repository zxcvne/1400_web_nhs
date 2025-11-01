<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
</head>
<% 
	String cookieCheck = request.getHeader("Cookie");
	if(cookieCheck != null){ // Cookie가 있으면
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("customer")){
				System.out.println("Customer : " + cookie.getValue());
			}
		}
	}
%>
<body>

</body>
</html>