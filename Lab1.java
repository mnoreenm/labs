import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		//always make scanner at top
		System.out.println("Welcome to the Grand Circus's Room Detail Generator!");
		
		String choice ="y";
	    while (choice.equalsIgnoreCase("y")){
		
		System.out.println("Please Enter Length");
		float length =scanner.nextFloat();
		
		
		System.out.println("Please Enter Width");
		
		float  width =  scanner.nextFloat();
		
		float  area = width * length;
		
		
		System.out.println("Area:" + area);
		
		
		float  perimeter = (2*length) +(2*width);
		
		System.out.println("Perimeter:" + perimeter);
		
		System.out.println("Continue?(y/n) :");
		choice = scanner.next();
		
		System.out.println();
	    }
		
		scanner.close();
		/*
		System.out.println("Do you live in Michigan? (y/n)");
		
		
		String yesOrNo = scanner.next();
		
		if (yesOrNo.equals("y")){
			System.out.println("Excellent");
			System.out.println("Do ypo live in Detroit? (y/n)");
		
		
		 yesOrNo = scanner.next();
		 if (yesOrNo.equals("y")){
			System.out.println("Come visit Grand Circus");
		}
		else{
			System.out.println("You should move ");
		}
		}
		
		*/
		
		
		
		
		

	}

}
