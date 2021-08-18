package publictransport4student;

public class Taxi {
    String company;
	  int fee;
	public String getCompany() {
		return company;
	}
	public int getFee() {
		return fee;
	}  public void setCompany(String company) {
		this.company = company;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Taxi(String company) {
		  this.company  = company;
	  }
	  public void take(int fee) {
		  this.fee += fee;
	  }
	  public void showInfo() {
		  System.out.println( company + "의 수입은\s" + fee + "입니다.");
	  }
}
