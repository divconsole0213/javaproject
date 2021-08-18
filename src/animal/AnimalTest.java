package animal;

import java.util.ArrayList;

 class Animal {
 


	public void walk() {
		System.out.println("네발로 기어다닙니다");
	}
}
	
	 class Human extends Animal {

		@Override
		public void walk() {
			System.out.println("두발로 걸어다닙니다");
		}
		public void read()
		{		System.out.println("사람만이 책을 읽을 수 있습니다");
		
		}
		
	}
		
	 class Cheetar extends Animal{
   
		@Override
		public void walk() {
			System.out.println("네발로 기어다닙니다");
		}
		public void hunting() {
			System.out.println("치타는 초식동물을 잡아먹습니다");
		}
		
    		
	}
    class Eagle extends Animal{

		
		@Override
		public void walk() {
			System.out.println("날아다닙니다");
		}
		
		public void flying() {
			System.out.println("다른 포유류동물들과 달리 하늘을 날 수 있습니다");
		}
	}
//class와 publiclClass의 차이점
//class:    사물과 특성의 집중
//public : 외부 접근자
//파일명 때문에 한 파일 안에 하나만 쓰일 수 있다.
    public class AnimalTest{
		
	
	public static void main(String[] args) {

  
Animal hanimal = new Human();
Animal canimal = new Cheetar();
Animal eanimal = new Eagle();


	ArrayList<Animal>animalList = new ArrayList<Animal>();
animalList.add(hanimal);
animalList.add(canimal);
animalList.add(eanimal);

//for(Animal animal : animalList) {
//	animal.walk();
//}

AnimalTest animalTest = new AnimalTest();
animalTest.downCastingAnimal(animalList);
   }
	public void walkAnimal(Animal animal) {
		animal.walk();
	}//Animal클래스에서 불러옴 
	
	public void downCastingAnimal(ArrayList<Animal>animalList) {
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
	            Human human = new Human();			
					human.read();
				}
			else if (animal instanceof Cheetar) {
				Cheetar cheetar = new Cheetar();
			     cheetar.hunting();	
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = new Eagle();
				eagle.flying();
				
					
			}
			else {
				System.out.println("untype");
			}
			
		}
	}
	
}