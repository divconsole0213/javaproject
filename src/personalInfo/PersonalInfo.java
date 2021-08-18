package personalInfo;

public class PersonalInfo {
	public String name;
	public int age;
	public String sex;
	public int stature;
	public int weight;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getStature() {
		return stature;
	}
	public void setStature(int stature) {
		this.stature = stature;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public PersonalInfo(String name, int age, String sex, int stature, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.stature = stature;
		this.weight = weight;
	}
	
	public String toString() {
		return name;
	}
	public String showInfo() {
		return "이름 : " + name +"\n나이 : "+age+"\n성별 : "+sex+"\n키 : "+stature+"cm\n몸무게 : "+weight+"kg";
	}
	
}
