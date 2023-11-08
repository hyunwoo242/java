import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class FirstFrame2 extends JFrame {
	public FirstFrame2() {
		//컨테이너 객체생성
		Container ct = getContentPane();
		//버튼 객체생성
		JButton jb = new JButton("테스트버튼");
		//컨테이너에 버튼추가
		ct.add(jb);
		//프레임제목생성
		setTitle("두 번째 GUI 프로그램 - JFrame");
		//사이즈
		setSize(400, 300);
		//화면출력
		setVisible(true);
	}
}
public class FrameTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame2();
	}
}
