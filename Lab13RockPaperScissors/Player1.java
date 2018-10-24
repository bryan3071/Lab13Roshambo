package Lab13RockPaperScissors;

public class Player1 extends Player {

	String roshamboValue = "Rock";

	public Player1(String roshamboValue) {
		super();
		this.roshamboValue = roshamboValue;
	}
	
	 public Roshambo generateRoshambo()
	    {     
	       return Roshambo.ROCK;    
	    }
	
}
