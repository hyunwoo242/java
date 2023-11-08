/*
 * 1. math 클래스 생성
 * 	멤버변수 생성 public int sum
 * 	sum 메소드 생성 -개의 매개 변수 가짐
 * 		1)2개의 매개 변수로 합계 계산
 * 		2)합계 리턴
 * 
 * 메인 메소드
 * 	스캐너 객체 생성
 * 	math 클래스로부텉 객체 생성
 * 	2개의 정수 입력 받기
 * 	2개의 정수를 가지고 math 클래스의 sum() 메소드, 호출하고 리턴 값은 result에 저자아
 * 	결과 출력
 */
import java.util.Scanner;

class hap{
	int total;
	public hap(int a, int b) {
		total=a+b;
		return;
	}
}
public class java_p {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		hap num = new hap(a,b);
		System.out.print(num.total);

	}
}
