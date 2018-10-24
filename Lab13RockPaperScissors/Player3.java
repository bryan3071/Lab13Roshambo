package Lab13RockPaperScissors;
import java.util.Scanner;

public class Player3 extends Player {

	private static Scanner scnr;
	

@Override
public Roshambo generateRoshambo() {
    scnr = new Scanner(System.in);
    String userInput = Validator.getString(scnr, "Rock, Paper, or Scissors? ");

    switch (userInput) {
    case "ROCK":
        return Roshambo.ROCK;

    case "PAPER":
        return Roshambo.PAPER;

    case "SCISSORS":
        return Roshambo.SCISSORS;

    default:
        return null;

}

}
}


