import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame2 extends JFrame {
	public FirstFrame2() {
		//�����̳� ��ü����
		Container ct = getContentPane();
		//��ư ��ü����
		JButton jb = new JButton("�׽�Ʈ��ư");
		//�����̳ʿ� ��ư�߰�
		ct.add(jb);
		//�������������
		setTitle("�� ��° GUI ���α׷� - JFrame");
		//������
		setSize(400, 300);
		//ȭ�����
		setVisible(true);
	}
}
public class FrameTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame2();
	}
}
