import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener {
	private JLabel lotto_num = new JLabel();
	public Lotto() {
		JButton lotto = new JButton("오늘의 로또 번호 생성");
		//컨테이너 설정
		Container ct = getContentPane();
	
		ct.setLayout(new FlowLayout());
		//객체 추가
		ct.add(lotto);
		//버튼 추가
		ct.add(lotto_num);
		//로또 번호에 액션 주기
		lotto.addActionListener(this);
		//창 표시목록
		setTitle("로또 번호 제조기");
		//창 사이즈
		setSize(300,250);
		//창보이기
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random(); //랜덤 생성.
		int[] rnum = new int[6]; //배열
		int temp; // 랜덤 번호 저장 변수
		int i = 0;
		
		a:while(i<6) {
			temp = r.nextInt(45)+1; //랜덤으로 정수 생성하여 변수에 저장
			for(int j=0; j<i; j++) {
				if(temp == rnum[j]) {
					continue a; //다시생성. -레이블로 이동.
				}
				
			}
			rnum[i] = temp;
			i++;
			
		}
		lotto_num.setText("오늘의 로또 번호는 : " + Arrays.toString(rnum)); //setText(문자형)
	}
}
public class LottoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lotto();
	}

}
