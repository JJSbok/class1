package privateInformationHiding;

public class BirthDay {

	private int day;
	private int month; // main에서 수정할 수 없도록 private로 쓸데없는 것을 막아줌
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day= day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month>12)
		{
			isValid = false;
		}else {
		isValid = true;
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년" + month +"월" +day + "일 입니다.");
			
		}else {
			System.out.println("맞지않은 날이다잉");
		}
	}
}
