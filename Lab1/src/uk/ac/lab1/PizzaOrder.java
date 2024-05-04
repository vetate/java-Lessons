package uk.ac.lab1;

public class PizzaOrder {
	    // Global variable
	    static int totalCost = 0;

	    public static void main(String[] args) {
	        // Local variable
	        int numberOfPizzas = 3;
	        int costPerPizza = 10;

	        // Calculate total cost
	        int orderCost = numberOfPizzas * costPerPizza;

	        // Update global variable
	        totalCost += orderCost;

	        // Display order details
	        System.out.println("Number of Pizzas: " + numberOfPizzas);
	        System.out.println("Cost per Pizza: £" + costPerPizza);
	        System.out.println("Order Cost: £" + orderCost);
	        //System.out.println("Total Cost: £" + totalCost);
	    }
	}
