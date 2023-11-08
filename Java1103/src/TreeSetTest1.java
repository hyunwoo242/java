import java.util.LinkedList;
import java.util.TreeSet;

/*
 * TreeSet<E>
 * 이진 검색을 기반으로 제공하는 클래스
 * 
 * 벙위 탐색, 정렬에 유리
 * 이진트리는 LinkedList의 변형
 */
public class TreeSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet<Integer> low = new TreeSet<Integer>();
		//TreeSet<Integer> even = new TreeSet<Integer>();
		
		LinkedList<Integer> low = new LinkedList<Integer>();
		LinkedList<Integer> even = new LinkedList<Integer>();
		for(int i=4; i>=0; i--) {
			low.add(i);
			even.add(i*2);
		}
		//treeset은 입력순서에 상관없이 항상 정렬된다.
		System.out.println("low : " + low);
		System.out.println("even : " + even);
		
		TreeSet<Integer> union = new TreeSet<Integer>(low);
		TreeSet<Integer> intersection = new TreeSet<Integer>(low);
		TreeSet<Integer> difference = new TreeSet<Integer>(low);
		
		union.addAll(even); //합집합 계산
		intersection.retainAll(even); //교집합
		difference.removeAll(even); //차집합
		
		System.out.println("합집합 : " + union);
		System.out.println("교집합 : " + intersection);
		System.out.println("차집합 : " + difference);
	}

}
