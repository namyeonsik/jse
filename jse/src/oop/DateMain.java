package oop;

import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
		//System.out.println("5월의 마지막 날은 31일");
		
		Scanner sc = new Scanner(System.in);
		DateService date = new DateServiceImpl();
		
		System.out.println("월 입력 :");
		int month = sc.nextInt();
		String result = date.getEndDayOfMonth(month);
		
		if(result == "")
			System.out.println("입력오류 : 1~12사이의 숫자를 입력");
		else
			System.out.println(month + "월의 마지막 날은 " + result);
		
	}
}
