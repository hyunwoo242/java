import java.io.File;

public class FileDirTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:/Java_0922/0101/aa.txt");
		System.out.println("���� �̸� : " + f1.getName());
		System.out.println("���� ��� : " + f1.getPath());
		System.out.println("���� ��� : " + f1.getAbsolutePath());
		System.out.println(f1.exists() ?"��������" : "���� ����");
		System.out.println(f1.canWrite() ?"��������" : "���� �Ұ���");
		System.out.println(f1.canRead() ?"�бⰡ��" : "�б� �Ұ���");
		System.out.println("������ ũ�� : "+f1.length()+"Bytes");
	}

}
