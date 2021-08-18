package gameplayer;

public  class Super  implements PlayerLevel{

	@Override
	public void run() {
      System.out.println("빠르게 달립니다.");		
	}


	@Override
	public void jump() {
System.out.println("높이 점프를 합니다.");		
	}
	
	
	
	
	
	@Override
	public void turn() {
System.out.println("턴을 합니다.");		
	}



	@Override
	public void showlevelmessage() {
   System.out.println("your level is Super.");
	}








	
}
