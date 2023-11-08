import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayout1 extends JFrame {
	public FlowLayout1() {
		Container ct = getContentPane();
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 45, 15);
		ct.setLayout(fl);
		for ( int i=1; i<=15; i++)
			ct.add(new JButton("��ư"+i));
		setTitle("fliwLayout Test1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class FlowLayoutTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayout1();
	}

}
