import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class ImageButton extends JFrame {
	public ImageButton() {
		ImageIcon korea = new ImageIcon("korea1.gif");
		ImageIcon usa = new ImageIcon("usa.gif");
		ImageIcon germany = new ImageIcon("germany.gif");
		
		JButton nat = new JButton(korea);
		
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		setTitle("JButton Test1");
		setSize(500,400);
		setVisible(true);
	}
}
public class JButtonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageButton();
	}

}
