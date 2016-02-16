package oop;

public class KaupServiceImpl implements KaupService {
	// 접근제한자 + 리턴타입 + 메소드명 + 메소드연산자 + 블록
	@Override
	public String getState(double height, double weight) {
		// 메소드 연산자 내부에 선언된 변수는 본질적으로 지역변수이고, 매개변수 parameter 라고 부른다.
		
		String state = "";
		int index = (int) ((weight / (height * height)) * 10000);
		
		if (index > 30) {
			state = "비만";
		} else if (index > 24) {
			state = "과체중";
		} else if (index > 20) {
			state = "정상";
		} else if (index > 15) {
			state = "저체중";
		} else if (index > 13) {
			state = "마름";
		} else if (index > 10) {
			state = "영양실조";
		} else {
			state = "소모증";
		}
		return state;
	}

}
