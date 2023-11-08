import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JList1 extends JFrame implements ListSelectionListener {
	private String[] fruitlist = {"persimmom", "banana", "apple", "grape", "cherry", "pear"}; //과일이름 배열저장
	private JList jlst = new JList(fruitlist); 
	private ImageIcon[] fruiticons = {
			new ImageIcon("persimmom.jpg"),
			new ImageIcon("banana.jpg"),
			new ImageIcon("apple.jpg"),
			new ImageIcon("grape.jpg"),
			new ImageIcon("cherry.jpg"),
			new ImageIcon("pear.jpg")
	};
	private JLabel[] jlicon = new JLabel[6];
	private JLabel jlname = new JLabel();
	
	public JList1() {
		Container ct = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2,5,5));
		for (int i =0; i<6; i++) {
			p1.add(jlicon[i] = new JLabel());
		}
		JPanel p2 = new JPanel();
		p2.add(jlname);
		ct.add(jlst, BorderLayout.WEST);
		ct.add(p1, BorderLayout.CENTER);
		ct.add(p2, BorderLayout.EAST);
		jlst.addListSelectionListener(this);
		setTitle("JList Test1");
		setSize(700,300);
		setVisible(true);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		for (int i=0; i<6; i++) {
			jlicon[i].setIcon(null);
		}
		int[] indices = jlst.getSelectedIndices();
		String s = "당신이 선택한 항목은 : ";
		for (int j =0; j<indices.length; j++) {
			jlicon[j].setIcon(fruiticons[indices[j]]);
			s = s + fruitlist[indices[j]]+" ";
		}
		jlname.setText(s);
	}
	
}
public class JListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JList1();
	}

}
