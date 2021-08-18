package car;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행차가 운전중입니다.");
		
	}

	@Override
	public void stop() {
	 System.out.println("자율주행차가 운전을 멈췄습니다.");
		
	}

	@Override
	public void wipe() {
		System.out.println("자율주행차가 창문을 닦습니다.");
		
	}

	@Override
	public void wash() {
		
		super.wash();
		System.out.println("자율주행차가 세차를 시작합니다.");
	}

	
}
