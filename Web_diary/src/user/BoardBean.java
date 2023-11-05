package user;

import java.util.Date;

public class BoardBean {
    private int boardId;
    private String writer;
    private String title;
    private String content;
    private Date regDate;

    public BoardBean() {}

    public BoardBean(int boardId, String writer, String title, String content, Date regDate) {
        this.boardId = boardId;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
