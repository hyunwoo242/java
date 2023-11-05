package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/first/*")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String context = request.getContextPath();
		String url = request.getRequestURI().toString();
		String mapping = request.getServletPath();
		String uri = request.getRequestURI();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Test Servlet2</title>");
		out.print("</head>");
		out.print("<body bgcolor='yellow'>");
		out.print("<b>TestServlet2�Դϴ�.</b><br>");
		out.print("<b>���ؽ�Ʈ�� : " + context+ "</b><br>");
		out.print("<b>��ü��� : " + url+ "</b><br>");
		out.print("<b>���θ� : " + mapping+ "</b><br>");
		out.print("<b>URI : " + uri+ "</b>");
		out.print("</body>");
		out.print("</html>");
	}

}
