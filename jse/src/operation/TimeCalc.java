package operation;

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 초를 시간과 분과 초로 바꾸어 주는 프로그램 ***");
		/**
		 * + - * / % 
		 * 
		 * sec, hour, min
		 * */
		System.out.println("초를 입력하세요.");
		int sec = sc.nextInt();
		
		int min = sec / 60;
		int hour = min / 60;
		min %= 60;
		//sec %= 60;
		System.out.println("입력한 " + sec + "초는 " + hour + "시간 " + min + "분 " + sec%60 + "초입니다.");
	}
}
