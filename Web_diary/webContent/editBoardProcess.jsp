<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.*"%>
<%
   request.setCharacterEncoding("utf-8");
%> 
<%
    int boardId = Integer.parseInt(request.getParameter("boardId"));
    String writer = request.getParameter("writer");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    
    BoardBean board = new BoardBean();
    board.setBoardId(boardId);
    board.setWriter(writer);
    board.setTitle(title);
    board.setContent(content);
    
    BoardDAO boardDAO = new BoardDAO();
    boolean result = boardDAO.updateBoard(board);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시물 수정 결과</title>
</head>
<body>
    <% if (result) { %>
        <h1>게시물이 성공적으로 수정되었습니다.</h1>
    <% } else { %>
        <h1>게시물 수정에 실패했습니다.</h1>
    <% } %>
    <a href="boardList.jsp">게시물 목록으로 돌아가기</a>
</body>
</html>
