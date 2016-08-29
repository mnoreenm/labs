

import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 
	 *   ask for number of sides 
	 * use scanner to get the number of sides
	 * roll a dice
	 * point to the value
	 * roll dice
	 * print the value
	 * ask to do again                  
	 * 
	 *       */
		
		
	    
		Scanner scanner = new Scanner (System.in);
		System.out.println("Welcome To The Grand Circus Casino!");
		String userInput;
		do {
		System.out.println("How many sides should each die have?");
		System.out.println("Choose from 1 to 6");
		int die = scanner.nextInt();

		int   rollNumber =0;  
		int  diceOutCome = rollADice(die);
		int  diceOutCome2 = rollADice(die);
		rollNumber = rollNumber+1;
		System.out.println("Roll "+rollNumber);
		System.out.println(diceOutCome);
	    System.out.println(diceOutCome2);
	    System.out.println("Roll again?(y/n)");


	    		
		
		  userInput  = scanner.next();
		}while (userInput.equals("y"));
		System.out.println("Have a great day");}
	    
	    
	    		
	    		

	
	    
	public static int  rollADice(int numberOfSides){
		/*String choice = "y";*/
		int random = (int )(Math.random() * 6 + 1);
		
		return random ;
		
	    	
	
	    }
	
	
		
}
