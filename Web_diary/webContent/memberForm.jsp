<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="user.MemberBean, user.MemberDAO"%>
<link rel="stylesheet" href="style.css">
<%
    // 회원 목록을 가져오기 위해 MemberDAO 객체 생성
    MemberDAO memberDAO = new MemberDAO();
    List<MemberBean> memberList = memberDAO.listMembers();
%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>회원 정보</title>
</head>
<body>
    <h1>회원 정보</h1>
    <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>이름</th>
                <th>이메일</th>
                <th>수정</th>
                <th>삭제</th>
            </tr>
        </thead>
        <tbody>
            <% for (MemberBean member : memberList) { %>
                <tr>
                    <td><%= member.getId() %></td>
                    <td><%= member.getName() %></td>
                    <td><%= member.getEmail() %></td>
                    <td><a href="editMember.jsp?id=<%= member.getId() %>">수정</a></td>
                    <td><a href="deleteMember.jsp?id=<%= member.getId() %>">삭제</a></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    <a href="boardList.jsp">게시판 이동</a>
    <a href="logout.jsp">로그아웃</a>
</body>
</html>
