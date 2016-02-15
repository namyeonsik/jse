package switchcase;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("주민번호 :");
		String ssn = sc.next();
		char index = ssn.charAt(7);
		//System.out.println(index);
		
		String gender = "";
		switch (index) {
		case '1':case '3':gender="남자";break;
		case '2':case '4':gender="여자";break;
		case '5':gender="외국인 남자";break;
		case '6':gender="외국인 여자";break;

		default:System.out.println("오류입니다.");return;
		}
		
		System.out.println(name + "님은 " + gender + "입니다.");
	}
}
