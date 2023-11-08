import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JLabelTest1 extends JFrame implements ActionListener {// ActionListener ����
	JPanel jp1 = new JPanel(); //�ǳ� 3�� ����
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JLabel jl1 = new JLabel("����� ��������?"); //���̺�� �ؽ�Ʈ �����ֱ�
	JLabel jl2 = new JLabel(""); //�� ���̺��� �̿��Ͽ� ��ư ��ġ�� ��Ÿ�� �̺�Ʈ �ؽ�Ʈ ����
	
	JButton jb1,jb2,jb3,jb4;
	public JLabelTest1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("A��"); //A�� ���� O������ ��ư ��ü ����
		jb2 = new JButton("B��");
		jb3 = new JButton("AB��");
		jb4 = new JButton("O��");
		jp1.add(jl1);
		jp2.setLayout(new GridLayout(1,4));
		add(jl1);
		jp2.add(jb1); // ��ư ��ü�� �ǳ��� �̿��Ͽ� ��Ÿ�� �����̳� ����
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp3.add(jl2);
		
		jb1.addActionListener(this); //��ư Ŭ���� ��Ÿ���� �̺�Ʈ
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		ct.add(jp1, BorderLayout.NORTH); //�� �࿡ �й��Ͽ� ��Ÿ��
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		setTitle("JLabel Test");
		setSize(300,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			String s = "������ ������ : ";
			jl2.setText(s+e.getActionCommand()); //��ưŬ���� ��Ÿ���� �ؽ�Ʈ+������
	}
	
}
public class JLabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelTest1(); //Ŭ������ ������Ʈ ȣ��
	}

}
