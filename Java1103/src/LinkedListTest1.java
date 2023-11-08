import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		long start, stop;
		int i;
		
		// ArrayList에 데이터 추가
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			alist.add(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - 순차적삽입시간 : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			llist.add(i);
		}
		
		System.out.println("LinkedList - 순차적삽입시간 : " + (stop-start));
		stop = System.currentTimeMillis();
		
		//중간에 데이터 삽입
		
		// ArrayList에 데이터 추가
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			alist.add(500,i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - 중간 삽입시간 : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			llist.add(500,i);
		}
		
		System.out.println("LinkedList - 중간삽입시간 : " + (stop-start));
		stop = System.currentTimeMillis();
	}

}
