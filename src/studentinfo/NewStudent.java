package studentinfo;

public class NewStudent {

	public static void main(String[] args) {
 StudentInfo studentInfo1 = new StudentInfo();
 studentInfo1.studentNumber = 1;
 studentInfo1.studentName = "고보배";
 studentInfo1.address = "경기도 성남시 수정구";
 studentInfo1.showInfo();
 
 StudentInfo studentInfo2 = new StudentInfo();
 studentInfo2.studentNumber = 2;
 studentInfo2.studentName = "오백년";
 studentInfo2.address = "연희동";
 studentInfo2.showInfo();
 
 System.out.println(studentInfo1);
 System.out.println(studentInfo2);
	}

}
