package studentinfo;

public class StudentInfo {
  
	public int studentNumber;
    public String studentName;
	public String address;
	
		public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void showInfo() {
		System.out.println(studentNumber + "번 학생의 이름은\s" + studentName + "이고 주소는\s" + address + "입니다.");
	}
}
