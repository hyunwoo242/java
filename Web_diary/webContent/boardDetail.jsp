<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.*"%>
<link rel="stylesheet" href="style.css">
<%
   request.setCharacterEncoding("utf-8");
%> 
<%
    int boardId = Integer.parseInt(request.getParameter("boardId"));
    BoardDAO boardDAO = new BoardDAO();
    BoardBean board = boardDAO.getBoardById(boardId);
%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>게시물 상세</title>
</head>
<body>
    <h1>게시물 상세</h1>
    <p>번호: <%= board.getBoardId() %></p>
    <p>작성자: <%= board.getWriter() %></p>
    <p>제목: <%= board.getTitle() %></p>
    <p>내용: <%= board.getContent() %></p>
    <p>등록일: <%= board.getRegDate() %></p>
    
    <%-- 해당 게시물을 작성한 사용자만 수정 및 삭제 가능 --%>
        <form action="editBoardProcess.jsp" method="POST">
            <input type="hidden" name="boardId" value="<%= board.getBoardId() %>">
            <label for="writer">작성자:</label>
            <input type="text" id="writer" name="writer" value="<%= board.getWriter() %>" required><br><br>
            <label for="title">제목:</label>
            <input type="text" id="title" name="title" value="<%= board.getTitle() %>" required><br><br>
            <label for="content">내용:</label>
            <textarea id="content" name="content" required><%= board.getContent() %></textarea><br><br>
            <input type="submit" value="수정">
        </form>
        
        <form action="deleteBoardProcess.jsp" method="POST">
            <input type="hidden" name="boardId" value="<%= board.getBoardId() %>">
            <input type="submit" value="삭제">
        </form>
        
</body>
</html>