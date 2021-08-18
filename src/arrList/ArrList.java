package arrList;


import java.util.ArrayList;

import library.Library;

public class ArrList {


	public static void main(String[] args) {

		ArrayList<Library> library = new ArrayList<>();
        library.add(new Library("GoMinjung","CatTower","Cat"));
        library.add(new Library("GoYunjung","DogGum","dog"));
        library.add(new Library("kimHeejin","Milkis","Cat"));
        for(int i = 0; i < library.size(); i++) {
        	library.get(i).showInfo();
        	
        }
}

}
