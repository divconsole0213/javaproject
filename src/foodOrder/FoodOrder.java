package foodOrder;

public class FoodOrder {

	public long registrationNumber;
	public String address;
	public int date;
	public int time;
	public int price;
	public int menuNum;
	

	public FoodOrder(long registrationNumber, String address, int date, int time, int price, int menuNum) {
		
		this.registrationNumber = registrationNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}

	@Override
	public String toString() {
		
		return "접수번호 : " + registrationNumber +"\n주문주소 : " + address+ 
				"\n주문날짜 : " + date + "\n주문시간 : " + time + "\n가격 : "+
				price + "\n메뉴번호 : " + menuNum;
	}
	
}
