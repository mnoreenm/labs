import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to the circle Tester");

		do {
			try {
				System.out.println("Enter radius:");
				double radius = sc.nextDouble();
				Circle circle1 = new Circle(radius);
				circle1.getArea();
				circle1.getCircumference();
				System.out.println("Circumference  :" + circle1.getFormattedCircumference());
				System.out.println("Area  :" + circle1.getFormattedArea());

			} catch (InputMismatchException ex) {
				System.out.println("Invalid data: Please  enter a number");
				sc.next();

			}

			System.out.println("Would you like to create another circle?(y/n)");
			choice = sc.next();

		} while(choice.equalsIgnoreCase("y"));
		System.out.println("Goodbye. You created " + Circle.getObjectCount() + "  Circle object");
		sc.close();
	}

}