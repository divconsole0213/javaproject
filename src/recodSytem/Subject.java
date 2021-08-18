package recodSytem;

public class Subject {

	 String subject;
	 int subjectRecord;
	
	public Subject() {
			}
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
	public void showInfo() {
		System.out.println(subject);
	}
	
}
