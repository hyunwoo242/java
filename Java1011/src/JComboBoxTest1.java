import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBox1 extends JFrame implements ItemListener {
	JLabel j1;
	public JComboBox1() {
		j1 = new JLabel();
		JComboBox jcb = new JComboBox();
		String fr[] = {"persimmom","banana","pear","apple", "cherry","grape"};
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		for (int i = 0; i<6; i++) {
			jcb.addItem(fr[i]);
		}
		ct.add(jcb);
		ct.add(j1);
		jcb.addItemListener(this);
		setTitle("JComboBox Test1");
		setSize(200,200);
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String fruit = (String)e.getItem();
		j1.setIcon(new ImageIcon(fruit+".jpg"));
	}
	
}
public class JComboBoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBox1();
	}

}
