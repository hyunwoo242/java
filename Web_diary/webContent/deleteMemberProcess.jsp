<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.MemberDAO" %>
<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 삭제 처리</title>
</head>
<body>
    <%-- 삭제할 회원의 ID를 파라미터로 받아옴 --%>
    <% String memberId = request.getParameter("id"); %>
    
    <%-- MemberDAO 객체 생성 --%>
    <% MemberDAO memberDAO = new MemberDAO(); %>
    
    <%-- 회원 삭제 수행 --%>
    <% memberDAO.deleteMember(memberId); %>
    
    <h2>회원 삭제 완료</h2>
    <p>회원이 성공적으로 삭제되었습니다.</p>
    
    <a href="memberForm.jsp">회원 목록으로 돌아가기</a>
</body>
</html>
