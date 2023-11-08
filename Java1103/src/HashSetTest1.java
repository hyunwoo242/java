import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Set은 집합의 개념.
 * 순서가 없고, 중복 허용하지 않는다.
 * 
 * HashSet<E>
 * 	저장된 값은 인덱스가 없기에 순서가 없다.
 * 값의 유무 검사에 사용된다.
 * 유무 검사 속도가 상대적으로 빠르다.
 * 데이터의 크기에 상관없이 검색에 걸리는 시간이 매우짧다.
 */
public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 셋 객체 생성
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		//셋에 홀수와 짝수를 추기
		
		for(int i=1; i<=4; i++) {
			if(i%2 == 1) {
				odd.add(i);
			}else {
				even.add(i);
			}
		}
		System.out.println("홀수 : " + odd);
		System.out.println("짝수 : " + even);
		
		System.out.println("-----------------------------");
		
		boolean setChanged = odd.add(5);
		System.out.println("홀수애 5추가 성공?" + setChanged);
		//set은 중복을 허용하지 않습니다
		System.out.println("홀수 : " + odd);
		
		System.out.println("-----------------------------");
		
		setChanged = even.add(12);
		System.out.println("짝수애 12추가 성공?" + setChanged);
		//set은 중복을 허용하지 않습니다
		System.out.println("짝수 : " + even);
		
		System.out.println("-----------------------------");
		// HashSet 은 Collection 인터페이스를 포함한다. 다 사용 가능.
		System.out.println("홀수에서 최소값 :  " + Collections.min(odd));
		System.out.println("짝수에서 최댓값 :  " + Collections.max(even));
		
		// 짝수의 합 구하기
		//iterator() 메소드 사용. - Hashset에 순서를 부여하기 위해 사용.
		//iterator() 값 가져오기
		//hasNext() 다음 값이 있는지 겁사.
		//next() : 다음 값 가져오기
		Iterator<Integer> it = even.iterator();
		int sum = 0;
		while (it.hasNext()) { //읽어 올 요소가 남아 있는지 확인
			sum = sum + it.next();
		} // next를 사용하기전에 hasNext를 사하여 검사하는 것이 안전.
		System.out.println("짝수의 합은" + sum);
	}
}
