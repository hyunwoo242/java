import java.io.File;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto;-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ���ϴ� �л��� �й��� �Է��Ͻÿ� : ");
		int id = sc.nextInt();
		Scanner phone = new Scanner(new File("phone.txt"));
		
		while (phone.hasNext() ) {
			if (id==phone.nextInt()) {
				System.out.println(id + "�л��ǿ���ó : " + phone.next());
				return;
			}
			else {
				phone.next();
			}
		}
		System.out.println("�ش� �л��� �����ϴ�.");
	}

}
