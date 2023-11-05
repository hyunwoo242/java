<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- 로그아웃 처리를 위해 세션 무효화 --%>
<%
    session.invalidate();
%>

<%-- 로그아웃 성공 메시지 출력 --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그아웃</title>
</head>
<body>
    <h1>로그아웃 성공</h1>
    <p>로그아웃 되었습니다.</p>
    <p><a href="login.jsp">로그인 화면으로 돌아가기</a></p>
</body>
</html>
