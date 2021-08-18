package car;

public abstract class Car {

	
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
    public void startCar(){
    		System.out.println("시동을 켭니다");
    	}
    public void turnOff() {
    	System.out.println("시동을 끕니다");
    }
    public void wash() {
    
    }
  
	public final void run() {
		startCar();
		drive();
		wipe();
		stop();
		wash();
		turnOff();
	}
}
