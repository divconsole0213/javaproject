package carFactory;

public class CarFactoryTest {

	public static void main(String[] args) {
CarFactory car1 = CarFactory.getInstance();
CarFactory car2 = CarFactory.getInstance();
System.out.println(car1.getSerialNum());
System.out.println(car2.getSerialNum());
System.out.println(car1.instance());
System.out.println(car2.instance());

	}

}
