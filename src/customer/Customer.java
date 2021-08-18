package customer;

import java.util.ArrayList;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int pay;
    double bonusPoint;
	double bonusPointRatio;
    ArrayList<Customer>customers;
   
//	public Customer() {
//	  customerGrade = "Silver";
//		bonusPointRatio = 0.01;
//		System.out.println("customer()호출");
//	}
	public Customer() {
		customers = new ArrayList<Customer>();
		}

	public Customer(int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusPointRatio = 0.01;
           

	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
//
//	public double getBonusPoint() {
//		return bonusPoint;
//	}
//
//	public void setBonusPoint(double bonusPoint) {
//		this.bonusPoint = bonusPoint;
//	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade(){
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	

	public double bonusPoint(int pay) {
	
		
			bonusPoint += pay* bonusPointRatio;
		
		return bonusPoint;
		
	}
		
	public void addCustomer(Customer customer) {
		customers = new ArrayList<Customer>();
		customers.add(customer);
		
	}


 public void showInfo() {

  
	 System.out.println(getCustomerID()+"번 고객님의 성함은\s"+getCustomerName()+"이며 적립된 포인트는\s"+bonusPoint(pay)+"입니다");
 }


	
}
