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
	private JTextField jtf; //텍스트 칠수있는공간
	private JTextArea jta1; //텍스트 지역,공간(?)
	private JTextArea jta2;
	private JLabel j1 = new JLabel("당신의 생일을 공배긍로 구분하여 입력(예:2020 01 01");
	
	public MyTime() {
		JButton jb1 = new JButton("현재"); //버튼객체
		JButton jb2 = new JButton("100살");
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
		
		p1.add(j1);	//판넬을 세개로 나누어 줄바꿈
		p1.add(jtf);
		
		p2.add(jb1);
		p2.add(jta1);
		
		p3.add(jb2);
		p3.add(jta2);
		
		ct.add(p1); //컨테이너 안에 판넬넣기
		ct.add(p2);
		ct.add(p3);
		
		jb1.addActionListener(this); //버튼 작동
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
		
		
		if(e.getActionCommand() == "현재") {
			jta1.append("당신의 생일 : " + toString(my_birth)+"\n");
			jta1.append("오늘 날짜는 : " + toString(current)+"\n");
			
			jta1.append("생일부터 오늘까지의 일 : " + my_birth.until(current, ChronoUnit.DAYS)+"\n");
			jta1.append("생일부터 오늘까지의 년 : " + my_birth.until(current, ChronoUnit.YEARS));
		}
		else {
			jta2.append("당신이 100이 되는 날은 : "+ toString(hundred)+"\n");
			jta2.append("100살까지 남은 주(week) 수 : "+ current.until(hundred,ChronoUnit.WEEKS)+"\n");
			jta2.append("100살까지 남은 일 수 : "+ current.until(hundred,ChronoUnit.DAYS)+"\n");
			jtf.setEditable(false);
		}
	}
	public static String toString(LocalDate d) {
		return d.getYear() +"년" +d.getMonthValue() + "월"+d.getDayOfMonth() +"일";
	}
}
public class TimeTestGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTime();
	}

}
