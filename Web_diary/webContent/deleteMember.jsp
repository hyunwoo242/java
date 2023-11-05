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
    <title>회원 삭제</title>
</head>
<body>
	
    <h1>회원 삭제</h1>
    
    <%-- 삭제할 회원의 ID를 파라미터로 받아옴 --%>
    <% String memberId = request.getParameter("id"); %>
    
    <%-- 회원 정보를 조회하기 위해 MemberDAO 객체 생성 --%>
    <% MemberDAO memberDAO = new MemberDAO(); %>
    <%-- 해당 ID의 회원 정보 조회 --%>
    <% MemberBean member = memberDAO.getMemberById(memberId); %>
    
    <%-- 회원 정보가 존재하는 경우에만 삭제 확인 메시지를 표시 --%>
    <% if (member != null) { %>
        <p>다음 회원을 삭제하시겠습니까?</p>
        <p>ID: <%= member.getId() %></p>
        <p>이름: <%= member.getName() %></p>
        <p>이메일: <%= member.getEmail() %></p>
        
        <form method="post" action="deleteMemberProcess.jsp">
            <input type="hidden" name="id" value="<%= member.getId() %>">
            <input type="submit" value="삭제">
        </form>
    <% } else { %>
        <p>해당 회원 정보를 찾을 수 없습니다.</p>
    <% } %>
    
    <a href="memberForm.jsp">회원 목록으로 돌아가기</a>
</body>
</html>
