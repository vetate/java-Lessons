package statements;

public class Main {

	public static void main(String[] args) {


		checkNumber(0);
		checkNumber(10);
		
		
	}
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("positive");
			
		}else if(number < 0) {
				System.out.println("negative");
			} else if (number == 0) {
				System.out.println("Zero");
			}
	}
}
