package recodSytem;

import java.util.ArrayList;


public class RecordSys {

	public static void main(String[] args) {
		ArrayList<Student>student1 = new ArrayList<>();
		student1.add(new Student(11, "gobobae", "국어", 100));
        student1.add(new Student(11, "gobobae", "수학", 80));
    	ArrayList<Student>student2= new ArrayList<>();
        student2.add(new Student(12, "yunbobae", "국어", 80));
        student2.add(new Student(12, "yunbobae", "영어", 75));
        student2.add(new Student(12, "yunbobae", "수학", 60));
    	int sum = 0 ;
    	int avg = 0;
	   for(int i = 0; i < student1.size(); i++) {
		 student1.get(i).showInfo();
	   }
	   for(Student student : student1) {
        sum += student.getSubjectRecord();
        avg = sum /student1.size();
	}
	   System.out.println(sum);
       System.out.println(avg);
       System.out.println("==========================");
       int sum2 = 0;
       int avg2 = 0;
       for(int j = 0; j < student2.size(); j++) {
    	   student2.get(j).showInfo();
       }
       for(Student student : student2) {
    	   sum2 += student.getSubjectRecord();
    	   avg2 = sum2/student2.size();
       }
       System.out.println(sum2);
       System.out.println(avg2);
}
}