package subject;

public class StudentInfo {

	public String studentName;
	public int studentNum;
	SubjectInfo subjectName;
	SubjectInfo korea;
	SubjectInfo english;
	int subjectScore1;
	int subjectScore2;
	
	public StudentInfo(String studentName, int studentNum) {
		
		this.studentName = studentName;
		this.studentNum = studentNum;
		
		
	}
	
 public void setkorea(int sujectScore1) {
 this.subjectScore1 = sujectScore1;
	
}
 public void setenglish(int subjectScore2) {
	 this.subjectScore2 = subjectScore2;
 }

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
public SubjectInfo getKorea() {
		return korea;
	}

	public SubjectInfo getEnglish() {
		return english;
	}

	public int getSubjectScore1() {
		return subjectScore1;
	}
	public int getSubjectScore2() {
		return subjectScore2;
	}
	public String  showInfo() {
		return studentNum + "학번 학생의 이름 : " + studentName + "\n 한국어 점수 : " + subjectScore1+"\n영어 점수 : " + subjectScore2;
	}

	//이 코드의 단점 과목수를 늘릴때 일일이 만들어야 한다. arrayList<>를 잘 배워보자
	
	}
	
	

