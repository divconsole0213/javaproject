package scheduler;

import java.io.IOException;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall(int ch) throws IOException {
		if(ch == 'P' || ch == 'p') {
		
		}
		
	}

	@Override
	public void sendCallToAgent() {
	System.out.println("우선순위가 높은 고객우선 숙련도 높은 상담원에게 배정되었습니다.");
		Scheduler.super.sendCallToAgent();
	}

	
}
