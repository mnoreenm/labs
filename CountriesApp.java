import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Sadia
 *
 */

public class CountriesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * created scanner to store  user input into String variable for country name 
 */
	Scanner sc = new Scanner(System.in);
	int userChoice = 0;
System.out.println("Welcome to the Countries Maintenance Application !");

do {
System.out.println("1- See the list of countries");	
System.out.println("2- Add a country");	
System.out.println("3- Exit");
System.out.println("          ");

System.out.println("Enter menu number:");
System.out.println();
int   userInput = sc.nextInt();
 userChoice = userInput;

String addCountry;
 
 List<String>  country = new  ArrayList<String>();
 
 CountriesTextFile  countriesTextFile = new  CountriesTextFile();
 
	 
 switch(userInput){
 case 1: country = countriesTextFile.readCountryList();
 System.out.println(country);
 System.out.println();
 break;
 case 2 :System.out.println("Enter Country");
 
	 addCountry = sc.next();
	 country.add(addCountry);
	 countriesTextFile.writeCountryList(country);
	 System.out.println("This country has been saved! ");
	 System.out.println();
 break;
 case 3 :System.out.println("Exit");
 System.out.println();
 break;
 
 default: System.out.println("Wrong input.Please enter from 1 to 3");
 
 //System.out.println();
 
}
 
 
}while (userChoice !=3);
 System.out.println("Buh-bye! "); 
 sc.close();
}
	}

 
	
	
	



