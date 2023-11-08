
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JText extends JPanel implements ActionListener {
	private JTextField jl1;
	private JTextArea jl2;
	
	public JText() {
		jl1 = new JTextField(20);
		jl2 = new JTextArea(1,20);
		jl2.setEditable(false); //입력 못하게 하는 코드
		add(jl1);
		add(jl2);
		
		jl1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JTextField t = (JTextField)e.getSource();
		jl2.append(e.getActionCommand()+ "\n");
		jl1.setText("");
	}	
	
}
//라디오 버튼
class RadioPanel extends JPanel implements ItemListener {
	JTextField jl1 = new JTextField();
	ButtonGroup g = new ButtonGroup();
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JRadioButton [] jrbs = {new JRadioButton("JCheckBox")
			,new JRadioButton("JButton"),
			new JRadioButton("JComboBox"),
			new JRadioButton("JLabel")};
	
	public RadioPanel() {
		
		for(int i=0; i<jrbs.length; i++) {
			g.add(jrbs[i]);
			p.add(jrbs[i]);
			
			jrbs[i].addItemListener(this);
		}
		
		p1.setLayout(new BorderLayout());
		p1.add(p,BorderLayout.NORTH);
		p1.add(jl1, BorderLayout.CENTER);
		add(p1);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jrbs[0]) {
			jl1.setText(jrbs[0].getText());
		}
		else if(e.getSource() == jrbs[1]) {
			jl1.setText(jrbs[1].getText());
		}
		else if(e.getSource() == jrbs[2]) {
			jl1.setText(jrbs[2].getText());
		}
		else if(e.getSource() == jrbs[3]) {
			jl1.setText(jrbs[3].getText());
		}
	}	
	
}
class ComboPanel extends JPanel implements ItemListener {
	private JComboBox jcb;
	private JTextArea ja = new JTextArea(1,20);
	public ComboPanel() {
		jcb = new JComboBox();
		String fr[] = {"Flow Layout", "Grid Layout", "Border Layout", "Card Layout"};
		for(int i=0; i<fr.length; i++) {
			jcb.addItem(fr[i]);
		}
		add(jcb);
		add(ja);
		jcb.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object s = e.getItem();
		ja.setText(s.toString());
	}
	
}
//체크박스
class CheckBox extends JPanel implements ItemListener {
	JTextField jl1 = new JTextField();
	ButtonGroup bg = new ButtonGroup();
	JPanel p = new JPanel();
	JPanel g = new JPanel();
	JCheckBox jrb[] = {new JCheckBox("객체지향"),
			new JCheckBox("interpreter 사용"),
			new JCheckBox("높은 이식성"),
			new JCheckBox("multithreaded 제공")};
	
	public CheckBox() {
		
		for(int i=0; i<jrb.length; i++) {
			bg.add(jrb[i]);
			p.add(jrb[i]);
			
			jrb[i].addItemListener(this);
		}
		g.setLayout(new BorderLayout());
		g.add(p,BorderLayout.NORTH);
		g.add(jl1, BorderLayout.CENTER);
		add(g);
		}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jrb[0]) {
			jl1.setText(jrb[0].getText());
		}
		else if(e.getSource() == jrb[1]) {
			jl1.setText(jrb[1].getText());
		}
		else if(e.getSource() == jrb[2]) {
			jl1.setText(jrb[2].getText());
		}
		else if(e.getSource() == jrb[3]) {
			jl1.setText(jrb[3].getText());
		}
	}
}

class JTabbedPane1 extends JFrame {
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		
		JText fp = new JText();
		RadioPanel rp = new RadioPanel();
		CheckBox cp = new CheckBox();
		ComboPanel dp = new ComboPanel();
		
		jtp.addTab("Text", fp);
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
