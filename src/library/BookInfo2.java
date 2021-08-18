package library;

public class BookInfo2 {

	public static void main(String[] args) {
Library[]book = new Library[5];

	
book[0] = new Library("gobobae", "cat", "animalbook");

book[1] = new Library("yunbobae", "dog", "animalbook");

book[2] = new Library("dahee", "sm", "fetish");

book[3] = new Library("cheA", "foot", "인체해부학");

book[4] = new Library("mir", "apartment", "건축");

Library[]copybook = new Library[5]; 

copybook[0] = new Library();
copybook[1] = new Library();
copybook[2] = new Library();
copybook[3] = new Library();
copybook[4] = new Library();

for(int i = 0; i < book.length; i++) {
	copybook[i].setAuthor(book[i].getAuthor());
	copybook[i].setTitle(book[i].getTitle());
	copybook[i].setGenre(book[i].getGenre());
}

//for(Library library : book) {
//	System.out.println(book);
//	library.showInfo();
//}
//
//for(Library library : copybook) {
//	System.out.println(copybook);
//	library.showInfo();
//}
book[0].setAuthor("seohynsuck");
book[1].setTitle("death");

for(Library library : book) {
	library.showInfo();
	System.out.println(book);
}
for(Library library : copybook) {
	library.showInfo();
	System.out.println(book);
}
}
	}


