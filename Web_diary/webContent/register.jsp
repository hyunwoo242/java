<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="user.MemberDAO" %>
<link rel="stylesheet" href="style.css">
<%
   request.setCharacterEncoding("utf-8");
%> 

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>회원 가입</title>
</head>
<body>
    <h1>회원 가입</h1>
    <form action="registerAction.jsp" method="POST">
        <label for="id">아이디:</label>
        <input type="text" id="id" name="id" required>
        <br><br>
        
        <label for="pwd">비밀번호:</label>
        <input type="password" id="pwd" name="pwd" required>
        <br><br>
        
        <label for="name">이름:</label>
        <input type="text" id="name" name="name" required>
        <br><br>
        
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required>
        <br><br>
        
        <input type="submit" value="가입">
        <a href="login.jsp">로그인 화면으로 돌아가기</a>
    </form>
</body>
</html>
