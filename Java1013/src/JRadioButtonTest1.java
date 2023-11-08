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
	JCheckBox[] jr = new JCheckBox[5]; //üũ�ڽ� �迭 5ĭ ����
	String[] hobby = {"�ȱ�", "���", "����", "��Ų�����", "�з��۶��̵�"}; //������ �迭�ȿ� ��� ���� ����
	public JRadioButton1() {
		j1 = new JLabel();
		
		JLabel jl1 = new JLabel("����� ���?");
		JLabel jl2 = new JLabel("����� ����?");
		
		JRadioButton[] jc = new JRadioButton[5]; //���� ��ư 5�� �迭����
		String[] age = {"20��", "30��", "40��", "50��", "60��"}; //�� �ֱ�
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		ButtonGroup gb = new ButtonGroup(); //��ư�׷� ��ü gb�� ����
		
		for (int i=0; i<5; i++) {
			jr[i] = new JCheckBox(hobby[i]); // üũ�ڽ� ��ü�� �迭�� ����
			jc[i] = new JRadioButton(age[i]); //������ư���� ��ü�� �迭�� ����
			hobbypanel.add(jr[i]); //�ǳڿ� ��ü �߰�
			agepanel.add(jc[i]);
		}
		
		Container ct = getContentPane(); // �����̳� ����
		ct.setLayout(new GridLayout(3,1)); //(3��,1��)�� ������ ���̾ƿ� ����
		
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
		
		//â ũ��,����
		setTitle("JRadioButtonTest1");
		setSize(350,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = "����� ��� : ";
		for(int i =0; i<5; i++) { //�ݺ����� �̿��Ͽ� �迭�� �ִ� ���� ������ �� ǥ��
			if(jr[i].isSelected()==true)
					s=s+hobby[i]+" ";
		}
		s=s+"����� ���� : ";
		j1.setText(s + e.getActionCommand()); //üũ�� ��
	}
}
public class JRadioButtonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButton1();
	}

}
