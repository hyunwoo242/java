
public class CharacterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = {'a','?','김','5','A'};
		for(int i=0; i<a.length; i++) {
			System.out.println("ㅁ[" +i+"]번째 요소 = "+a[i]);
			if(Character.isDigit(a[i]))
					System.out.print(" 숫자입니다.");
			if(Character.isLetter(a[i]))
				System.out.print(" 문자입니다.");
			if(Character.isUpperCase(a[i]))
				System.out.print(" 대문자입니다.");
			if(Character.isLowerCase(a[i]))
				System.out.print(" 소문자입니다.");
		}
		if(Character.isDefined(a[2])) {
			System.out.println("a[2] 번째 요소 = "+a[2]);
			System.out.println(" 유니코드 입니다.");
		}
	}

}
