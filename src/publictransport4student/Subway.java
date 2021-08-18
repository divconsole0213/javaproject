package publictransport4student;

public class Subway {
	int money;
	int passengerNum;
	String line;
	
	public Subway(String line) {
		this.line = line;
	}
	public void take(int money) {
		this.money += 1200;
		passengerNum++;
	}
 public void showInfo() {
	 System.out.println(line + "의 승객수는\s" + passengerNum +"명이고 수입은\s" + money+"원입니다." );
 }
}
