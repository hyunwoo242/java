import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * GUIŬ����
 * 1. ó���� �̺�Ʈ ���� ����.
 * 2. �̺�Ʈ�� ������ �̺�Ʈ ������ �������̽��� ����Ͽ� Ŭ���� �ۼ�.
 * ��ư�� �����ϴ� �̺�Ʈ ó���� ���� ������ ����.
 */
class JLabel1 extends JFrame implements ActionListener {
	private JLabel result = new JLabel(); // ���ڿ��̳� �������� ����Ͽ� ��ü����.
	public ImageIcon img1,img2; // �̹����� ������ȭ �ϴ� �������

	public JLabel1() {
		img1 = new ImageIcon("apple.jpg");
		img2 = new ImageIcon("pear.jpg");

		JButton apple = new JButton("���");
		JButton pear = new JButton("��");
		
		Container ct = getContentPane();
		
		ct.setLayout(new FlowLayout());
		
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		//����ȭ��
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		//ȭ��
		setTitle("JLabel Test1");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	//4. ������ �������̽��� ����� �޼ҵ带 �������̵��Ͽ� �̺�Ʈ ó�� ��ƾ �ۼ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "���") {
			result.setText("���ִ� ����Դϴ�.");
			result.setIcon(img1);
		}else {
			result.setText("���ִ� ���Դϴ�");
			result.setIcon(img2);
		}
	}
}

// main class
public class JLabelTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabel1();
	}

}
