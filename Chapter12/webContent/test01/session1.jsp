<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%
    String name=(String)session.getAttribute("name");
    session.setAttribute("address", "김해시 어방동");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 내장 객체 테스트2</title>
</head>
<body>
	이름은 <%=name %>입니다.<br>
	<a href=session2.jsp>두 번째 페이지로 이동</a>
</body>
</html>