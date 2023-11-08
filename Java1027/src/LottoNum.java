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
		JButton lotto = new JButton("������ �ζ� ��ȣ ����");
		//�����̳� ����
		Container ct = getContentPane();
	
		ct.setLayout(new FlowLayout());
		//��ü �߰�
		ct.add(lotto);
		//��ư �߰�
		ct.add(lotto_num);
		//�ζ� ��ȣ�� �׼� �ֱ�
		lotto.addActionListener(this);
		//â ǥ�ø��
		setTitle("�ζ� ��ȣ ������");
		//â ������
		setSize(300,250);
		//â���̱�
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random(); //���� ����.
		int[] rnum = new int[6]; //�迭
		int temp; // ���� ��ȣ ���� ����
		int i = 0;
		
		a:while(i<6) {
			temp = r.nextInt(45)+1; //�������� ���� �����Ͽ� ������ ����
			for(int j=0; j<i; j++) {
				if(temp == rnum[j]) {
					continue a; //�ٽû���. -���̺�� �̵�.
				}
				
			}
			rnum[i] = temp;
			i++;
			
		}
		lotto_num.setText("������ �ζ� ��ȣ�� : " + Arrays.toString(rnum)); //setText(������)
	}
}
public class LottoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lotto();
	}

}
