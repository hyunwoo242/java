<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.BoardBean, user.BoardDAO"%>
<%
   request.setCharacterEncoding("utf-8");
%> 
<%
    int boardId = Integer.parseInt(request.getParameter("boardId"));
    String writer = request.getParameter("writer");
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    BoardBean board = new BoardBean(boardId, writer, title, content, null); // 등록일은 DAO에서 처리
    BoardDAO boardDAO = new BoardDAO();
    boardDAO.addBoard(board);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>글 작성 완료</title>
</head>
<body>
    <h1>글 작성이 완료되었습니다!</h1>
    <p>작성자: <%= writer %></p>
    <p>제목: <%= title %></p>
    <p>내용: <%= content %></p>
    <a href="boardList.jsp">목록으로 돌아가기</a>
</body>
</html>
