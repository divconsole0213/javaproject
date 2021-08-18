package library;

public class Library {

	//변수부터
	private static int serialNumber = 00001;

	 String author;
      String title;
	  String genre;
public Library() {//serialNumber를 부르기 위한 메서드
	
}

		public Library(String author, String title, String genre) {
		this.author = author;
		this.title = title;
		this.genre = genre;
	}
	    public static int getSerialNumber() {
		return serialNumber++;
	}

	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

public void showInfo() {
	System.out.println(author+title+genre+getSerialNumber());
}
}
