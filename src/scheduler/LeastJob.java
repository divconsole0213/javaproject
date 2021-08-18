package scheduler;

import java.io.IOException;

public  class LeastJob implements Scheduler {

	@Override
	public void getNextCall(int ch)throws IOException  {
		if( ch =='L' || ch =='l') {
			
		}
		return;
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원에게 배정되었습니다.");
		Scheduler.super.sendCallToAgent();
	}

	





}
