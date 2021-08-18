package bookShelf;

import java.util.ArrayList;

public class BookShelf extends Shelf implements Book{


  
	@Override
	
	public void bookTitle() {
	  
	
		setBookTitle(bookTitle);
		
	}

	
	@Override
	public void bookNum() {	
		
	
	}
	public void bookGenre() {

	setBookGenre(bookGenre);
	
	}

	



	@Override
	public void setCount(int bookNumber) {
      for(int i = 0; i < bookNumber; i++ ) {
    	  if( i %100 == 0) {
    		  count = bookNumber/100;
    	  }
      }
		super.setCount(count);
	}


	@Override
	public void setBookNumber(int bookNumber) {
	    
	
		super.setBookNumber(bookNumber);
	}


	public void showInfo() {
//		bookTitle();
//		bookNum();
//		bookGenre();
		
		System.out.println(getCount()+"번 진열대의\s"+getBookNumber()+"번 책의 제목은\s"+getBookTitle()+"이고 장르는\s"+getBookGenre()+"입니다.");
		
	}



	
	
//	@Override
//	public void setCount(int count) {
//		bookNumber();

//		count = 1;
//		for( int i = 0; i > 100000; ) {
//			setBookNumber(i);	
//			if(bookNumber > 100000) {
//			    System.out.println("없는 책입니다.");
//				if(bookNumber %100 == 0) {
//					setCount(count++);
//				}
//		}
//			
//	
//	}
//	return;
//}
	

 
 
	





}



