package arraysExamples;

public class moviesMultiArray {

	public static void main(String[] args) {
		
		// Create a 2D array
		String[][] movies = { { "Thor", "Batman", "World War Z", "Avatar", "Riddick", "Black Widow" },
									{ "Iron Man", "Deadpool", "The Lord of the Rings", "Fight Club", "Interstellar", "Gladiator" },
									{ "The Matrix", "The Hobbit", "Wonder Woman", "I am Legend", "War of the Worlds", "The Evil Dead" } 
									};

		// Access the third element in the first row of the array
		String selectedmovies = movies[0][2];

		// Print out the third element in the array
		System.out.println("Third movie in the first Array List is " + selectedmovies);

		// Change the name of the 5th movie in the first list
		movies[0][4] = "The Chronicles of Riddick";

		// Access the 5th element in the array
		selectedmovies = movies[0][4];

		// Print out the 5th element in the array
		System.out.println("5th movie is now updtaed to " + selectedmovies);
		
		
		
		System.out.println("Contents of array:");
		int rowLength = movies.length; // Get number of rows
		int colLength = movies[0].length; // Get number of columns

		for (int rowCount = 0; rowCount < rowLength; rowCount++) {
		    // Outer loop - iterates rows
		    for (int colCount = 0; colCount < colLength; colCount++) {
		        // Inner loop - iterates columns
		        System.out.print(movies[rowCount][colCount] + " ");
		    }
		    System.out.println(", next row..."); // Move to the next line after each row
		    
		} // End of For Loop

	
	}// End of main
} // End of Class
