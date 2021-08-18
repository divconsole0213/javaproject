package recodSytem;

public class Student {

	private int studentID;
	private String studentName;
        	String subject;
    private int  subjectRecord;      
    public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSubjectRecord() {
		return subjectRecord;
	}

	public void setSubjectRecord(int subjectRecord) {
		this.subjectRecord = subjectRecord;
	}
	public Student(int studentID, String studentName,String subject, int subjectRecord) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subject = subject;
		this.subjectRecord = subjectRecord;
       
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void showInfo()
	{System.out.println(studentID + studentName + subject +subjectRecord);
}
}