package member;

public class MemberServiceImpl implements MemberService{

	private int count = 0;
	private MemberBean[] memberList = new MemberBean[100];

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public MemberBean[] getMemberList() {
		return memberList;
	}

	public void setMemberList(MemberBean[] memberList) {
		this.memberList = memberList;
	}

	@Override
	public String join(MemberBean member) {
		// 회원가입
		memberList[count] = member;
		count++;
		return member.toString();
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		MemberBean member = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (memberList[i].getUserid().equals(id)) {
				member = memberList[i];
			}
		}
		return member;
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보 검색
		MemberBean[] tempList = new MemberBean[this.searchCountByName(name)];
		int j = 0;

		for (int i = 0; i < this.getCount(); i++) {
			if (memberList[i].getName().equals(name)) {
				System.out.println("얌마 " + memberList[i].getUserid());
				tempList[j] = memberList[i];
				j++;
			}
		}
		return tempList;
	}

	@Override
	public String remove(String userid) {
		// 회원 탈퇴
		
		MemberBean tempMember = null;
		String result = "";
		
		if(this.searchById(userid) != null){
			for (int i = 0; i < this.getCount(); i++) {				
				if (memberList[i].getUserid().equals(userid)) {
					tempMember = memberList[i];
					memberList[i] = memberList[this.getCount()-1];
					memberList[this.getCount()-1] = null;
				}			
			}	
			this.setCount(this.getCount()-1);
			result = tempMember.getUserid() + "삭제 성공";
		}else
			result = "해당 아이디가 없음";
			
		return result;
	}

	@Override
	public int countAll() {
		// 전체 회원 수 조회
		return this.getCount();
	}

	@Override
	public int searchCountByName(String name) {
		// 이름으로 가입된 아이디 검색
		int tempCount = 0;

		for (int i = 0; i < this.getCount(); i++) {
			if (memberList[i].getName().equals(name)) {
				tempCount++;
			}
		}

		return tempCount;
	}

	@Override
	public String login(String id, String password) {
		// 로그인
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// 정보수정
		return null;
	}

}
