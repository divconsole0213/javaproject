package scheduler;

import java.io.IOException;

public interface Scheduler {

	default void getNextCall(int ch) throws IOException {
     while(ch == 0) {
    	 ch = System.in.read();
    	 sendCallToAgent();
     }
	};
	default void sendCallToAgent() {
		
	};
	
}
