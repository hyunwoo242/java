<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.*" %>
<%
   request.setCharacterEncoding("utf-8");
%> 
<%
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    MemberBean member = new MemberBean(id, pwd, name, email);
    MemberDAO memberDAO = new MemberDAO();
    memberDAO.addMember(member);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 가입 완료</title>
</head>
<body>
    <h1>회원 가입이 완료되었습니다!</h1>
    <p>아이디: <%= id %></p>
    <p>이름: <%= name %></p>
    <p>이메일: <%= email %></p>
    <a href="login.jsp">로그인 돌아가기</a> 
</body>
</html>
