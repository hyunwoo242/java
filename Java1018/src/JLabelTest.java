import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class JLabelTest1 extends JFrame implements ActionListener {// ActionListener 생성
	JPanel jp1 = new JPanel(); //판넬 3개 생성
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JLabel jl1 = new JLabel("당신의 혈액형은?"); //레이블로 텍스트 보여주기
	JLabel jl2 = new JLabel(""); //빈 레이블을 이용하여 버튼 터치시 나타낼 이벤트 텍스트 생성
	
	JButton jb1,jb2,jb3,jb4;
	public JLabelTest1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("A형"); //A형 부터 O형까지 버튼 객체 생성
		jb2 = new JButton("B형");
		jb3 = new JButton("AB형");
		jb4 = new JButton("O형");
		jp1.add(jl1);
		jp2.setLayout(new GridLayout(1,4));
		add(jl1);
		jp2.add(jb1); // 버튼 객체를 판넬을 이용하여 나타냄 컨테이너 위에
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp3.add(jl2);
		
		jb1.addActionListener(this); //버튼 클릭시 나타나는 이벤트
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		
		ct.add(jp1, BorderLayout.NORTH); //각 행에 분배하여 나타냄
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		setTitle("JLabel Test");
		setSize(300,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			String s = "선택한 혈액형 : ";
			jl2.setText(s+e.getActionCommand()); //버튼클락시 나타나는 텍스트+형액형
	}
	
}
public class JLabelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelTest1(); //클래스에 오브젝트 호출
	}

}
