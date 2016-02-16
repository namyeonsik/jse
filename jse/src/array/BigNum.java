package array;

import java.util.Scanner;

public class BigNum {
	/**
	 * 입력된 숫자에서 가장 큰 수 구하기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		
		System.out.println("3개의 숫자를 입력하시오");
		System.out.println("입력된 숫자 중 가장 큰 수를 반환");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		System.out.println("입력된 숫자 중에서 가장 큰 수는 " + max + "");
		
	}
}
