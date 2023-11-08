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
	private JLabel j1 = new JLabel("입력하시오");
	
	public JTFJTA1() {
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		
		jta.setEditable(false);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(jtf); // 판넬에 텍스트 필드 추가
		p1.add(jta);	// 컨테이너에 라벨 추가
		ct.add(p1);
		ct.add(j1);
		jtf.addActionListener(this);
		setTitle("JTextField, JTextArea Test1");
		setSize(500,300);
		setVisible(true);
	}
	// 리스너 인터페이스에 선언된 메소드를 오버라이딩 하여 이벤트 처리 루틴 작성.
	// 이벤트 처리 메소드 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 텍스트 에어리어의 줄 수보다 작으면 텍스트 필드의 내용 추가
		if(jta.getLineCount() <= jta.getRows()) {
		jta.append(e.getActionCommand()+"\n");
		jtf.setText("");
	} else {
		j1.setText("입력이 종료되었습니다");
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
