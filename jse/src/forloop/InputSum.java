package forloop;

import java.util.Scanner;

public class InputSum {
	// 두개의 정수를 입력받아서 그 범위 내의 정수의 합 구하기
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, sum = 0, big = 0, small = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수 입력 :");
		num1 = sc.nextInt();
		System.out.println("두 번째 수 입력 :");
		num2 = sc.nextInt();

		if(num1 > num2){
			big = num1;
			small = num2;
		}else{
			big = num2;
			small = num1;
		}
		for(int i=small; i<=big; i++){
			sum +=i;
		}
		
		System.out.println(small + "부터 " + big + "까지의 합은 " + sum);
	}
}
