import java.text.SimpleDateFormat;
import java.util.Locale;

public class ConsTest2 {

	public static void main(String[] args) {
		// 현재 시스템 시간 구하기
		long systemTime = System.currentTimeMillis();
		 
		// 출력 형태를 위한 formmater 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
		 
		// format에 맞게 출력하기 위한 문자열 변환
		String dTime = formatter.format(systemTime);
		 
		System.out.println("Today is " + dTime); // 'Today is 2019-08-16 12:44:42' 출력

		 
	}
}
