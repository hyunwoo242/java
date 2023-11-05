<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="user.BoardBean, user.BoardDAO"%>
<link rel="stylesheet" href="style.css">
<%
    request.setCharacterEncoding("utf-8");
%> 
<%
    String dateString = request.getParameter("date");
    Date selectedDate = null;

    // Parse the selected date from the request parameter
    if (dateString != null && !dateString.isEmpty()) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            selectedDate = dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    BoardDAO boardDAO = new BoardDAO();
    List<BoardBean> boardList;

    if (selectedDate != null) {
        boardList = boardDAO.getBoardListByDate(selectedDate);
    } else {
        boardList = boardDAO.getBoardList();
    }
%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
    <meta charset="UTF-8">
    <title>게시판</title>
</head>
<body>
    <h1>게시판</h1>
    <form action="boardList.jsp" method="GET">
        <label for="date">날짜 선택:</label>
        <input type="date" id="date" name="date" value="<%= dateString %>">
        <input type="submit" value="조회">
    </form>
    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>작성자</th>
                <th>제목</th>
                <th>등록일</th>
            </tr>
        </thead>
        <tbody>
            <% for (BoardBean board : boardList) { %>
                <tr>
                    <td><%= board.getBoardId() %></td>
                    <td><%= board.getWriter() %></td>
                    <td><a href="boardDetail.jsp?boardId=<%= board.getBoardId() %>"><%= board.getTitle() %></a></td>
                    <td><%= board.getRegDate() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
    <a href="boardList.jsp">전체 게시글 보기</a>
    <a href="writeBoard.jsp">글 작성</a>
    <a href="logout.jsp">로그아웃</a>
</body>
</html>