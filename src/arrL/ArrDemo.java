package arrL;

import java.util.ArrayList;

public class ArrDemo {

	


	int bookNum;
	String bookTitle;
	String bookGenre;
	int shelfNum;
ArrayList<ArrDemo>arrDemos = new ArrayList<ArrDemo>();


	public ArrDemo(int bookNum, String bookTitle, String bookGenre, int shelfNum) {
	super();
	this.bookNum = bookNum;
	this.bookTitle = bookTitle;
	this.bookGenre = bookGenre;
	this.shelfNum = shelfNum;
	arrDemos = new ArrayList<ArrDemo>();
}


	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getShelfNum() {
		return shelfNum;
	}

	public void setShelfNum(int shelfNum) {
		this.shelfNum = shelfNum;
	}



	
	public void showInfo() {
		System.out.println(getBookGenre()+getBookNum()+getBookTitle()+getShelfNum());
	}
}
