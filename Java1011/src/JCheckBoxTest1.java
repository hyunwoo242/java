import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener {
	JTextField jtf;
	public JCheckBox1() {
		jtf =new JTextField(10);
		JCheckBox jc1 = new JCheckBox("JAVA");
		JCheckBox jc2 = new JCheckBox("OS");
		JCheckBox jc3 = new JCheckBox("Datavase");
		JCheckBox jc4 = new JCheckBox("C");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		setTitle("JCheckBox Test1");
		setSize(250,100);
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(((JCheckBox)e.getItem()).getText());
	}
}
public class JCheckBoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JCheckBox1();
	}

}
