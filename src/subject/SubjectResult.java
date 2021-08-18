package subject;

public class SubjectResult {

	public static void main(String[] args) {
		
		
StudentInfo student1 = new StudentInfo("고보배", 20);
student1.setkorea(100);
student1.setenglish(40);
System.out.println(student1.showInfo());
StudentInfo student2 = new StudentInfo("정미르", 21);
student2.setkorea(70);
student2.setenglish(80);
System.out.println(student2.showInfo());


	}

}
