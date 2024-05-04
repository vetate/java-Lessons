package uk.ac.lab1;

public class LocalGlobal {


	    static int globalVariable = 20; // This is a global variable

	    public static void main(String[] args) {
	        int localVariable = 10; // This is a local variable

	        System.out.println("The value of the local variable is: " + localVariable); // Prints 10
	        System.out.println("The value of the global variable is: " + globalVariable); // Prints 20

	        localVariable = 30; // This changes the value of the local variable

	        System.out.println("The value of the local variable is now: " + localVariable); // Prints 30
	        System.out.println("The value of the global variable is still: " + globalVariable); // Prints 20
	        
	    } //Main
	}// Class