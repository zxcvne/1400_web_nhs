<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Param Action Tag</title>
</head>
<%
	String shout = "야";

%>
<body>
	<h1>Parameter Action Tag</h1>
	<hr>
	<!-- expression Tag도 Action Tag 내 사용 가능 -->
	<jsp:forward page="09_param_process.jsp">
		<jsp:param name="id" value="admin"/>
		<jsp:param name="name" value="One and Only"/>
	</jsp:forward>
</body>
</html>