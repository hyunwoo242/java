/*
 * 
 */
class Box<T>{ //���׸� Ŭ���� ����
	T vol;	//������ ���׸����� ����
	void setVolum(T v) { //�޼ҵ� �Ű������� ���׸����� ����
		vol=v;
	}
	T getVolume() { //��ȯ���� ���� ���׸����� ����
		return vol;
	}
}

public class GenenicsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���׸� ���� �����Ͽ� ��ü ����. Integer
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolum(200);
		//ibox.setVolum(32.2); //���� �����ʾ� ����
		System.out.println("<Integer> �ڽ��� ���Ǵ� : "+ ibox.getVolume());
		
		//���׸� ���� �����Ͽ� ��ü����. Double
		Box<Double> dbox = new Box<Double>();
		dbox.setVolum(123.456);
		//dbox.setVolume(300);
		System.out.println("<Double>�ڽ��� ���Ǵ� : "+dbox.getVolume());
	
	}

}
