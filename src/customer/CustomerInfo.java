package customer;

import java.util.ArrayList;



public class CustomerInfo {

	public static void main(String[] args) {
ArrayList<Customer>customers = new ArrayList<Customer>();
    Customer customer1 = new Customer(1, "yunbobae");
    VIPCustomer customer2 = new VIPCustomer(2, "gobobae", 0101);
    GoldCustomer customer3 = new GoldCustomer(3, "yunham");
    customers.add(customer1);
    customers.add(customer2);
    customers.add(customer3);
    


    int money = 10000;
   for(Customer customer : customers) { 
    double cost =   customer.bonusPoint(money);
   }
       if(customer3 instanceof GoldCustomer) {
    	customer3 = (GoldCustomer)customer3;
    		customer3.showInfo();;
    }
//    System.out.println(customer.getCustomerID()+"번"+customer.getCustomerName()+"고객님이\s"+money+"원지불하셨습니다");
//    System.out.println(customer.getCustomerID()+"번 고객님의 성함은\s" + customer.getCustomerName()+"이며 포인트는\s" + cost+"포인트로 적립되었습니다.");
    }
     
    
    

}

