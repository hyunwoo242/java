import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame1 {
	public FirstFrame1() {
		JFrame jf = new JFrame("ù ��° GUI ���α׷�");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("�׽�Ʈ��ư");
		ct.add(jb);
		jf.setSize(400, 300);
		jf.setVisible(true);
	}
}
public class FrameTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame1();
	}
}
