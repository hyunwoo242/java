import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader file = new FileReader("a.txt");
			/* FileReader�� ���� �о� ������
			 txt ������ �ݵ�� ANSI ���Ϸ� ���� �Ǿ�� �Ѵ�.
			
			 ���� ������ UTP-8�̸�
			 BufferRreader()Ŭ���� ����ϸ� ��,
			*/
			int i;
			while((i= file.read()) != -1)
				System.out.print((char)i);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ó�� ��ƾ : "+ e +"������ �������� �ʽ��ϴ�.");
			
		}
	}
}
