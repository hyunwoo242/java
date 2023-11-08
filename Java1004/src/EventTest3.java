import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
class EventClass implements ActionListener {
	JLabel j1;
	
	public EventClass(JLabel j1) {
		this.j1 = j1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText(e.getActionCommand());
	}
	
}
class Event3 extends JFrame {
	JLabel j1;
	JButton jb1, jb2;
	public Event3() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout()); // ��ġ������ ����
		
		j1 = new JLabel("��ư�� ��������");
		jb1 = new JButton("����մϴ�~");
		jb2 = new JButton("�ູ�մϴ�.");
		
		// 3. �̺�Ʈ�� �޾� ���� �� ������Ʈ�� ������ ���
		jb1.addActionListener(new EventClass(j1));
		jb2.addActionListener(new EventClass(j1));
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(j1);
		
		setTitle("Event Test3");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class EventTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event3();
	}

}
