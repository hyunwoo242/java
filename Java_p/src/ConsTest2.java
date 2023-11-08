import java.text.SimpleDateFormat;
import java.util.Locale;

public class ConsTest2 {

	public static void main(String[] args) {
		// ���� �ý��� �ð� ���ϱ�
		long systemTime = System.currentTimeMillis();
		 
		// ��� ���¸� ���� formmater 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
		 
		// format�� �°� ����ϱ� ���� ���ڿ� ��ȯ
		String dTime = formatter.format(systemTime);
		 
		System.out.println("Today is " + dTime); // 'Today is 2019-08-16 12:44:42' ���

		 
	}
}
