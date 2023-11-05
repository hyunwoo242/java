<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.*"%>
<%
   request.setCharacterEncoding("utf-8");
%> 
<%
    int boardId = Integer.parseInt(request.getParameter("boardId"));
    BoardDAO boardDAO = new BoardDAO();
    boolean result = boardDAO.deleteBoard(boardId);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시물 삭제 결과</title>
</head>
<body>
    <% if (result) { %>
        <h1>게시물이 성공적으로 삭제되었습니다.</h1>
    <% } else { %>
        <h1>게시물 삭제에 실패했습니다.</h1>
    <% } %>
    <a href="boardList.jsp">게시물 목록으로 돌아가기</a>
</body>
</html>
