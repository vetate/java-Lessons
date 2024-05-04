package arraysExamples;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};

		// Accessing elements in the array
		int firstNumber = numbers[0];
		System.out.println("First number: " + firstNumber);

		// Modifying an element in the array
		numbers[2] = 10;

		// Accessing modified element
		int modifiedNumber = numbers[2];
		System.out.println("Modified number: " + modifiedNumber);


	}

}
