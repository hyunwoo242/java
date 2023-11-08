import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 내부 클래스를 이용한 이벤트 처리
 */

class Event2 extends JFrame  {
	JLabel j1;
	JButton jb1, jb2;
	
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout()); // 배치관리자 생성
		jb1 = new JButton("사랑합니다~");
		jb2 = new JButton("행복합니다.");
		j1 = new JLabel("버튼을 누르세요");
		
		// 3. 버튼에 리스너 들록
		
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
	
		// 1. 처리할 이벤트 종류 결정
		// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성
	private class EventProcess implements ActionListener {

			// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
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
