package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sessionTest
 */
@WebServlet("/session3")
public class sessionTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
	    PrintWriter pw = response.getWriter();
	    
	    HttpSession session = request.getSession();
	    session.setAttribute("name", "������");
	    
	    pw.println("<html><body>");
	    pw.println("<h1>���ǿ� �̸��� ���ε��մϴ�.</h1>");
	    pw.println("<a href='/Chapter12/request/request1.jsp'>ù ��° �������� �̵��ϱ�</a>");
	    pw.println("</body></html>");
	}

}
