import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("ù��° �� �Է� : ");
			int num1 = Integer.parseInt(stdIn.next()); // ���� ó���� ���� ���
			
			System.out.print("�ι�° �� �Է� : ");
			int num2 = stdIn.nextInt();
			
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("���� Ÿ�Ը� �Է��ؾ� �մϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("���� �߻� ��.");
		} finally {
			System.out.println("���α׷� ����");
		}
	}

}
