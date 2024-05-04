package uk.ac.vtate.lab2;

public class penny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pennies = 1729;
		int pounds = pennies / 100;
		int pence = pennies % 100;
		
		System.out.println("£" + pounds + "." + pence);
	}

}
