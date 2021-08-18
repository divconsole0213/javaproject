package publictransport4student;

public class Student {

	 String studentName;
	 int grade;
	int money;
	int fee;
	public Student(String studentName, int grade, int money) {
		
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	
	
	}
	public void fee() {
		
	}

	public void takebus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takesubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void taketaxi(Taxi taxi) {
		taxi.take(fee);
        this.money -= fee;
	}

	public void showInfo() {
		System.out.println(grade+"학년\s"+studentName+"의 잔액은\s" +money + "입니다");
	}



}
