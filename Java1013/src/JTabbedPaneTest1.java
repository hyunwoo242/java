import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

class RadioPanel extends JPanel implements ActionListener {
	JLabel jl1 = new JLabel("당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	public RadioPanel() {
		JRadioButton jrb1 = new JRadioButton("남자"); //라디오버튼 생성
		JRadioButton jrb2 = new JRadioButton("여자");	 
		
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		jl2.setText(s);
	}
}

	class ComboPanel extends JPanel implements ItemListener {
		JLabel jl1 = new JLabel("당신의 혈액형은 ?");
		JLabel jl2 = new JLabel("");
		public ComboPanel() {
			JComboBox jcb = new JComboBox();
			jcb.addItem("A형");
			jcb.addItem("B형");
			jcb.addItem("AB형");
			jcb.addItem("O형");
			add(jl1);
			add(jl2);
			add(jcb);
			jcb.addItemListener(this);
		}
		@Override
		public void itemStateChanged(ItemEvent ae) {
			// TODO Auto-generated method stub
			Object s = ae.getItem();
			jl2.setText(s.toString());
		}
	}


	class JTabbedPane1 extends JFrame {
		public JTabbedPane1() {
			JTabbedPane jtp = new JTabbedPane();
			RadioPanel rp = new RadioPanel();
			
			ComboPanel cp = new ComboPanel();
			jtp.addTab("성별", rp);
			jtp.addTab("혈액형", cp);
			getContentPane().add(jtp);
			
			setTitle("JTabbedPaneTest1");
			setSize(500,150);
			setVisible(true);
		}
	}
public class JTabbedPaneTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPane1();
	}

}
