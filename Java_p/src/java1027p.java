import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Student extends JFrame implements ItemListener{ //ItemListener�� ���
	private JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7; 
	private JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	private JTextArea jta;
	private JComboBox jcb;
	private JPanel jp1,jp2,jp3,jp4;
	public Student() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jtf3 = new JTextField(20);
		jtf4 = new JTextField(20);
		jtf5 = new JTextField(20);
		jta = new JTextArea(10,500);
		
		jl1 = new JLabel("�л� ������ �����Խ��ϴ�.!!");
		jl2 = new JLabel("��  ��");
		jl3 = new JLabel("��  ��");
		jl4 = new JLabel("��  ��");
		jl5 = new JLabel("��  ��");
		jl6 = new JLabel("��  ��");
		jl7 = new JLabel("�� �� ó");
		
		jcb = new JComboBox();
		jcb.addItem("1");
		jcb.addItem("2");
		jcb.addItem("3");
		jcb.addItem("4");
		
		JButton rb1 = new JButton("��  ��");
		JButton rb2 = new JButton("��  ȸ");
		JButton rb3 = new JButton("��  ��");
		JButton rb4 = new JButton("��  ��");
		
		rb1.setPreferredSize(new Dimension(35, 40));
		rb2.setPreferredSize(new Dimension(35, 40));
		rb3.setPreferredSize(new Dimension(35, 40));
		rb3.setPreferredSize(new Dimension(35, 40));
		
		Container ct = getContentPane();
		
		
		jp1.add(jl2); //add�� ����ؼ�
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jl5);
		jp1.add(jl6);
		jp1.add(jl7);
		
		jp2.add(jcb);
		jp2.add(jtf1);
		jp2.add(jtf2);
		jp2.add(jtf3);
		jp2.add(jtf4);
		jp2.add(jtf5);
		
		jp3.add(rb1);
		jp3.add(rb2);
		jp3.add(rb3);
		jp3.add(rb4);
		
		jp4.add(jta);
		
		jp1.setLayout(new GridLayout(6,1,15,8));
		jp2.setLayout(new GridLayout(6,1,5,5));
		jp3.setLayout(new GridLayout(4,1));
		
		ct.add(jl1,BorderLayout.NORTH); //�������̾ƿ� ����ؼ� ��ġ ����
		ct.add(jp1,BorderLayout.WEST);
		ct.add(jp2,BorderLayout.CENTER);
		ct.add(jp3,BorderLayout.EAST);
		ct.add(jp4, BorderLayout.SOUTH);
		
		setTitle("Student Information");
		setSize(800,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {
				
	}
	
}

public class java1027p {
	
	public static void main(String[] args) {
		new Student();

	}

}
