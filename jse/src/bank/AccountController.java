package bank;

import java.util.Scanner;

public class AccountController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountService service = new AccountServiceImpl();
		
		while (true) {
			System.out.println("업무선택 : 1. 계좌개설 2. 입금 3. 출금 4. 잔액조회 5. 종료");
			
			switch (sc.nextInt()) {
			case 1:
				System.out.println("이름, 비밀번호 :");
				System.out.println(service.open(sc.next(), sc.nextInt()));
				break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:return;

			default:
				System.out.println("1~5번 사이에서 선택가능합니다.");
				System.out.println("다시 선택해 주세요");
				break;
			}
		}
	}
}
