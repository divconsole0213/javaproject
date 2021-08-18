package publictransport4student;

public class Bus {

  
int busNum;
 int passengerNum;
 int money;
  public int getBusNum() {
		return busNum;
	}

	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}

	public int getPassengerNum() {
		return passengerNum;
	}

	public void setPassengerNum(int passengerNum) {
		this.passengerNum = passengerNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
  public Bus(int busNum) {
	  this.busNum = busNum;
  }

  public void take (int money) {
	  this.money += money;
	  passengerNum++;
  }
  public void showInfo() {
	 System.out.println(busNum + "의 승객수는\s"+passengerNum+"명이고 수입은\s" + money +"원입니다");  
  }



}

