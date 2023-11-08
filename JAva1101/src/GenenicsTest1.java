/*
 * 
 */
class Box<T>{ //제네릭 클래스 선언
	T vol;	//변수를 제네릭으로 선언
	void setVolum(T v) { //메소드 매개변수를 제네릭으로 선언
		vol=v;
	}
	T getVolume() { //변환값의 형으 제네릭으로 선언
		return vol;
	}
}

public class GenenicsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭 형을 지정하여 객체 생성. Integer
		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolum(200);
		//ibox.setVolum(32.2); //형이 맞지않아 오류
		System.out.println("<Integer> 박스이 부피는 : "+ ibox.getVolume());
		
		//제네릭 형을 지정하여 객체생성. Double
		Box<Double> dbox = new Box<Double>();
		dbox.setVolum(123.456);
		//dbox.setVolume(300);
		System.out.println("<Double>박스의 부피는 : "+dbox.getVolume());
	
	}

}
