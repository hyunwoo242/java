import java.util.StringTokenizer;

public class StringTokenText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "name kimhy gender M age 23";
		String s2 = "name,kimhy,gender,M,age,23";
		
		System.out.println(":: 빈칸을 기준으로 ::");
		StringTokenizer st1 = new StringTokenizer(s1);
		
		while(st1.hasMoreTokens()) {
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		System.out.println(":: 쉼표를 기준으로 ::");
		StringTokenizer st2 = new StringTokenizer(s2, ","); //,를 분리한 후 인식
		
		while(st2.hasMoreTokens()) {
			String first = st2.nextToken();
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}
	}

}
