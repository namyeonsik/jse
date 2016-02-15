package operation;

import java.util.Scanner;

public class FirstGrade {
	String name;	// 멤버변수
	public static void main(String[] args) {
		/**
		 * 첫번째 학생 평균
		 * 두번째
		 * 세번째
		 * 
		 * 결과 : 홍길동이 1등입니다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 학생 이름 :");
		String name1 = sc.next();
		System.out.println("첫번째 학생 평균 :");
		double avg1 = sc.nextDouble();
		System.out.println("두번째 학생 이름 :");
		String name2 = sc.next();
		System.out.println("두번째 학생 평균 :");
		double avg2 = sc.nextDouble();
		System.out.println("세번째 학생 이름 :");
		String name3 = sc.next();
		System.out.println("세번째 학생 평균 :");
		double avg3 = sc.nextDouble();
		
		String firstName = "";	// 지역변수 local variable
		// 지역변수는 반드시 초기화를 해야한다.
		// 초기화란 최초 지역변수를 선언할 때 null 값을 할당하는 것
		// 변수는 카멜표기법(낙타) 으로 표기한다.
		// 클래스는 파스칼표기법 으로 표기한다.
		// statement + variable = algorithm
		if (avg1 > avg2 && avg1 > avg3) {
			firstName = name1;
		} else if(avg2 > avg3){
			firstName = name2;
		}else{
			firstName = name3;
		}
		
		System.out.println("결과 : " + firstName + "이 1등입니다.");
	}
}
