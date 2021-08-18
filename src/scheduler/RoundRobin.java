package scheduler;

import java.io.IOException;

public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall(int ch) throws IOException {
       if(ch == 'R' || ch == 'r') {
    	  
       }
		Scheduler.super.getNextCall(ch);
	}

	@Override
	public void sendCallToAgent() {
		 System.out.println("한명씩 차례대로 배정받을 예정입니다.");
		Scheduler.super.sendCallToAgent();
	}

	
	
}
