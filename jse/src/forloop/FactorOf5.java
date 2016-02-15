package forloop;

public class FactorOf5 {
	/**
	 * [결과]
	 * 1에서 100까지 정수에서
	 * 5의 배수의 갯수 ?
	 * 5의 배수의 합 ?
	 * 
	 */
	public static void main(String[] args) {
		int sum = 0, count = 0;
		
		for(int i=1; i<=100; i++){
			if(i%5 == 0){
				sum += i;
				count++;
			}
		}
		
		System.out.println("5의 배수의 갯수는 " + count + "개 이고, 합계는 " + sum + "이다.");
	}
}
