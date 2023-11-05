<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="user.MemberBean, user.MemberDAO" %>
<%
   request.setCharacterEncoding("utf-8");
%> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 수정 처리</title>
</head>
<body>
    <%-- 수정할 회원의 정보를 파라미터로 받아옴 --%>
    <% String memberId = request.getParameter("id"); %>
    <% String name = request.getParameter("name"); %>
    <% String email = request.getParameter("email"); %>
    
    <%-- MemberDAO 객체 생성 --%>
    <% MemberDAO memberDAO = new MemberDAO(); %>
    
    <%-- 해당 ID의 회원 정보 조회 --%>
    <% MemberBean member = memberDAO.getMemberById(memberId); %>
    
    <%-- 회원 정보가 존재하고, 입력받은 이름과 이메일이 유효한 경우에만 수정 수행 --%>
    <% if (member != null && name != null && !name.isEmpty() && email != null && !email.isEmpty()) { %>
        <%-- 회원 정보 업데이트 수행 --%>
        <% member.setName(name); %>
        <% member.setEmail(email); %>
        <% memberDAO.updateMember(member); %>
        
        <h2>회원 수정 완료</h2>
        <p>회원 정보가 성공적으로 수정되었습니다.</p>
        
        <a href="memberForm.jsp">회원 목록으로 돌아가기</a>
    <% } else { %>
        <h2>회원 수정 실패</h2>
        <p>유효한 회원 정보를 입력해주세요.</p>
        
        <a href="memberForm.jsp">회원 목록으로 돌아가기</a>
    <% } %>
</body>
</html>
