package bookShelf.copy;

import java.util.ArrayList;

import bookShelf.Shelf;

public class shelfTest {

	public static void main(String[] args) {


//	    BookShelf1 bookShelf = new BookShelf1();
//		BookShelf1 bookShelf2 = new BookShelf1();
//		BookShelf1 bookShelf3 = new BookShelf1();
//		BookShelf1 bookShelf4 = new BookShelf1();
//	   bookShelf.ArrayListShelf("romance", 1, "bobae", 1);
//	   bookShelf2.ArrayListShelf("comedy", 2, "hyunsuck", 1);
//	   bookShelf3.ArrayListShelf("comedy", 3, "hyunsuck", 1);
//	   bookShelf4.ArrayListShelf("comedy", 4, "hyunsuck", 1);
	  BookShelf1 book1 = new BookShelf1();
	  book1.bookTitle("bobae");
	 book1.bookTitle("soso");
	 book1.bookTitle("sora"); 
	 book1.bookTitle("sori");
	 book1.bookTitle("sony");
	 System.out.println(book1.getSize());
	 System.out.println(book1.deleteBook());
	 System.out.println(book1.deleteBook());
	 System.out.println(book1.deleteBook());
	 System.out.println(book1.deleteBook());	
        System.out.println(book1.getSize());
        

	
	
	}

}
