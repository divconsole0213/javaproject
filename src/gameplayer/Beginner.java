package gameplayer;

public  class Beginner implements PlayerLevel{

	



	@Override
	public void run() {
		System.out.println("달립니다.");
		
	}
	
	@Override
	public void jump() {
       System.out.println("하실 수 없는 레벨입니다.");		
	}
	
	@Override
	public void turn() {
       System.out.println("하실 수 없는 레벨입니다.");		
	}


	@Override
	public void showlevelmessage() {
 System.out.println("Your level is Begginer");		
	}

	


  






}
