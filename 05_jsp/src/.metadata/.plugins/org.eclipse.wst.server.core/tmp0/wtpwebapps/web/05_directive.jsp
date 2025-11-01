<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="Date Class를 이용한 현재 시간 출력" %>
<%@ page import="java.util.Date" %>
<% //@ page errorPage ="06_error_page.jsp" %> <!-- 운영중일 때만 ON -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>directive</title>
</head>
<% Date today = new Date(); %>
<body>
	<h1>Current DateTime</h1>
	<hr>
	<p>today : <%= new Date() %></p>
	<p>today : <%= today %></p>
</body>
<% 
	String date = null;
	date.charAt(0);
%>
</html>