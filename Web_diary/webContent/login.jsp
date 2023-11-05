<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.MemberBean, user.MemberDAO" %>
<link rel="stylesheet" href="style.css">

<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>로그인</h1>
    <form method="post" action="loginProcess.jsp">
        <label for="id">아이디:</label>
        <input type="text" id="id" name="id"><br>
        <label for="pwd">비밀번호:</label>
        <input type="password" id="pwd" name="pwd"><br>
        <input type="submit" value="로그인">
    </form>
    <a href="register.jsp">회원 가입</a> 
</body>
</html>
