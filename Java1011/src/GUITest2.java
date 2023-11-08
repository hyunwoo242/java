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
		JButton jb = new JButton("파일 읽어오기");
		jtf = new JTextField("파일이름을 입력하세요",20);
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
		System.out.print(s + "파일을 읽었습니다..");
		}
		catch(Exception ae) {
			System.out.print("파일이 존재하지 않습니다");
		}
	}
}
public class GUITest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI2();
	}

}
