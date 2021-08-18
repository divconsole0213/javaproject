package customer;

public class GoldCustomer extends  Customer {

	private double salePoint;
//	 public GoldCustomer() {
//		 customerGrade = "Gold";
//		 bonusPointRatio = 0.02;
//		 salePoint = 0.1;
	
//	 }
	public GoldCustomer() {
		
	}
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "Gold";
		 bonusPointRatio = 0.02;
		  salePoint = 0.1;
		
	}

	

	@Override
	public double bonusPoint(int pay) {
			
		bonusPoint += pay*bonusPointRatio;
		
		pay -= (int)(pay*salePoint);

		return bonusPoint;
	}
	public void sale2showInfo() {
		System.out.println(customerID + "번\s"+customerName+"님의 계산하실 금액은\s"+pay+"입니다");
	}
	
	 
}
