package arraysExamples;

public class MoviesArray {

	public static void main(String[] args) {
        // Create an array
        String[] movies =
                { "Batman", "Guardians of the Galaxy", "Thor", "Pitch Black", "Resident Evil", "I am Legend" };
        
        // Access the third element in the array
        String selectedMovie = movies[2];
        
        // Print out the third element in the array
        System.out.println("Third Movie is " + selectedMovie);
        
        // Change the name of the third student
        movies[2] = "Thor Ragnarok";

        // Access the third element in the array
        selectedMovie = movies[2];

        // Print out the third element in the array
        System.out.println("Updated movie title " + selectedMovie);
        
        // Print out the entire contents of the array
        System.out.println("Contents of array:");
        int arrayLength = movies.length;
        for (int index = 0; index < arrayLength; index++) {
            System.out.println(movies[index]);

//Attempting to access an index that does not exist
/*System.out.println("The last movie in the list is " +
        movies[6]);
        */
        }
    }
}

