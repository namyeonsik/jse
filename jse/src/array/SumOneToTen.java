package array;

public class SumOneToTen {

	public static void main(String[] args) {
		int[] arr = new int[10];	// 배열의 선언
		int sum=0;
		//int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<arr.length; i++){
			arr[i] = i+1;
			System.out.println(arr[i]);
			//sum += arr[i];
		}
		
		for (int i : arr) {
			//arr[i] = i+1;
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum);	
	}
}
