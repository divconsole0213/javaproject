package ch14;

public class CalcTest {

	public static void main(String[] args) {
  int num1 = 10;
   int num2 = 20;
   CompleteCalc complete = new CompleteCalc();
  System.out.println(complete.plus(num1, num2));
   System.out.println(complete.minus(num1, num2));
   System.out.println(complete.multiplication(num1, num2));
   System.out.println(complete.devide(num1, num2));
   
 complete.description(); 
int[] arr = {1,2,3,4,5};
System.out.println(Calc.total(arr));
//static method이기 때문에 바로 인스턴스해서 쓸 수 있다

	}

}
