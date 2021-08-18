package twoLoofarray;


public class Test {

	public static void main(String[] args) {

		int[][]arr = {{1,2,3},{1,2}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length;j++) {
				System.out.println(arr[i][j]+",");
			}
			System.out.println("\t,"+arr[i].length);
		}
		System.out.println();
	
	
	int[][]arr2 = new int[1][2];
for(int a = 0; a < arr2.length; a++) {
	for(int b = 0; b < arr2.length; b++) {
		System.out.println(arr2[a][b]);
	}
	System.out.println("\t,"+arr2[a].length);
}
System.out.println();
}
}
