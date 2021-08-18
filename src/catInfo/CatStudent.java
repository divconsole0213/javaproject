package catInfo;

import java.util.ArrayList;

public class CatStudent {
	
private int catStudentID;

	private String catStudentName;
	ArrayList<CatSubject>catsub;
	
	public CatStudent ( int catStudentID , String catStudentName) {
		this.catStudentID = catStudentID;
	    this.catStudentName = catStudentName;
        catsub = new ArrayList<CatSubject>();
	}

		public int getCatStudentID() {
	return catStudentID;
}



public void setCatStudentID(int catStudentID) {
	this.catStudentID = catStudentID;
}



public String getCatStudentName() {
	return catStudentName;
}



public void setCatStudentName(String catStudentName) {
	this.catStudentName = catStudentName;
}

	
public void addCatSubject(String subjectName, int subjectScore) {
CatSubject catSubject = new CatSubject();
catSubject.setSubjectName(subjectName);
catSubject.setSubjectScore(subjectScore);
catsub.add(catSubject);
}

public void showInfo() {
	int sum = 0;
	for(CatSubject catSubject : catsub) {
	sum += catSubject.getSubjectScore();
	System.out.println(catStudentID+"번 학생의 이름은 \s" + catStudentName+"이고 수강과목은 /s"+catSubject.getSubjectName()+"이고 점수는 : " + catSubject.getSubjectScore() + "입니다");
	}
    System.out.println("총점은 : " + sum + "입니다");
}
	
}