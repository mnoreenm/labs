//Lab 10Teamup by Brent Collins III ad Sadia Noreen

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);		
System.out.println("Welcome to th Movie List Application!");
System.out.println("There are 100 movies in the list");
System.out.println("What category are you interested in?");
System.out.println("Please Choose from: scifi, horror, drama, animated");
 String userInput = sc.next();
		ArrayList<Movie> movies = new ArrayList<>();
		
movies.add(new Movie("ET", "scifi"));
movies.add(new Movie("The Lady in Black", "horror"));
movies.add(new Movie("Pretty Woman", "drama"));
movies.add(new Movie("Finding Nemo", "animated"));
//System.out.println(movies);
for (Movie movie : movies) {
	if ( userInput.equalsIgnoreCase(movie.getMovieCategory() ) ) {
		System.out.println(movie.getName());
	}
	}

}
}