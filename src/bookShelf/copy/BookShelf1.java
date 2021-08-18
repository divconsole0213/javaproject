package bookShelf.copy;

import java.util.ArrayList;

public class BookShelf1 extends Shelfffff implements Book1{

	@Override
	public void bookTitle(String bookTitle) {
		
		 shelf.add(bookTitle);
		 }

	@Override
	public int getSize() {
		
		return getCount();
	}

	@Override
	public String deleteBook() {
	
		return shelf.remove(0);
	}

	




 
	





}



