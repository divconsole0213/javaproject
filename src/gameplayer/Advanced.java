package gameplayer;



public class  Advanced implements PlayerLevel {

	@Override
	public void run() {
	System.out.println("빠르게 달립니다.");
		
	}




	@Override
	public void jump() {
System.out.println("점프를 합니다.");		
	}
	
	
	
	
	
	
	@Override
	public void turn() {
System.out.println("하실 수 없는 레벨입니다.");		
	}


	@Override
	public void showlevelmessage() {
System.out.println("Your level is Advanced");		
	}












}
