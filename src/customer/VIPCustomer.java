package customer;



public class VIPCustomer extends Customer {
//세일 10%
//적립 0.5%
//private agent가 있음
	
	
	private int agentID;
	protected double salePoint;
	
	public VIPCustomer() {
		
	}
	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID,customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		 bonusPointRatio = 0.05;
		 salePoint = 0.1;
	}

	
//	public VIPCustomer(int customerID, String customerName, int pay) {
//	 super(customerID, customerName, pay);
//	 customerGrade = "VIP";
//	 bonusPointRatio = 0.05;
//	 salePoint = 0.1;
//	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
//	public double salePay(double salePay) {
//		salePay = pay - (pay*salePoint);
//		return salePay;
//		
//	}
	@Override
	public double bonusPoint(int pay) {
	
		bonusPoint +=pay * bonusPointRatio;
	 pay -=(int)(pay*salePoint);
		return bonusPoint;
	}
	public void saleshowInfo() {
		System.out.println(customerID + "번\s"+customerName+"님의 계산하실 금액은\s"+pay+"입니다");
	}
}