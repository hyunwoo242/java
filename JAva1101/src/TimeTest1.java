import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.sound.midi.SysexMessage;

public class TimeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("오늘의 날짜 : " + date);
		System.out.println("오늘의 시간 : " + time);
		System.out.println("현재 날짜와 시간 : " + dt);
		
		String s = dt.getYear()+"년";
		s += dt.getMonthValue() + "월";
		s += dt.getDayOfMonth() + "일";
		s += dt.getDayOfWeek()+ " ";
		s += dt.getHour() + "시";
		s += dt.getMinute() + "분";
		s += dt.getSecond() + "초";
		System.out.println("현재날짜와 시간 : " + s);
		
		System.out.println("오늘부터 100일은? " + date.plusDays(100));
	}	

}
