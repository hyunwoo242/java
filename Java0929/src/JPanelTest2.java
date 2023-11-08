import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JPanel2 extends JFrame{
	public JPanel2() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		jp1.add(new JRadioButton("자바"));
		jp1.add(new JRadioButton("C"));
		jp1.add(new JRadioButton("VisualBasic"));
		jp1.add(new JRadioButton("JSP"));
		jp1.add(new JRadioButton("PHP"));
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5,1));
		jp2.add(new JButton("자바"));
		jp2.add(new JButton("C"));
		jp2.add(new JButton("VisualBasic"));
		jp2.add(new JButton("JSP"));
		jp2.add(new JButton("PHP"));
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new GridLayout(1,1));
		jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택하세요."));
		
		ct.add(jp1, BorderLayout.WEST);
		ct.add(jp2, BorderLayout.EAST);
		ct.add(jp3, BorderLayout.NORTH);
		
		setTitle("JPanel Test2");
		setSize(300,200);
		setVisible(true);
	}
}
public class JPanelTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel2();
	}

}
