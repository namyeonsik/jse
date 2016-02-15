package operation;

import java.util.Scanner;

public class Kaup {
	/**
	 * 키를 입력하세요 
	 * height 몸무게를 입력하세요 
	 * weight 카우푸 인덱스 
	 * index = (몸무게 / (키*키))*10000
	 * index > 30 비만 
	 * > 24 과체중 
	 * > 20 정상 
	 * > 15 저체중 
	 * > 13 마름 
	 * > 10 영양실조 
	 * 소모증
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("키 :");
		double height = sc.nextDouble();
		System.out.println("몸무게 :");
		double weight = sc.nextDouble();

		int index = (int) ((weight / (height * height)) * 10000);
		System.out.print(name + "님은 ");
		if (index > 30) {
			System.out.print("비만");
		} else if (index > 24) {
			System.out.print("과체중");
		} else if (index > 20) {
			System.out.print("정상");
		} else if (index > 15) {
			System.out.print("저체중");
		} else if (index > 13) {
			System.out.print("마름");
		} else if (index > 10) {
			System.out.print("영양실조");
		} else {
			System.out.print("소모증");
		}
		
		System.out.println("입니다.");
	}
}
