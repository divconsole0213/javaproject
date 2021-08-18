package stringTest;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		String test = buffer.toString();
		System.out.println(test);
		
//	    System.out.println(System.identityHashCode(java));
//		 java = java.concat(android);
//		 System.out.println(java);
//		 System.out.println(System.identityHashCode(java));
	}

}
