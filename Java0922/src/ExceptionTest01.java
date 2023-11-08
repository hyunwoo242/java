import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		
		try {
			System.out.println(num1/num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e +"0으로 나눌 수 없습니다.");
		}
	
	}

}
