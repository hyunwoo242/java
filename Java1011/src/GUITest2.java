import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI2 extends JFrame implements ActionListener {
	private JTextField jtf;
	private JTextArea jta;
	
	public GUI2() {
		JButton jb = new JButton("���� �о����");
		jtf = new JTextField("�����̸��� �Է��ϼ���",20);
		jta = new JTextArea(10,20);
		jta.setEditable(false);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		ct.add(jta);
		p1.add(jtf);
		p1.add(jb);
		ct.add(p1);
		jb.addActionListener(this);
		setTitle("GUI Test2");
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
		String s = jtf.getText();
		FileInputStream fos = new FileInputStream(s);
		DataInputStream dos = new DataInputStream(fos);
		jta.setText(dos.readUTF());
		fos.close();
		System.out.print(s + "������ �о����ϴ�..");
		}
		catch(Exception ae) {
			System.out.print("������ �������� �ʽ��ϴ�");
		}
	}
}
public class GUITest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI2();
	}

}
