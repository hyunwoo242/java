package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.print("init �޼��� ȣ��");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("destroy �޼��� ȣ��");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("utf-8");
//	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    String user_name = request.getParameter("user_name");
	    String user_pw = request.getParameter("user_pw");
	    
	    
	    
	    
	    String data="�ȳ��ϼ���!<br>"+user_name+" �α����ϼ̽��ϴ�.<br><br>";
	    data+="<html><body>";
	    data+="�̸� : " +user_name;
	    data+="<br>";
	    data+="�н����� : " +user_pw;
	    data+="<br>";
	    data+="</body></html>";
	    out.print(data);
	}

}
