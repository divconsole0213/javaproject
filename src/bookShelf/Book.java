package bookShelf;

public interface Book {
	
  
	
	public void bookTitle();
	default void bookNum() {
		
	}
	
	default void bookGenre() {
		
		bookTitle();
	
	}
}
