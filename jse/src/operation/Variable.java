package operation;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		boolean b = true;
		char c = 'h';
		int i = 3;
		long l = 300L;
		float f = 3.0f;
		double d = 3.0001d;
		String s = "yeonsik";
		
		System.out.println("i는? -> " + i);
		System.out.println("s는? -> " + s);
		System.out.println("나는 오바연식ㅋ.ㅋ");
		System.out.println(s+" "+i);
		System.out.println("얼마입니까?");
		
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		System.out.println(price + "원 입니다.");
		
		System.out.println("이것은 무엇입니까?");
		String what = scanner.next();
		System.out.println(what + "입니다.");
		
	}
}
