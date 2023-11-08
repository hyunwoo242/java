import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"���̾��","�����̴���", "�丣","��ũ","������"};
		
		//���ڿ� �迭�� �̿��Ͽ� ����Ʈ ��ü(���׸�) ����.
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		
		System.out.println("�ʱⰪ : "+lname);
		
		// ����Ʈ �������� �߰�
		lname.add("�ѽ���");
		System.out.println("�����߰� : "+lname);
		
		//Ư�� ��ġ �� ����
		lname.set(0, "�ֿ���");
		System.out.println("0������ ���뺯��(���̾�� -> �ֿ���) : "+lname);
		
		//Ư�� ��ġ�� ����(�߰�)
		lname.add(3, "������");
		System.out.println("3������ ������ ���� : "+lname);
		
		//Collection Ŭ������ �޼ҵ� Ȱ��
		//����Ʈ�� �������� ��迭
		Collections.shuffle(lname);
		System.out.println("����Ʈ ��迭 : "+lname);
	
		Collections.sort(lname);
		System.out.println("����Ʈ ���� : "+lname);
		
		System.out.println("5���� �� (�˻�) ��� : "+lname.get(5));
		
		Collections.fill(lname, "�����");
		System.out.println("������� ä��� : "+lname);
	}

}
