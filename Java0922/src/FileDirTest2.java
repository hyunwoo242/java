import java.io.File;

public class FileDirTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:/Java_0922/0101/aa.txt");
		System.out.println("파일 이름 : " + f1.getName());
		System.out.println("파일 경로 : " + f1.getPath());
		System.out.println("파일 경로 : " + f1.getAbsolutePath());
		System.out.println(f1.exists() ?"파일존재" : "파일 없음");
		System.out.println(f1.canWrite() ?"수정가능" : "수정 불가능");
		System.out.println(f1.canRead() ?"읽기가능" : "읽기 불가능");
		System.out.println("파일의 크기 : "+f1.length()+"Bytes");
	}

}
