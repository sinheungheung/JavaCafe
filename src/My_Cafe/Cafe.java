package My_Cafe;

import java.util.Scanner;

class MyCafe{
	private static int totalCount = 0; // �����Ǵ� �ʵ�
	private int count = 0; // ��ü���� ������ �ִ� �ʵ�
	
	private String cafeName = "JAVA";
	public String nickName ;
	
	public MyCafe(String nickName) {
		this.nickName = nickName;
		System.out.println(cafeName + "ī�信 �湮�Ͽ����ϴ�.");
		
		totalCount++;
		count++;
	}
	public void disp() {
		System.out.println("�츮���� ��ü �湮�� ����: "+totalCount+"�Դϴ�.");
		System.out.println(nickName+"���� �湮 Ƚ����: "+count+"�Դϴ�.");
	}
}
public class Cafe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ڹ� ī�信 �湮�մϴ�.");
		System.out.print("�г����� �Է�: ");
		String nickName = scan.next();
		
		MyCafe cafe = new MyCafe(nickName);
		
		cafe.disp();
		System.out.println("���ο� ���̵�� �α��� �߽��ϴ�.");
		System.out.print("�г��� �Է�: ");
		String nickName2 = scan.next();
		
		MyCafe Cafe2 = new MyCafe(nickName2);
		
		Cafe2.disp();
		
		scan.close();

	}
}


