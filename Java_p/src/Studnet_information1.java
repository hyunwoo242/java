import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JLabel1 extends JFrame implements ActionListener {
	private JLabel jlb, jlb1, jlb2, jlb3, jlb4, jlb5, jlb6;
	private JComboBox jcb;
	String fr[] = {"1","2","3","4"};
	private JTextField jtb1, jtb2, jtb3, jtb4, jtb5;
	private JButton jbt1, jbt2, jbt3, jbt4;
//	private BorderLayout bl;
	private JTextArea ja;
	private JPanel p, p1, p2, p4, p5;
	
	public JLabel1() {
		p4 = new JPanel();
		jlb = new JLabel("�л� ������ �����Խ��ϴ�.!!");
		
		p5 = new JPanel();
		ja = new JTextArea(10, 500);
		
		p = new JPanel();
		jlb1 = new JLabel("����");
		jlb2 = new JLabel("�а�");
		jlb3 = new JLabel("�й�");
		jlb4 = new JLabel("�г�");
		jlb5 = new JLabel("�̸�");
		jlb6 = new JLabel("����ó");
		
		p1 = new JPanel();
		jcb = new JComboBox();
		for(int i=0; i<fr.length; i++) {
			jcb.addItem(fr[i]);
		}
		
		jtb1 = new JTextField(40);
		jtb2 = new JTextField(20);
		jtb3 = new JTextField(20);
		jtb4 = new JTextField(20);
		jtb5 = new JTextField(20);
		
		p2 = new JPanel();
		jbt1 = new JButton("��ȸ");
		jbt2 = new JButton("����");
		jbt3 = new JButton("���");
		jbt4 = new JButton("����");
		
		Container ct = getContentPane();
	//	bl = new BorderLayout(20, 20);
		//����
		p4.setLayout(new GridLayout(1,1,1,1));
		p4.add(jlb);
		//����
		p.setLayout(new GridLayout(6,1));
		p.add(jlb1);
		p.add(jlb2);
		p.add(jlb3);
		p.add(jlb4);
		p.add(jlb5);
		p.add(jlb6);
		//�߰�
		p1.setLayout(new GridLayout(6,1));
		p1.add(jcb);
		p1.add(jtb1);
		p1.add(jtb2);
		p1.add(jtb3);
		p1.add(jtb4);
		p1.add(jtb5);
		//������
		p2.setLayout(new GridLayout(4,1));
		p2.add(jbt1);
		p2.add(jbt2);
		p2.add(jbt3);
		p2.add(jbt4);
		//�Ʒ�
		p5.add(ja);
		// �ǳ���ġ ����
		ct.add(p4,BorderLayout.NORTH);
		ct.add(p,BorderLayout.WEST);
		ct.add(p1,BorderLayout.CENTER);
		ct.add(p2,BorderLayout.EAST);
		ct.add(p5,BorderLayout.SOUTH);
		setTitle("Student Information");
		setSize(800,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Studnet_information1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabel1();
	}

}
