package errorFind;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        String result = checkNumber(number);
        
        System.out.println("Result: " + result);
        
        input.close();
    }
    
    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else if (num == 0) {
            return "Zero";
        } else {
            return "Invalid";
        }
    }
}