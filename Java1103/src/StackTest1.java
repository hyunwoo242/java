import java.util.Stack;

/*
 *  Stack�� LIFO�̴�
 *  Push(), Pop() �޼ҵ� ���, Vector() Ŭ������ �޼ҵ� �̿�
 */
public class StackTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		//stack�� �߰�
		System.out.println("----Stack�� �߰�----");
		System.out.println("Stack�� �߰� : " + stack.push("��⵵"));
		System.out.println("Stack�� �߰� : " + stack.push("��û��"));
		System.out.println("Stack�� �߰� : " + stack.push("������"));
		System.out.println("Stack�� �߰� : " + stack.push("����"));
		System.out.println("Stack�� �߰� : " + stack.push("���"));
		System.out.println("Stack�� �߰� : " + stack.push("���ֵ�"));
		System.out.println("----Stack�� ����----");
		System.out.println(stack);
		System.out.println("----���ֵ� ã��----");	
		int n = stack.search("���ֵ�"); //������ -1 ��ȯ LIFI
		//System.out.println(n);	
		
		if ( n != -1) {
			System.out.println("���ÿ��� ���ֵ��� ��ġ�� :" + n + "��° �Դϴ�.");	
		}
		else {
			System.out.println("���ÿ��� ���ֵ��� �����ϴ�");
		}
		
		System.out.println("----Stack���� ���� �����ϸ鼭 �������----");
		
		while ( !stack.empty()) { //�ݺ������� ǥ��
			String obj = stack.pop();
			System.out.println("Stack ���� ���� : " + obj);
			
		}
		
	}
}
