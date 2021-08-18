package bookShelf;

import java.util.ArrayList;


public class Shelf {

	 protected ArrayList<Shelf>shelf = new ArrayList<Shelf>();
	String bookTitle = null;
    String bookGenre = null;
	int count = 0;
	int bookNumber = 0;
	
//	public Shelf() {
//		shelf = new ArrayList<Shelf>();
//	}
//
//	public ArrayList<Shelf> getShelf(){
//		return shelf;
//		
//	}
		
//	public void setShelf(ArrayList<Shelf> shelf) {
//		this.shelf = shelf;
//	}	
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		
		}
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

//	public void addArrayList(Shelf shelf){
//		shelf = new ArrayList<Shelf>();
//        setBookGenre(getBookGenre());
//		setCount(getCount());
//		setShelf(getShelf());
//		shelf.add(shelf);
//	}

	public void bookNumber(int bookNumber) {
		// TODO Auto-generated method stub
		
	}

	
		
	
	
	
}
