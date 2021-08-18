package customerplan;

public interface Sell {

	public default void sell(int money) {
		 
		if(money == 0) {
			System.out.println("판매하지 않습니다.");
		}
		else {
			System.out.println("어서오세요 고객님");
		}
		sellUsedThings();
	
	}
	
	default void sellUsedThings() {
		System.out.println("중고물건 판매도 합니다. 둘러보세요.");
	}

	void sell();

}
