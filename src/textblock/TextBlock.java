package textblock;

public class TextBlock {

	public static void main(String[] args) {
 String textBlock = """
 		Hello,
 		Hi,
 		하이
 		""";
 
 System.out.println(textBlock);
 System.out.println(getBlockOfHtml()
		 );

}
	
	public static String getBlockOfHtml() {
		return"""
				<html>
				<body>
				<span>example text</span>
				</body>
				</html>
				""";
	}
}