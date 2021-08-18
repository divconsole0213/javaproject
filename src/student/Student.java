package student;

public class Student implements Cloneable{

	private int studentNum;
	private String studentName;
	
	public Student(int StudentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String toString() {
		return studentNum +"," + studentName;
	}
	@Override
	public int hashCode() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
	      Student student = (Student)obj;
					if(this.studentNum == student.studentNum) {
						return true;}
						else {
							return false;
						}
}
		
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
