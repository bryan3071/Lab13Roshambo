package Lab13RockPaperScissors;
import java.util.Scanner;
public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Looking to set the stage to let the user choose who to play and if to keep playing
		Scanner scnr = new Scanner (System.in);
		String chooseKeepPlaying = "yes";
		String playerName = null;
		String roshamboValue;
		
		//Player1 = new Player1();
		//Player2 = new Player2();
		
		System.out.println("Welcome to the game of Rock Paper Scissors");
		

		System.out.println("Make a selection of Rock or Paper or Scissors");
		
		roshamboValue = scnr.next();
		
		//System.out.println(roshamboValue);
		
	}

}
