package ch14;

public interface Calc {
	double pi = 3.14;
	double error = 9.9999999999; 
	public int multiplication(int num1, int num2);
    public int plus(int num1, int num2);
	public int minus(int num1, int num2);
	public int devide(int num1, int num2);
	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	    myMethod();
	   
	}
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		} 
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("myMethod");
	}
	private static void myStaticMethod() {
		System.out.println("MyStaticMethod");
	}//static은 static끼리 호출이 되나봄
	
}

