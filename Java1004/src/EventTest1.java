import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * 1.ó���� �̺�Ʈ ���� ����
 * 2. �̺�Ʈ�� ������ �̺�Ʈ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�
 */
class Event1 extends JFrame implements ActionListener {
	JLabel j1; //��ü��  �Ӽ����� ���
	
	public Event1() {
		Container ct = getContentPane(); //�����̳� ����
		ct.setLayout(new FlowLayout()); // ��ġ������ ����
		
		JButton jb = new JButton("��ư");
		j1 = new JLabel("��ư�� ��������");
		
		//3. �̺�Ʈ�� �޾� ���� �� ������Ʈ�� ����
		jb.addActionListener(this);
		
		ct.add(jb);
		ct.add(j1);
		
		setTitle("Event Test1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. ������ �������̽��� ����� �޼ҵ带 �������̵� �Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("�ȳ��ϼ���.");
	}
}
public class EventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event1();
	}

}
