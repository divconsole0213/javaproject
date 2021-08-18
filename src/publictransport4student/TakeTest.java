package publictransport4student;

public class TakeTest {
	

	public static void main(String[] args) {
Student student1 = new Student("고보배", 3, 1000);
Student student2 = new Student("윤보배", 2, 30000);
Student student3 = new Student("윤혜림", 5, 20000);

Bus bus352 = new Bus(352);
Bus bus9302 = new Bus(9302);
Subway subway = new Subway("green");
Taxi kakao = new Taxi("kakao");
student3.taketaxi(kakao);
kakao.setFee(10000);
student1.takebus(bus352);
student1.takebus(bus9302);
student2.takesubway(subway);
student1.showInfo();
student2.showInfo();
student3.showInfo();
bus352.showInfo(); // showBusInfo <= 안먹음 왜인지는 나도 몰라 시발 
subway.showInfo();
kakao.showInfo();

//0일때 잔액이 부족합니다가 뜨고 break가 걸려야 한다
	}

}

