/**
 * 
 */
package ireland;

/**
 * @author Ve
 *
 */
public class TeamAdminManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Footballer f1 = new Footballer();
		f1.setFirstName("Mumbles");
		f1.setLastName("Tate");
		f1.setEmployeeNumber(1122);
		f1.setSquadNumber(8);
		
		System.out.println(f1.getFirstName() + " " +f1.getLastName() + " " +f1.getSquadNumber());
		
		//Setting the properties to print see
		Footballer f2 = new Footballer("Bruce", "Tate", 88, 999);
		System.out.println(f2.getFirstName() +" " + f2.getLastName() + " " + f2.getEmployeeNumber() + " " + f2.getSquadNumber());
		
		//part set properties here and in the Footballer class method of squad number
		Footballer f3  = new Footballer("Simon", "Noel", 999, 89);
		System.out.println(f3.getFirstName() +" " + f3.getLastName() + " " + f3.getEmployeeNumber() + " " + f3.getSquadNumber());
		
		f3.displayDetails();
		
		System.out.println(f3.toString());

	}

}
