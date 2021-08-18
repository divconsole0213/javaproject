package arrayGo;

public class ArrayInt {

	public static void main(String[] args) {

		int[]arr = new int[10];

int total = 0;
//for(int num = 1; num < arr.length; num++)
//{
//	System.out.println(num);
//	total += num;
//}	

for(int i = 0; i < arr.length;i++) {
	int num = 1;
  arr[i]=num++;
 
  }
 for(int num: arr) {
	 System.out.println(num);
 }
  }
 
  }
   


	
