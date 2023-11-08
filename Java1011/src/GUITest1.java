import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI1 extends JFrame implements ActionListener {
	private JTextField jtf;
	private JTextArea jta;
	
	public GUI1() {
		JButton jb = new JButton("파일로 저장");
		jtf = new JTextField("파일이름을 입력하세요",20);
		jta = new JTextArea("파일의 내용을 입력하세요", 10,20);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		ct.add(jta);
		p1.add(jtf);
		p1.add(jb);
		ct.add(p1);
		jb.addActionListener(this);
		setTitle("GUI Test1");
		setSize(500,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
		String s = jtf.getText();
		FileOutputStream fos = new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF(jta.getText());
		fos.close();
		System.out.print(s + "파일이 생성되었습니다.");
		}
		catch(Exception ae) {}
	}
}
public class GUITest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI1();
	}

}
