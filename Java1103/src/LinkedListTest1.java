import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		long start, stop;
		int i;
		
		// ArrayList�� ������ �߰�
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			alist.add(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - ���������Խð� : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			llist.add(i);
		}
		
		System.out.println("LinkedList - ���������Խð� : " + (stop-start));
		stop = System.currentTimeMillis();
		
		//�߰��� ������ ����
		
		// ArrayList�� ������ �߰�
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			alist.add(500,i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - �߰� ���Խð� : " + (stop-start));
		
		start = System.currentTimeMillis();
		for (i=0; i<=100000; i++) {
			llist.add(500,i);
		}
		
		System.out.println("LinkedList - �߰����Խð� : " + (stop-start));
		stop = System.currentTimeMillis();
	}

}
