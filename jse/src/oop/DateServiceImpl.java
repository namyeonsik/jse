package oop;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndDayOfMonth(int month) {
		String state = "";
		
		switch (month) {
		case 1:case 3:case 5: case 7: case 8: case 10: case 12: state = "31일";break;
		case 4:case 6: case 9: case 11: state = "30일";break;
		case 2: state = "29일";break;

		default:break;
		}
		return state;
	}

}
