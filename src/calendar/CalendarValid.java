package calendar;

public class CalendarValid {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
		 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			 if(1 > day || day >31) {
				 isValid = false; 
			 }
			 break;
		 case 4: case 6: case 9: case 11:
			 if(1 > day ||  day > 30) {
				 isValid = false;
				}
			 break;
		 case 2:
			 if(year %4 == 0 && year %4 == 0 ) {
				if( 1 > day || 30 >= day) {
					isValid = false;
				}
				else {
					if(1 > day || 28 > day) {
						isValid = false;
					}
					}
			 }
			 break;
			 default :
				 isValid = false;
		}
		
		this.day = day;
		
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>=13) {
			isValid = false;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <= 0) {
			isValid = false;
		}
		this.year = year;
	}
	
	public CalendarValid(int year, int month, int day ) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	

	
	public void showInfo() {
	 if(isValid) {
      System.out.println(year+"."+month+"."+day+".");
	 }
	 else {
		 System.out.println("유효하지 않은 날짜입니다");
	 }
	}


}