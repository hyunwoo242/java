import java.util.Scanner;

public class ScannerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "happy day, smile day, nice day, joyful day";
		Scanner sc = new Scanner(s);
		sc.useDelimiter(" day, ");
		
		while (sc.hasNext()) {
			System.out.println(sc.next());
		
		}
	}

}
