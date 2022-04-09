package My_Cafe;

import java.util.Scanner;

class MyCafe{
	private static int totalCount = 0; // 공유되는 필드
	private int count = 0; // 객체마다 가지고 있는 필드
	
	private String cafeName = "JAVA";
	public String nickName ;
	
	public MyCafe(String nickName) {
		this.nickName = nickName;
		System.out.println(cafeName + "카페에 방문하였습니다.");
		
		totalCount++;
		count++;
	}
	public void disp() {
		System.out.println("우리까페 전체 방문자 수는: "+totalCount+"입니다.");
		System.out.println(nickName+"님의 방문 횟수는: "+count+"입니다.");
	}
}
public class Cafe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자바 카페에 방문합니다.");
		System.out.print("닉네임을 입력: ");
		String nickName = scan.next();
		
		MyCafe cafe = new MyCafe(nickName);
		
		cafe.disp();
		System.out.println("새로운 아이디로 로그인 했습니다.");
		System.out.print("닉네임 입력: ");
		String nickName2 = scan.next();
		
		MyCafe Cafe2 = new MyCafe(nickName2);
		
		Cafe2.disp();
		
		scan.close();

	}
}


