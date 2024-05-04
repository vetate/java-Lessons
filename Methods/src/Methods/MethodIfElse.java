package Methods;

public class MethodIfElse {

	public static void checkNumber(int number) {
		if (number >= 0) {
			System.out.println("The number is positive or zero.");
		} else {
			System.out.println("The number is negitive.");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		checkNumber(-6);
		checkNumber(-3);

	}

}
