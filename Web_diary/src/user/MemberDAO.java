package user;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private DataSource dataFactory;

    public MemberDAO() {
        try {
            Context ctx = new InitialContext();
            dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public List<MemberBean> listMembers() {
        List<MemberBean> list = new ArrayList<>();
        try {
            con = dataFactory.getConnection();
            String query = "SELECT * FROM t_member ORDER BY joinDate DESC";
            pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("joinDate");
                MemberBean vo = new MemberBean();
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                list.add(vo);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public MemberBean getMemberById(String id) {
        MemberBean member = null;
        try {
            con = dataFactory.getConnection();
            String query = "SELECT * FROM t_member WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String memberId = rs.getString("id");
                String pwd = rs.getString("pwd");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("joinDate");
                member = new MemberBean(memberId, pwd, name, email);
                member.setJoinDate(joinDate);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }

    public void addMember(MemberBean memberBean) {
        try {
            con = dataFactory.getConnection();
            String id = memberBean.getId();
            String pwd = memberBean.getPwd();
            String name = memberBean.getName();
            String email = memberBean.getEmail();
            String query = "INSERT INTO t_member (id, pwd, name, email) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);
            pstmt.setString(3, name);
            pstmt.setString(4, email);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateMember(MemberBean memberBean) {
        try {
            con = dataFactory.getConnection();
            String id = memberBean.getId();
            String name = memberBean.getName();
            String email = memberBean.getEmail();
            String query = "UPDATE t_member SET name = ?, email = ? WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, id);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteMember(String memberId) {
        try {
            con = dataFactory.getConnection();
            String query = "DELETE FROM t_member WHERE id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, memberId);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
