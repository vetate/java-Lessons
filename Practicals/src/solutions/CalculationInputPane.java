package solutions;
import javax.swing.JOptionPane;

public class CalculationInputPane {

	public static void main(String[] args) {
		
		// the fuel efficiency represents miles per gallon
				double fuelEfficiency = Double.parseDouble(JOptionPane.showInputDialog("Please enter the fuel efficiency in mpg"));
				// the train price is in pounds and pence
				double trainPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost of the train journey, as pounds and pence"));
				// the fuel cost is in pounds and pence
				double fuelCost = Double.parseDouble(JOptionPane.showInputDialog("Please enter the cost of fuel per gallon as pounds and pence"));
				// the car maintenance is in pence per mile
				double carMaintenance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the maintenance cost per mile of your car"));
				// the travel distance is in miles
				double travelDistance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the distance travelled"));
				
				double costOfCar = (carMaintenance * travelDistance)/100 + 
						(travelDistance / fuelEfficiency * fuelCost);
				
				JOptionPane.showMessageDialog(null, "The cost of car travel is: £" + 
						String.format("%.2f", costOfCar) +
						"\nThe cost of train travel is: £" + String.format("%.2f", trainPrice));

	}

}
