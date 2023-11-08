import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * ���� Ŭ������ �̿��� �̺�Ʈ ó��
 */

class Event2 extends JFrame  {
	JLabel j1;
	JButton jb1, jb2;
	
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout()); // ��ġ������ ����
		jb1 = new JButton("����մϴ�~");
		jb2 = new JButton("�ູ�մϴ�.");
		j1 = new JLabel("��ư�� ��������");
		
		// 3. ��ư�� ������ ���
		
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		ct.add(jb1);
		ct.add(jb2);
		ct.add(j1);
		
		setTitle("Event Test2");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
		// 1. ó���� �̺�Ʈ ���� ����
		// 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽� ����Ͽ� Ŭ���� �ۼ�
	private class EventProcess implements ActionListener {

			// 4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�.
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j1.setText(e.getActionCommand());
				
			}
		
		
	}
}
public class EventTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event2();
	}

}
