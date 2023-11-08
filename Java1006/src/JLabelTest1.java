import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * GUI클래스
 * 1. 처리할 이벤트 종류 결정.
 * 2. 이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성.
 * 버튼에 동작하는 이벤트 처리를 위해 리스너 포함.
 */
class JLabel1 extends JFrame implements ActionListener {
	private JLabel result = new JLabel(); // 문자열이나 아이콘을 사용하여 객체생성.
	public ImageIcon img1,img2; // 이미지를 아이콘화 하는 기능제공

	public JLabel1() {
		img1 = new ImageIcon("apple.jpg");
		img2 = new ImageIcon("pear.jpg");

		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		Container ct = getContentPane();
		
		ct.setLayout(new FlowLayout());
		
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		//동작화면
		apple.addActionListener(this);
		pear.addActionListener(this);
		
		//화면
		setTitle("JLabel Test1");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	//4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "사과") {
			result.setText("맛있는 사과입니다.");
			result.setIcon(img1);
		}else {
			result.setText("맛있는 배입니다");
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
