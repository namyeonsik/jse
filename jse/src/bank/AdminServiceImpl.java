package bank;

public class AdminServiceImpl implements AdminService {

	// 멤변이 모여 있는 이 곳은 필드
	private int count = 0; // 멤버변수이지만 초기값이 필요한 경우에는 줄 수 있다
	private AccountBean[] accountList = new AccountBean[100];

	// 메소드 에어리어
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public AccountBean[] getAcbean() {
		return accountList;
	}

	public void setAcbean(AccountBean[] acbeanList) {
		this.accountList = acbeanList;
	}
	@Override
	public String open(String name, int password) {
		// 1. 통장개설
		// account 인스턴스를 필드에 선언하면
		// 나중에 추가되는 값을 오버라이딩 하게 된다.
		// 추가되는 개념으로 코딩하려면 지역벼수로 처리하고
		// 자료구조(컬렉션)를 필드에 선언해야 한다.

		AccountBean account = new AccountBean();
		account.setName(name);
		account.setPassword(password);
		accountList[count] = account;
		count++;
		return account.toString();
	}

	@Override
	public int countAll() {
		// 1. 전체 계좌 수 조회
		return this.getCount();
	}

	@Override
	public AccountBean searchAccountByAccountNo(int accountNo) {
		// 2. 계좌번호로 해당 계좌 정보 조회
		AccountBean account = null;	
		// 이 라인에서 account는 인스턴스 개념이 아니라
		// 리턴을받는 타입
		
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				account = accountList[i];
			}
		}
		return account;
	}

	@Override
	public AccountBean[] searchAccountByName(String name) {
		// 3. 이름으로 계좌 정보 조회
		AccountBean[] tempList = new AccountBean[this.searchCountByName(name)];
		int j=0;
	
		for (int i = 0; i < this.getCount(); i++) {
			if(accountList[i].getName().equals(name)){
				tempList[j] = accountList[i];
				j++;
			}
		}
		return tempList;
	}

	@Override
	public String closeAccount(int accountNo) {
		// 4. 계좌 삭제
		AccountBean tempAccount = null;
		String result = "";
		
		if(this.searchAccountByAccountNo(accountNo) != null){
			for (int i = 0; i < this.getCount(); i++) {				
				if (accountList[i].getAccountNo() == accountNo) {
					tempAccount = accountList[i];
					accountList[i] = accountList[this.getCount()-1];
					accountList[this.getCount()-1] = null;
				}			
			}	
			this.setCount(this.getCount()-1);
			result = "[" + tempAccount.getAccountNo() + "] 계좌 삭제 성공";
		}else
			result = "해당 계좌가 없음";
			
		return result;
	}

	@Override
	public int searchCountByName(String name) {
		// 5. 이름으로 계좌 수 조회 (3번 기능 수행하기 위해 필요한 메소드)
		int tempCount = 0;
		
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getName().equals(name)) {
				tempCount++;
			}
		}
		
		return tempCount;
	}

}
