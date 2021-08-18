package customerplan;

public class Customer implements Sell, Buy{

	
public Customer() {
	
}
	



	@Override
public void buy(int cost, int sellPay, String card) {
	// TODO Auto-generated method stub
	Buy.super.buy(cost, sellPay, card);
}




	@Override
	public void sellUsedThings() {
		
		Sell.super.sellUsedThings();
	}
	@Override
	public void sell(int money) {
		// TODO Auto-generated method stub
		Sell.super.sell(money);
	}




	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}



	


	
	

}
