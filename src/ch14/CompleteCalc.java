package ch14;

public class CompleteCalc extends Calculator {

	@Override
	public int multiplication(int num1, int num2) {
		
		return num1*num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if(num2 == 0) {
			return (int) error;
		}
		return num1/num2;
	}

	

}
