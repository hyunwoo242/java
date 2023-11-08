import java.io.File;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto;-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("검색을 원하는 학생의 학번을 입력하시오 : ");
		int id = sc.nextInt();
		Scanner phone = new Scanner(new File("phone.txt"));
		
		while (phone.hasNext() ) {
			if (id==phone.nextInt()) {
				System.out.println(id + "학생의연락처 : " + phone.next());
				return;
			}
			else {
				phone.next();
			}
		}
		System.out.println("해당 학생이 없습니다.");
	}

}
