package bookShelf.copy;

public interface Book1 {
	
  
	
	
	default int bookNum() {
		return 0;
		
	}
	
	default void bookGenre() {
		
		bookTitle(null);
	
	}
	int getSize();
 public String deleteBook();
void bookTitle(String bookTitle);
}
