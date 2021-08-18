package customerplan;

public interface Buy {
   public default void buy(int cost, int sellPay, String card) {
  
	 if(cost == sellPay) {System.out.println("소비자가 구입합니다");
	  }
	  if(card == "secret") {
		 secretBuy();
	 }
	 else {
		 System.out.println("금액이 맞지않습니다");
	 }
	 return;
   }
   private void secretBuy() {
	   System.out.println("비밀 판매");
   }

   
   
   
}
