import java.util.Stack;

/*
 *  Stack은 LIFO이다
 *  Push(), Pop() 메소드 사용, Vector() 클래스의 메소드 이용
 */
public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		//stack에 추가
		System.out.println("----Stack에 추가----");
		System.out.println("Stack에 추가 : " + stack.push("경기도"));
		System.out.println("Stack에 추가 : " + stack.push("충청도"));
		System.out.println("Stack에 추가 : " + stack.push("강원도"));
		System.out.println("Stack에 추가 : " + stack.push("전라도"));
		System.out.println("Stack에 추가 : " + stack.push("경상도"));
		System.out.println("Stack에 추가 : " + stack.push("제주도"));
		System.out.println("----Stack에 내용----");
		System.out.println(stack);
		System.out.println("----제주도 찾기----");	
		int n = stack.search("제주도"); //없으면 -1 반환 LIFI
		//System.out.println(n);	
		
		if ( n != -1) {
			System.out.println("스택에서 제주도의 위치는 :" + n + "번째 입니다.");	
		}
		else {
			System.out.println("스택에서 제주도는 없습니다");
		}
		
		System.out.println("----Stack에서 내용 삭제하면서 내용출력----");
		
		while ( !stack.empty()) { //반복문으로 표출
			String obj = stack.pop();
			System.out.println("Stack 에서 삭제 : " + obj);
			
		}
		
	}
}
