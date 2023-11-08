import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

//class JText extends JPanel implements ActionListener {
//	private
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//라디오 버튼
class RadioPanel extends JPanel implements ActionListener {
	JTextField jl1;
	
	public RadioPanel() {
		JRadioButton jrb1 = new JRadioButton("JCheckBox");
		JRadioButton jrb2 = new JRadioButton("JButton");
		JRadioButton jrb3 = new JRadioButton("JComboBox");
		JRadioButton jrb4 = new JRadioButton("JLabel");
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		jl1.getText();
	}
	
}
class ComboPanel extends JPanel implements ItemListener {
	JTextField jl1;
	
	public ComboPanel() {
		JComboBox jcb = new JComboBox();
		jcb.addItem("FlowLayout");
		jcb.addItem("Grid Layout");
		jcb.addItem("Border Layout");
		jcb.addItem("Card Layout");
		add(jcb);
		jcb.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		jl1.getText();
	}
	
}
//체크박스
class CheckBox extends JPanel implements ActionListener {
	JTextField jl1;
	
	public CheckBox() {
		jl1 = new JTextField(10);
		JCheckBox jrb1 = new JCheckBox("객체지향");
		JCheckBox jrb2 = new JCheckBox("interpreter 사용");
		JCheckBox jrb3 = new JCheckBox("높은 이식성");
		JCheckBox jrb4 = new JCheckBox("multithreaded 제공");
		
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		jl1.setText(s);
	}
}

class JTabbedPane1 extends JFrame {
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		RadioPanel rp = new RadioPanel();
		CheckBox cp = new CheckBox();
		ComboPanel dp = new ComboPanel();
		jtp.addTab("Swing", rp);
		jtp.addTab("Layout",dp);
		jtp.addTab("Java",cp);
		getContentPane().add(jtp);
		setTitle("GroupHolder Test");
		setSize(500,150);
		setVisible(true);
	}
}
public class GroupHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPane1();
	}

}
