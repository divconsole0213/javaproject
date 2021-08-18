package catHospital;

public class CatInfo {

	public int catNumber;
	public String catName;
	public String catKind;
	public int catAge;
	//private String catDisease;
	public int getCatNumber() {
		return catNumber;
	}

	public void setCatNumber(int catNumber) {
		this.catNumber = catNumber;
	}

	public String getCatName() {
		return catName;
	}
    public String getCatKind() {
    	return catKind;
    }
    public void setCatKind(String catKind) {
    	this.catKind = catKind;
    }
	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatAge() {
		return catAge;
	}
	

	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	public CatInfo() {
		//인스턴스 생성자 받기위해서 받음
	}
    public CatInfo(int catNumber, String catName, String catKind, int catAge) {
    	this.catNumber = catNumber;
    	this.catName = catName;
    	this.catKind = catKind;
    	this.catAge = catAge;
    	//넘어온 정보를 갖고 초기화 하기 위해
    }
    public String showInfo() {
    	return catNumber + "번 고양이는 이름이\s" + catName + "이고 품종은 \s" + catKind + "이며 나이는\s" + catAge + "입니다";
    }
}
