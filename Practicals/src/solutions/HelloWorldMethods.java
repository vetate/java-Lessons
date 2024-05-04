package solutions;

public class HelloWorldMethods {

	public static void main(String[] args) {

		goodMorning();
		goodEvening();
		goodNight();
	}
	
	public static void goodMorning() {
		System.out.println("Good Morning!");
	}
	
	public static void goodEvening() {
		System.out.println("Good Evening!");
		goodNight();
	}

	public static void goodNight() {
		System.out.println("Good Night!");
	}

}
