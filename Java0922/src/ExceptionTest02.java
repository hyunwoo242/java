import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 수 입력 : ");
			int num1 = Integer.parseInt(stdIn.next()); // 예외 처리시 문장 출력
			
			System.out.print("두번째 수 입력 : ");
			int num2 = stdIn.nextInt();
			
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("숫자 타입만 입력해야 합니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생 함.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}
