package gameplayer;



public class Player {
	
private PlayerLevel Level;




public Player() {
	Level = new Beginner();
	Level.showlevelmessage();
}

public PlayerLevel getLevel(){
	return Level;
	
};
 

 public void playerUpGradeLevel(PlayerLevel Level) {
	 this.Level = Level;
	 Level.showlevelmessage();
 }
 
 public void play(int count) {
	 Level.go(count);
 }

//	public void ArrayListplayerlevel(ArrayList<String>playerlevel){
//		playerlevel = new ArrayList<String>();
//		playerlevel.set(0, "Beginner");
//		playerlevel.set(1, "Advanced");
//		playerlevel.set(2, "Super");
//	 
//	}







}
