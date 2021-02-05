import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		// create new scanner to get user's inputs
		Scanner sc = new Scanner(System.in);
		
		//create new object
		Movie m1 = new Movie();

		// infinite while loop,  only stops when the user say 'n'.
		while (true) {

			System.out.println("Enter the name of a movie:");
			m1.setTitle(sc.nextLine());			// get user's input and store it

			System.out.println("Enter the rating of the movie:");
			m1.setRating(sc.nextLine());		// get user's input and store it

			System.out.println("Enter the number of tickets sold for this movie:");
			m1.setSoldTickets(sc.nextInt());		// get user's input and store it
			
			// use getter to retrieve the info of the object and display them.
			System.out.println(m1.getTitle() + ": " + m1.getRating() + ": " + m1.getSoldTickets());
			sc.nextLine();
			System.out.println("Do you want to enter another? (y or n)");

			// if statement to check whether the user want to stop or not.
			if (sc.nextLine().equals("n")) {
				System.out.println("Goodbye.");
				sc.close();
				System.exit(0);
			}

		}

	}

}
