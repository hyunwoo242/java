import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * 1.처리할 이벤트 종류 설정
 * 2. 이벤트에 적합한 이벤트리스너 인터페이스를 사용하여 클래스 작성
 */
class Event1 extends JFrame implements ActionListener {
	JLabel j1; //객체를  속성으로 등록
	
	public Event1() {
		Container ct = getContentPane(); //컨테이너 생성
		ct.setLayout(new FlowLayout()); // 배치관리자 생성
		
		JButton jb = new JButton("버튼");
		j1 = new JLabel("버튼을 누르세요");
		
		//3. 이벤트를 받아 들일 갈 컨포넌트에 설정
		jb.addActionListener(this);
		
		ct.add(jb);
		ct.add(j1);
		
		setTitle("Event Test1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩 하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		j1.setText("안녕하세요.");
	}
}
public class EventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event1();
	}

}
