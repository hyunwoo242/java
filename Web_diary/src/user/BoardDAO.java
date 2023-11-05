package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private DataSource dataFactory;

    public BoardDAO() {
        try {
            Context ctx = new InitialContext();
            dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public List<BoardBean> getBoardList() {
        List<BoardBean> list = new ArrayList<>();
        try {
            con = dataFactory.getConnection();
            String query = "SELECT * FROM t_board ORDER BY regDate DESC";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int boardId = rs.getInt("boardId");
                String writer = rs.getString("writer");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Date regDate = rs.getDate("regDate");
                BoardBean board = new BoardBean(boardId, writer, title, content, regDate);
                list.add(board);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public BoardBean getBoardById(int boardId) {
        BoardBean board = null;
        try {
            con = dataFactory.getConnection();
            String query = "SELECT * FROM t_board WHERE boardId = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, boardId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String writer = rs.getString("writer");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Date regDate = rs.getDate("regDate");
                board = new BoardBean(boardId, writer, title, content, regDate);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return board;
    }
    
    public List<BoardBean> getBoardListByDate(Date date) {
        List<BoardBean> list = new ArrayList<>();
        try {
            con = dataFactory.getConnection();
            String query = "SELECT * FROM t_board WHERE regDate like ?";
            pstmt = con.prepareStatement(query);
            pstmt.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int boardId = rs.getInt("boardId");
                String writer = rs.getString("writer");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Date regDate = rs.getDate("regDate");
                BoardBean board = new BoardBean(boardId, writer, title, content, regDate);
                list.add(board);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addBoard(BoardBean board) {
        try {
            con = dataFactory.getConnection();
            String query = "INSERT INTO t_board (boardId, writer, title, content) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, board.getBoardId());
            pstmt.setString(2, board.getWriter());
            pstmt.setString(3, board.getTitle());
            pstmt.setString(4, board.getContent());
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNextBoardId() {
        int nextBoardId = 0;
        try {
            con = dataFactory.getConnection();
            String query = "SELECT MAX(boardId) FROM t_board";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                nextBoardId = rs.getInt(1) + 1;
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nextBoardId;
    }
    public boolean updateBoard(BoardBean board) {
        boolean result = false;
        try {
            con = dataFactory.getConnection();
            String query = "UPDATE t_board SET writer=?, title=?, content=? WHERE boardId=?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, board.getWriter());
            pstmt.setString(2, board.getTitle());
            pstmt.setString(3, board.getContent());
            pstmt.setInt(4, board.getBoardId());
            
            int rowCount = pstmt.executeUpdate();
            result = (rowCount > 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }

    public boolean deleteBoard(int boardId) {
        boolean result = false;
        try {
            con = dataFactory.getConnection();
            String query = "DELETE FROM t_board WHERE boardId=?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, boardId);
            
            int rowCount = pstmt.executeUpdate();
            result = (rowCount > 0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
        return result;
    }

    private void closeResources() {
        try {
            if (pstmt != null)
                pstmt.close();
            if (con != null)
                con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
