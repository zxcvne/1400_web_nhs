<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>
<%
	String userid = "";
	if(session.getAttribute("userid") != null){
		userid = (String)session.getAttribute("userid");
%>	
	<h1><%=userid%>님 환영합니다</h1>
	<a href="11_Session_logout.jsp">[로그아웃하기]</a>
<%
	}	 
	else {
%> 
	<form action="11_Session_login.jsp">
		<input type="text" name="userid">
		<button>login</button>
	</form>
<%		
	}
%>
</body>
</html>