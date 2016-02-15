package switchcase;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력 :");
		String opcode = sc.next();
		System.out.println("숫자 입력 :");
		int num2 = sc.nextInt();
		
		int result=0;
		
		switch (opcode) {
		case "+":result=num1 + num2;break;
		case "-":result=num1 - num2;break;
		case "*":result=num1 * num2;break;
		case "/":result=num1 / num2;break;
		case "%":result=num1 % num2;break;

		default:System.out.println("연산기호를 정확하게 입력해 주세요.");break;
		}
		
		System.out.println(num1 + " " + opcode + " " + num2 + " = " + result);
		
	}
}
