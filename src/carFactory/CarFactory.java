package carFactory;

public class CarFactory {

private static int serialNum = 10001;
private static CarFactory instance; // private한 정적 클래스의 instance 변수



	public  static  int getSerialNum() {
	return serialNum++;
}



public static CarFactory getInstance() {
	return instance;
}

	public static CarFactory instance() {
		//private을 바깥에서 검색하기 위한 public 
		//void는 바꿀수 없으므로! 
		if(instance == null) {
			instance = new CarFactory();
	}
		return instance;
	}


}
