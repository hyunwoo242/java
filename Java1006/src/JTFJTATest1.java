import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTFJTA1 extends JFrame implements ActionListener {
	private JTextField jtf;
	private JTextArea jta;
	private JLabel j1 = new JLabel("�Է��Ͻÿ�");
	
	public JTFJTA1() {
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		
		jta.setEditable(false);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(jtf); // �ǳڿ� �ؽ�Ʈ �ʵ� �߰�
		p1.add(jta);	// �����̳ʿ� �� �߰�
		ct.add(p1);
		ct.add(j1);
		jtf.addActionListener(this);
		setTitle("JTextField, JTextArea Test1");
		setSize(500,300);
		setVisible(true);
	}
	// ������ �������̽��� ����� �޼ҵ带 �������̵� �Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�.
	// �̺�Ʈ ó�� �޼ҵ� �ۼ�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �ؽ�Ʈ ������� �� ������ ������ �ؽ�Ʈ �ʵ��� ���� �߰�
		if(jta.getLineCount() <= jta.getRows()) {
		jta.append(e.getActionCommand()+"\n");
		jtf.setText("");
	} else {
		j1.setText("�Է��� ����Ǿ����ϴ�");
		jtf.setEditable(false);
		}	
	}
}
public class JTFJTATest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTFJTA1();
	}

}
