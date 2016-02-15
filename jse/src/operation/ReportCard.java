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

		int total = kor + eng + math + sci;
		double avg = total / 4;
		String result = name + "학생의 총점은 " + total + "점 이고, 평균은 " + avg + "점으로 ";
		
		if (avg >= 90.0) {
			System.out.println(result + "장학생입니다.");
		} else if (avg >= 60.0) {
			System.out.println(result + "합격입니다.");
		} else {
			System.out.println(result + "불합격입니다.");
		}

	}
}
