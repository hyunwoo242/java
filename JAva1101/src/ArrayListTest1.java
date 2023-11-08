import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"아이언맨","스파이더맨", "토르","헐크","마동석"};
		
		//문자열 배열을 이용하여 리스트 객체(제네릭) 생성.
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		
		System.out.println("초기값 : "+lname);
		
		// 리스트 마지막에 추가
		lname.add("한승희");
		System.out.println("승희추가 : "+lname);
		
		//특정 위치 값 변경
		lname.set(0, "최원진");
		System.out.println("0번지에 내용변경(아이어맨 -> 최원진) : "+lname);
		
		//특정 위치에 삽입(추가)
		lname.add(3, "김지희");
		System.out.println("3번지에 김지희 삽입 : "+lname);
		
		//Collection 클래스의 메소드 활용
		//리스트를 무작위로 재배열
		Collections.shuffle(lname);
		System.out.println("리스트 재배열 : "+lname);
	
		Collections.sort(lname);
		System.out.println("리스트 정렬 : "+lname);
		
		System.out.println("5번지 값 (검색) 출력 : "+lname.get(5));
		
		Collections.fill(lname, "어벤져스");
		System.out.println("어벤져스로 채우기 : "+lname);
	}

}
