<%@ page language="java" contentType="text/html; charset=UTF-8"
    import = "javax.servlet.RequestDispatcher"
    pageEncoding="UTF-8"%>
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
	<%RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp"); 
	dispatch.forward(request, response);
	%>
</body>
</html>