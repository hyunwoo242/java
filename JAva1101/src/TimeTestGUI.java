import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyTime extends JFrame implements ActionListener {
	private JTextField jtf; //�ؽ�Ʈ ĥ���ִ°���
	private JTextArea jta1; //�ؽ�Ʈ ����,����(?)
	private JTextArea jta2;
	private JLabel j1 = new JLabel("����� ������ ������ �����Ͽ� �Է�(��:2020 01 01");
	
	public MyTime() {
		JButton jb1 = new JButton("����"); //��ư��ü
		JButton jb2 = new JButton("100��");
		jtf = new JTextField(10);
		jta1 = new JTextArea(4,20);
		jta2 = new JTextArea(3,20);
		
		jta1.setEditable(false);
		jta2.setEditable(false);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(j1);	//�ǳ��� ������ ������ �ٹٲ�
		p1.add(jtf);
		
		p2.add(jb1);
		p2.add(jta1);
		
		p3.add(jb2);
		p3.add(jta2);
		
		ct.add(p1); //�����̳� �ȿ� �ǳڳֱ�
		ct.add(p2);
		ct.add(p3);
		
		jb1.addActionListener(this); //��ư �۵�
		jb2.addActionListener(this);
		
		setTitle("JTextField,JTextArea");
		setSize(500,300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(100);
		
		
		if(e.getActionCommand() == "����") {
			jta1.append("����� ���� : " + toString(my_birth)+"\n");
			jta1.append("���� ��¥�� : " + toString(current)+"\n");
			
			jta1.append("���Ϻ��� ���ñ����� �� : " + my_birth.until(current, ChronoUnit.DAYS)+"\n");
			jta1.append("���Ϻ��� ���ñ����� �� : " + my_birth.until(current, ChronoUnit.YEARS));
		}
		else {
			jta2.append("����� 100�� �Ǵ� ���� : "+ toString(hundred)+"\n");
			jta2.append("100����� ���� ��(week) �� : "+ current.until(hundred,ChronoUnit.WEEKS)+"\n");
			jta2.append("100����� ���� �� �� : "+ current.until(hundred,ChronoUnit.DAYS)+"\n");
			jtf.setEditable(false);
		}
	}
	public static String toString(LocalDate d) {
		return d.getYear() +"��" +d.getMonthValue() + "��"+d.getDayOfMonth() +"��";
	}
}
public class TimeTestGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTime();
	}

}
