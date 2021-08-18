package customerplan;

public class CustomerTest {

	public static void main(String[] args) {
	 Customer customer1 = new Customer();
	 Customer customer2 = new Customer();
	  customer1.sell(10000);
     Buy buy = new Buy() {
      
	};
	Sell sell = new Sell() {
		
		@Override
		public void sell() {
			// TODO Auto-generated method stub
			
		}
	};
	customer2.buy(10000, 10000, "secret");
	
     sell.sell(0);
     sell.sellUsedThings();
     customer1.sellUsedThings();
     customer1.buy(0, 0, null);
	}

}
