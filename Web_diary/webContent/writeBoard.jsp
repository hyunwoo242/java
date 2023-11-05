<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.BoardBean, user.BoardDAO"%>
<link rel="stylesheet" href="style.css">
<%
   request.setCharacterEncoding("utf-8");
%> 

<%
    BoardDAO boardDAO = new BoardDAO();
    int boardId = boardDAO.getNextBoardId(); // 게시물 번호를 자동으로 생성하는 메서드
%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>글 작성</title>
</head>
<body>
    <h1>글 작성</h1>
    <form action="writeBoardProcess.jsp" method="POST">
        <input type="hidden" name="boardId" value="<%= boardId %>">
        <label for="writer">작성자:</label>
        <input type="text" id="writer" name="writer" required><br><br>
        <label for="title">제목:</label>
        <input type="text" id="title" name="title" required><br><br>
        <label for="content">내용:</label>
        <textarea id="content" name="content" required></textarea><br><br>
        <input type="submit" value="작성">
    </form>
</body>
</html>
