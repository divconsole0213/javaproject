package car;

public class ManualCar extends Car {

	@Override
	public void drive() {
System.out.println("운전중입니다.");
		
	}

	@Override
	public void stop() {
	System.out.println("운전을 멈춥니다.ㄴ");
		
	}

	@Override
	public void wipe() {
		System.out.println("창문을 닦습니다.");
		
	}

}
