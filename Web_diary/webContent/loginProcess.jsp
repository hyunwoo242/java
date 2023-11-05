<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.MemberBean, user.MemberDAO" %>
<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 처리</title>
</head>
<body>
    <%-- 입력된 아이디와 비밀번호 가져오기 --%>
    <% String id = request.getParameter("id"); %>
    <% String pwd = request.getParameter("pwd"); %>

    <%-- MemberDAO 객체 생성 --%>
    <% MemberDAO memberDAO = new MemberDAO(); %>
    <%-- 아이디로 회원 정보 가져오기 --%>
    <% MemberBean member = memberDAO.getMemberById(id); %>

    <%-- 로그인 처리 --%>
    <% if (member != null && member.getPwd().equals(pwd)) { %>
        <%-- 관리자로 로그인한 경우 memberForm.jsp로 이동 --%>
        <% if (id.equals("admin") && pwd.equals("admin")) { %>
            <% response.sendRedirect("memberForm.jsp"); %>
        <% } else { %>
            <h2>로그인 성공</h2>
            <p>환영합니다, <%= member.getName() %>님!</p>
            <%-- 로그인 성공 시 회원 정보를 세션에 저장 --%>
            <% session.setAttribute("member", member); %>
            <%-- 로그인 성공 시 board.jsp로 이동 --%>
            <% response.sendRedirect("boardList.jsp"); %>
        <% } %>
    <% } else { %>
        <h2>로그인 실패</h2>
        <p>아이디 또는 비밀번호가 일치하지 않습니다.</p>
    <% } %>
</body>
</html>
