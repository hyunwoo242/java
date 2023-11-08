import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayout1 extends JFrame{
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10);
		ct.setLayout(gl);
		for (int i=0; i<20; i++)
			ct.add(new JButton("¹öÆ°"+i));
		setTitle("GridLayout Tset1");
		setSize(800, 800);
		setVisible(true);
	}
}
public class GridLayoutTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayout1();
	}

}
