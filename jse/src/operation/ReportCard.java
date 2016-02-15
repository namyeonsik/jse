package operation;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름 :");
		String name = sc.next();
		
		System.out.println("국어 점수 :");
		int kor = sc.nextInt();
		System.out.println("영어 점수 :");
		int eng = sc.nextInt();
		System.out.println("수학 점수 :");
		int math = sc.nextInt();
		System.out.println("과학 점수 :");
		int sci = sc.nextInt();
		
		int total = kor+eng+math+sci;
		System.out.println(name + "학생의 총점은 " + total + "점 이고, 평균은 " + total/4 + "점 입니다.");
				
				
	}
}
