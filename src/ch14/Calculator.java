package ch14;

public abstract class Calculator implements Calc {



	@Override
	public int plus(int num1, int num2) {
		
		return num1+ num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num2 - num1 ;
	}

	

}