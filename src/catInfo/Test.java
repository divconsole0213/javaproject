package catInfo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		CatStudent catStudent1 = new CatStudent(17, "윤보배");
        
		catStudent1.addCatSubject("국어", 99);
		catStudent1.addCatSubject("수학", 80);
		catStudent1.showInfo();
		CatStudent catStudent2 = new CatStudent(18, "고보배");
		catStudent2.addCatSubject("국어", 70);
		catStudent2.addCatSubject("수학", 70);
		catStudent2.addCatSubject("영어",62);
		System.out.println("============================");
		catStudent2.showInfo();
	}

}
