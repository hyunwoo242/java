<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.MemberBean, user.MemberDAO" %>
<link rel="stylesheet" href="style.css">
<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>회원 정보 수정</title>
</head>
<body>
    <h1>회원 정보 수정</h1>
    
    <%-- 회원 정보를 수정할 회원의 ID를 파라미터로 받아옴 --%>
    <% String memberId = request.getParameter("id"); %>
    
    <%-- 회원 정보를 조회하기 위해 MemberDAO 객체 생성 --%>
    <% MemberDAO memberDAO = new MemberDAO(); %>
    <%-- 해당 ID의 회원 정보 조회 --%>
    <% MemberBean member = memberDAO.getMemberById(memberId); %>
    
    <%-- 회원 정보가 존재하는 경우에만 수정 폼을 표시 --%>
    <% if (member != null) { %>
        <form method="post" action="updateMemberProcess.jsp">
            <input type="hidden" name="id" value="<%= member.getId() %>">
            
            <label for="name">이름:</label>
            <input type="text" id="name" name="name" value="<%= member.getName() %>"><br>
            
            <label for="pwd">비밀번호:</label>
            <input type="password" id="pwd" name="pwd" value="<%= member.getPwd() %>"><br>
            
            
            <label for="email">이메일:</label>
            <input type="email" id="email" name="email" value="<%= member.getEmail() %>"><br>
            
            <input type="submit" value="수정">
        </form>
    <% } else { %>
        <p>해당 회원 정보를 찾을 수 없습니다.</p>
    <% } %>
    
    <a href="memberForm.jsp">회원 목록으로 돌아가기</a>
</body>
</html>
