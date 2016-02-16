package bank;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// [한빛뱅크] 홍길동 : 1234계좌, 잔고 1000원
		AccountService service = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		// 1. open
		System.out.println("이름, 비밀번호 :");
		System.out.println(service.open(sc.next(), sc.nextInt()));
		
		// 2. deposit
		System.out.println("입금액 :");
		System.out.println(service.deposit(sc.nextInt()));
		
		// 3. withdraw
		System.out.println("출금액 :");
		System.out.println(service.withdraw(sc.nextInt()));
		
		// 4. search
		System.out.println(service.search());
	}
}
