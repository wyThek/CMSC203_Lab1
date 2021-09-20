import java.util.Scanner;

// The driver class of the program. This class 
public class MovieDriver {

	// main method
	public static void main(String[] args) {
		// declare and define variables
		boolean anotherOne = true, trigger = false;
		// create scanner object
		Scanner s = new Scanner(System.in);

		// do-while loop to allow user to enter another movie.
		do {
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
			
			// do-while loop for input validation
			do {
				System.out.println("Do you want to enter another? (y or n)");
				// clear buffer
				s.nextLine();
				// declare a string variable and get user inputs
				String input = s.nextLine();

				//if else statement to check user's input
				if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
					trigger = false;
				} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
					trigger = false;
					// change the value of anotherOne to false to terminate the loop
					anotherOne = false;
				} else {
					System.out.println("Invalid input. Please enter \"y\" or \"n\".");
					trigger = true;
				}
			} while (trigger);

		} while (anotherOne);
		// prompt the user
		System.out.println("Goodbye!");
	}

}
