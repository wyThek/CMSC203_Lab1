import java.util.Scanner;

// The driver class of the program. This class 
public class MovieDriver {

	// main method
	public static void main(String[] args) {
		// declare and define variables
		boolean anotherOne = true, trigger = false;
		// create scanner object
		Scanner s = new Scanner(System.in);

		// create a new Movie object.
		Movie m = new Movie();
		// prompt the user
		System.out.println("Please enter the title of a movie: ");
		// get user inputs
		m.setTitle(s.nextLine());
		// prompt the user
		System.out.println("Please enter the rating of the movie: ");
		// get user inputs
		m.setRating(s.nextLine());
		// prompt the user
		System.out.println("Please enter the number of tickets sold for this movide: ");
		m.setSoldTickets(s.nextInt());
		// Display the information within the Movie object.
		System.out.println(m.toString());

		// prompt the user
		System.out.println("Goodbye!");
	}

}
