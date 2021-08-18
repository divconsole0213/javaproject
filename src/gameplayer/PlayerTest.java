package gameplayer;

import java.util.ArrayList;

public class PlayerTest {

	public static void main(String[] args) {

Player player1 = new Player();
System.out.println(player1.getLevel());
System.out.println(player1.hashCode());
player1.playerUpGradeLevel(new Advanced());
System.out.println(player1.getLevel());
player1.play(3);
System.out.println(player1.hashCode());

Player player2 = new Player();
player2.playerUpGradeLevel(new Super());
player2.play(4);
System.out.println(player2.hashCode());

	
		
		
	
	}

}
