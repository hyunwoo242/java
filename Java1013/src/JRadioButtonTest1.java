import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadioButton1 extends JFrame implements ActionListener {
	JLabel j1;
	JCheckBox[] jr = new JCheckBox[5]; //체크박스 배열 5칸 생성
	String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "패러글라이딩"}; //생성된 배열안에 취미 종류 넣음
	public JRadioButton1() {
		j1 = new JLabel();
		
		JLabel jl1 = new JLabel("당신의 취미?");
		JLabel jl2 = new JLabel("당신의 나이?");
		
		JRadioButton[] jc = new JRadioButton[5]; //라디오 버튼 5개 배열생성
		String[] age = {"20대", "30대", "40대", "50대", "60대"}; //값 넣기
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		ButtonGroup gb = new ButtonGroup(); //버튼그룹 객체 gb로 생성
		
		for (int i=0; i<5; i++) {
			jr[i] = new JCheckBox(hobby[i]); // 체크박스 객체를 배열로 생성
			jc[i] = new JRadioButton(age[i]); //라디오버튼으로 객체를 배열로 생성
			hobbypanel.add(jr[i]); //판넬에 객체 추가
			agepanel.add(jc[i]);
		}
		
		Container ct = getContentPane(); // 컨테이너 생성
		ct.setLayout(new GridLayout(3,1)); //(3행,1열)을 가지는 레이아웃 생성
		
		JPanel jp1 = new JPanel(); //
		jp1.add(jl1);
		jp1.add(hobbypanel);
		
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		
		JPanel jp3 = new JPanel();
		jp3.add(j1);
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		//창 크기,제목
		setTitle("JRadioButtonTest1");
		setSize(350,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = "당신의 취미 : ";
		for(int i =0; i<5; i++) { //반복문을 이용하여 배열에 있는 값과 맞을때 값 표출
			if(jr[i].isSelected()==true)
					s=s+hobby[i]+" ";
		}
		s=s+"당신의 나이 : ";
		j1.setText(s + e.getActionCommand()); //체크된 값
	}
}
public class JRadioButtonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButton1();
	}

}
