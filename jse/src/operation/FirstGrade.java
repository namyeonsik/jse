package operation;

import java.util.Scanner;

public class FirstGrade {
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
		
		String firstname;
		
		if (avg1 > avg2 && avg1 > avg3) {
			firstname = name1;
		} else if(avg2 > avg1 && avg2 > avg3){
			firstname = name2;
		}else{
			firstname = name3;
		}
		
		System.out.println("결과 : " + firstname + "이 1등입니다.");
	}
}
