package sec01.ex01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarjavaxta.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.print("init �޼��� ȣ��"); // �����Ҷ� �ѹ� ȣ��
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print("doGet �޼��� ȣ��"); //ȣ�� �ɶ� ���� ���
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("destroy �޼��� ȣ��");
	}
}
