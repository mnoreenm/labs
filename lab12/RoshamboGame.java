package lab12;

import java.util.Scanner;

public class RoshamboGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors! ");
		System.out.println("Please enter your name: ");
		String name = sc.next();
		Roshambo userChoice2 = null;
		Roshambo opponentChoice;
		String choice3 = "y";
		// String choice3 = sc.next();
		System.out.println("Let's get started " + name);

		System.out.println("Would you like to play against 'Random' or 'Rock'?: ");
		String choice = sc.next();

		// choose player now
		Player opponent; // type is player so any kind of player -polymorphism
		switch (choice) {
		case "random":
			opponent = new RandomPlayer("Random");
			opponentChoice = opponent.generateRoshambo();
			break;
		case "rock":
			opponent = new RandomPlayer("Rock");
			opponentChoice = opponent.generateRoshambo();
			break;
		default:
			throw new IllegalArgumentException("Must type 'random' or 'rock'");
		}
		int draw=0,win=0,loose=0;
		while (choice3.equalsIgnoreCase("y")){
		System.out.println("Rock,Paper or Scissors?(R/P/S): ");
		//String ch = "Y";
		String userChoice = sc.next();
		
			if (userChoice.equalsIgnoreCase("r")) {
				System.out.println(name + ": Rock");
				userChoice2 = Roshambo.ROCK;
			} else if (userChoice.equalsIgnoreCase("p")) {
				System.out.println(name + ": Paper");
				userChoice2 = Roshambo.PAPER;
			} else if (userChoice.equalsIgnoreCase("s")) {
				System.out.println(name + ":Scissors");
				userChoice2 = Roshambo.SCISSORS;
			} 
		System.out.println(choice + " " + opponentChoice);

		// System.out.println(choice +":"+ opponent.generateRoshambo());// call
		// generate
		// Roshambo method

		// userChoice2 =Roshambo.ROCK;
		 //if (userChoice2==opponent.generateRoshambo()){
		 //System.out.println("Tie!");}
      // int count =0;
       //int draw=0,win=0,loose=0;
		if (userChoice2 == Roshambo.ROCK && opponentChoice == Roshambo.ROCK) {
			System.out.println("Draw!");
			draw++;
		} else if (userChoice2 == Roshambo.ROCK && opponentChoice == Roshambo.PAPER) {
			System.out.println("You won !");
			win++;
		} else if (userChoice2 == Roshambo.ROCK && opponentChoice == Roshambo.SCISSORS) {
			System.out.println("You won !");
			win++;
		} else if (userChoice2 == Roshambo.PAPER && opponentChoice == Roshambo.ROCK) {
			System.out.println("You loose !!");
			loose++;
		} else if (userChoice2 == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) {
			System.out.println("You lost !");
			loose++;
		} else if (userChoice2 == Roshambo.PAPER && opponentChoice == Roshambo.PAPER) {
			System.out.println("Draw !");
			draw++;
			//
		}else if (userChoice2 == Roshambo.SCISSORS && opponentChoice == Roshambo.PAPER) {
			System.out.println("You won !");
			win++;
		} else if (userChoice2 == Roshambo.SCISSORS && opponentChoice == Roshambo.SCISSORS) {
			System.out.println("Draw !");
			draw++;
		} else if (userChoice2 == Roshambo.SCISSORS && opponentChoice == Roshambo.ROCK) {
			System.out.println("You loose !!");
			loose++;
		} else if (userChoice2 == Roshambo.PAPER && opponentChoice == Roshambo.SCISSORS) {
			System.out.println("You lost !");
			loose++;
		} else if (userChoice2 == Roshambo.PAPER && opponentChoice == Roshambo.PAPER) {
			System.out.println("Draw !");
			draw++;
		}
	

		System.out.println("Do you want to continue? :(y/n)");
		 choice3 =sc.next();
	}
		System.out.println("Here's your record against"+ opponent);
		System.out.println("draws: "+draw+" wins: "+win+" loose: "+loose);
		
			
		// System.out.println("Great . Let's get started!!!"));

		// private static Roshambo userChoice2();
		// TODO Auto-generated method stub
		// return ;
		sc.close();
	}
	
}
