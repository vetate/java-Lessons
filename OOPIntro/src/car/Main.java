package car;

//Main.java - The main class to run the program
public class Main {
	public static void main(String[] args) {
		
		// Create an instance (object) of the Car class
		Car myCar = new Car();

		// Set the attributes of the car
		myCar.make = "Toyota";
		myCar.model = "Rav4";
		myCar.year = 2023;
		
        // Print out the attribute data
        System.out.println("Car Details:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);

		// Call the methods on the car object
		myCar.startEngine();
		myCar.accelerate();
		myCar.brake();
		
		
	}
}
