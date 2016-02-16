package oop;

import java.util.Scanner;

public class KaupMain {
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
		// 클래스타입 인스턴스 (객체) = new 생성자;
		KaupService service = new KaupServiceImpl();
		
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("키 :");
		double height = sc.nextDouble();
		System.out.println("몸무게 :");
		double weight = sc.nextDouble();

	
		
		System.out.println(name + "님은 " + service.getState(height, weight) + "입니다.");
	}
}
