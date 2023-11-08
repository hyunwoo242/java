import java.util.LinkedList;
import java.util.TreeSet;

/*
 * TreeSet<E>
 * ���� �˻��� ������� �����ϴ� Ŭ����
 * 
 * ���� Ž��, ���Ŀ� ����
 * ����Ʈ���� LinkedList�� ����
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
		//treeset�� �Է¼����� ������� �׻� ���ĵȴ�.
		System.out.println("low : " + low);
		System.out.println("even : " + even);
		
		TreeSet<Integer> union = new TreeSet<Integer>(low);
		TreeSet<Integer> intersection = new TreeSet<Integer>(low);
		TreeSet<Integer> difference = new TreeSet<Integer>(low);
		
		union.addAll(even); //������ ���
		intersection.retainAll(even); //������
		difference.removeAll(even); //������
		
		System.out.println("������ : " + union);
		System.out.println("������ : " + intersection);
		System.out.println("������ : " + difference);
	}

}
