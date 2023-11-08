import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		Container ct = getContentPane();
		BorderLayout bl = new BorderLayout(10,10);
		ct.setLayout(bl);
		ct.add(new JButton("오른쪽 버튼"), BorderLayout.EAST);
		ct.add(new JButton("왼쪽 버튼"), BorderLayout.WEST);
		ct.add(new JButton("위쪽 버튼"), BorderLayout.NORTH);
		ct.add(new JButton("아래쪽 버튼"), BorderLayout.SOUTH);
		ct.add(new JButton("중앙버튼"), BorderLayout.CENTER);
		setTitle("BorderLayout Test1");
		setSize(400,300);
		setVisible(true);
		
	}
}
public class BorderLayoutTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayout1();
	}

}
