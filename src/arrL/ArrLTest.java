package arrL;

import java.util.ArrayList;

public class ArrLTest {

	public static void main(String[] args) {
	
ArrayList<ArrDemo> arr = new ArrayList<ArrDemo>();
arr.add(new ArrDemo(1, "bobae", "cat", 1));
System.out.println(arr);
arr.remove(0);
System.out.println(arr);
	}

}
