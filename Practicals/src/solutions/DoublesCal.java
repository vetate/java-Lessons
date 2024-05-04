package solutions;

public class DoublesCal {

	public static void main(String[] args) {
		
		// the fuel efficiency represents miles per gallon
				double fuelEfficiency = 52.3;
				// the train price is in pounds and pence
				double trainPrice = 5.50;
				// the fuel cost is in pounds and pence
				double fuelCost = 5.09;
				// the car maintenance is in pence per mile
				double carMaintenance = 26.2;
				// the travel distance is in miles
				double travelDistance = 15;
				
				double costOfCar =(carMaintenance * travelDistance)/100 + 
						(travelDistance / fuelEfficiency * fuelCost);
				
				System.out.printf("The cost of car travel is £%.2f:\n", costOfCar);
				System.out.printf("The cost of train travel is: £%.2f\n", trainPrice);

	}

}
