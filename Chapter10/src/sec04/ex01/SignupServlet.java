package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    String user_id = request.getParameter("user_id");
	    String user_pw = request.getParameter("user_pw");
	    String user_name = request.getParameter("user_name");
	    
	    String data="";
	    data+="<html><body>";
	    data+="User ID : " +user_id;
	    data+="<br>";
	    data+="Password : " +user_pw;
	    data+="<br>";
	    data+="Name : " +user_name;
	    data+="<br>";
	    data+="</body></html>";
	    out.print(data);

	}

}
