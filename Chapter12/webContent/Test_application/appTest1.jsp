<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    session.setAttribute("name", "김현우");
    session.setAttribute("address", "김해시 어방동");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>내장 객체 스코프 테스트1</title>
</head>
<body>
	<h1>이름과 주소를 저장합니다.</h1>
	<a href=appTest2.jsp>두 번째 웹 페이지로 이동</a>
</body>
</html>