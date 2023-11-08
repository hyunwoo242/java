import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Set�� ������ ����.
 * ������ ����, �ߺ� ������� �ʴ´�.
 * 
 * HashSet<E>
 * 	����� ���� �ε����� ���⿡ ������ ����.
 * ���� ���� �˻翡 ���ȴ�.
 * ���� �˻� �ӵ��� ��������� ������.
 * �������� ũ�⿡ ������� �˻��� �ɸ��� �ð��� �ſ�ª��.
 */
public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ��ü ����
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		//�¿� Ȧ���� ¦���� �߱�
		
		for(int i=1; i<=4; i++) {
			if(i%2 == 1) {
				odd.add(i);
			}else {
				even.add(i);
			}
		}
		System.out.println("Ȧ�� : " + odd);
		System.out.println("¦�� : " + even);
		
		System.out.println("-----------------------------");
		
		boolean setChanged = odd.add(5);
		System.out.println("Ȧ���� 5�߰� ����?" + setChanged);
		//set�� �ߺ��� ������� �ʽ��ϴ�
		System.out.println("Ȧ�� : " + odd);
		
		System.out.println("-----------------------------");
		
		setChanged = even.add(12);
		System.out.println("¦���� 12�߰� ����?" + setChanged);
		//set�� �ߺ��� ������� �ʽ��ϴ�
		System.out.println("¦�� : " + even);
		
		System.out.println("-----------------------------");
		// HashSet �� Collection �������̽��� �����Ѵ�. �� ��� ����.
		System.out.println("Ȧ������ �ּҰ� :  " + Collections.min(odd));
		System.out.println("¦������ �ִ� :  " + Collections.max(even));
		
		// ¦���� �� ���ϱ�
		//iterator() �޼ҵ� ���. - Hashset�� ������ �ο��ϱ� ���� ���.
		//iterator() �� ��������
		//hasNext() ���� ���� �ִ��� �̻�.
		//next() : ���� �� ��������
		Iterator<Integer> it = even.iterator();
		int sum = 0;
		while (it.hasNext()) { //�о� �� ��Ұ� ���� �ִ��� Ȯ��
			sum = sum + it.next();
		} // next�� ����ϱ����� hasNext�� ���Ͽ� �˻��ϴ� ���� ����.
		System.out.println("¦���� ����" + sum);
	}
}
