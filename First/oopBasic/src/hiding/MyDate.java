package hiding;

public class MyDate {

	public int day;
	public int month;
	public int year;
	
	private boolean isValid;
	
//	int day;
//	int month;
//	int year;
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			isValid = true;
		}
		
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	
}
