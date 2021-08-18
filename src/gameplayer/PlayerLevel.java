package gameplayer;

public interface PlayerLevel {

	
    public  void run();
    public  void jump();
    public void turn();
    public  void showlevelmessage();
    default void go(int count) {
	  run();
	  for(int i = 0; i < count; i++) {
		  jump();
	  }
	  turn();
  }

}