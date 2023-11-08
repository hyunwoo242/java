import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader file = new FileReader("a.txt");
			/* FileReader로 파일 읽어 오려면
			 txt 파일이 반드시 ANSI 파일로 저장 되어야 한다.
			
			 만약 파일이 UTP-8이면
			 BufferRreader()클래스 사용하면 됨,
			*/
			int i;
			while((i= file.read()) != -1)
				System.out.print((char)i);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("예외 처리 루틴 : "+ e +"파일이 존재하지 않습니다.");
			
		}
	}
}
