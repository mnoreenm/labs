

/*--------------------------------------------------------------------    
 * 
 *import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Lab7studentInfo {
	
	
	Scanner sc = new Scanner(System.in);
    int stuIndex=0;
    String yesorno;
    
    
    String[] stuName = new String[] { "Alex","sadia","rumi","kapil","pranav"};
    String[] stuHometown = new String[] { "Troy", "Rochester", "westbloomfield", "macomb", "troy"};
    String[] stuFavFood = new String[] { "nuts", "fruits", "pasta", "ravioli", "thainoodles"};
    
    int[] stuNumber = new int[] {1, 2, 3, 4, 5 };
    System.out.println("Welcome to our Java Class!!");

    for(int i = 0; i<stuName.length ; i++) {

        System.out.println(stuNumber[i] + "." + stuName[i]);
    
    }
    
    
    
    try{
    
    do
    {
    System.out.println("which student would you like to learn more about? Enter a number 1 to 5");
    stuIndex = sc.nextInt();


    
        System.out.println("Student " +stuNumber[stuIndex-1] +" is " +stuName[stuIndex-1]+"."+"What would you like to kmow about " +stuName[stuIndex-1]+"?");
      System.out.println("Enter hometown or favorite food");
    } catch (IndexOutOfBoundsException ex){
        
        System.out.println("That student does not exist.Please try again");
    }
String choice=sc.next();

if (choice.equalsIgnoreCase("hometown")){

System.out.println(stuName[stuIndex-1]+" is from " +stuHometown[stuIndex-1]+","+"."+"Would you like to know more? (enter yes or no)");

}else if (choice.equalsIgnoreCase("favoritefood"))
{
System.out.println(stuName[stuIndex-1]+" is from " +stuHometown[stuIndex-1]+","+"."+"Would you like to know more? (enter yes or no");
}
yesorno = sc.next();

}while (yesorno.equalsIgnoreCase("yes"));
    
    System.out.println("good bye");



    sc.close();
}

}*/
 import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab7Revised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int studentIndex=0;
		String yesorno;
		
		
		String[] studentName = new String[] { "Alex","Sadia","Rumi","kapil","Pranav","Martin","Lindstrom","Bush","Mark","Andrew","shreya","Pranavi","Mamo","David","Adi","Narma","Sarav","Babu","Ray","Sheela"};
		String[] studentHometown = new String[] { "Troy", "Rochester", "westbloomfield", "macomb", "troy","westbloomfield", "macomb", "troy","Troy", "Rochester", "westbloomfield", "macomb", "troy","Troy", "Rochester", "westbloomfield", "macomb", "troy","troy","GrandRapids"};
		String[] studentFavFood = new String[] { "nuts", "fruits", "pasta", "ravioli", "thainoodles","taco","pizza","pizza","icecream","desserts","fruits","taco","pizza","nuts","noodles","dessert","pizza","taco","pizza","fruits"};
		
		int[] studentNumber = new int[] {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
		System.out.println("Welcome to ou class Java. Which student would you like to learn about?" + "(enter a number 1-5):");

		for (int i = 0; i<studentName.length ; i++) {

			System.out.println(studentNumber[i] + "." + studentName[i]);
		
		}
		
		
		do
		{
		try{
		
		
		
		System.out.println("which student would you like to learn more about? Enter a number 1 to 20");
		studentIndex = sc.nextInt();

		 if (studentIndex < 1) {
			 throw new IllegalArgumentException("Number cannot be less than 1.");
		 }

		
			System.out.println("Student " +studentNumber[studentIndex-1] +" is " +studentName[studentIndex-1]+"."+"What would you like to kmow about " +studentName[studentIndex-1]+"?");
          System.out.println("Enter hometown or favoritefood");
		} catch (IndexOutOfBoundsException ex){
			
			System.out.println("That student does not exist.Please try again");
		}
 String choice=sc.next();

if (choice.equalsIgnoreCase("hometown")){
	
	System.out.println(studentName[studentIndex-1]+" is from " +studentHometown[studentIndex-1]+","+"."+"Would you like to know more? (enter yes or no)");
	
}else if (choice.equalsIgnoreCase("favoritefood"))
{
	System.out.println(studentName[studentIndex-1]+"'s "+"favorite food is " +studentFavFood[studentIndex-1]+","+"."+"Would you like to know more? (enter yes or no)");
}else
{
	System.out.println("That data does not exist.Please try again");
}
 yesorno = sc.next();

		} while (yesorno.equalsIgnoreCase("yes"));
		
		System.out.println("good bye");
	


		sc.close();
	}
	
}


 

