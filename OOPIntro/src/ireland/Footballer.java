/**
 * 
 */
package ireland;

/**
 * @author Ve
 *
 */
public class Footballer {
	
	//vars
	
	private String firstName;
	private String lastName;
	private int employeeNumber;
	private int squadNumber;
	
	//constructors
	public Footballer() {
		System.out.println("About to create a dog footballer");
	}
	
	// This is a contructer with some arguments but not all of them
	public Footballer(String firstName, String lastName, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		// checking the number from the IF ELSE in the SET Number below!!!
		this.setSquadNumber(squadNumber);
	} // End of constructor with args
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public int getSquadNumber() {
		return squadNumber;

	}
	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	        
	        if (squadNumber>=30 && squadNumber <=100) {
	            this.squadNumber = squadNumber;
	        } else {
	            System.out.println("Problem with range suggested for squad number");
	            this.squadNumber = -1;
	        }
	    }
	
	
	// creates footballer with all properties to set and get!!!
	public Footballer(String firstName, String lastName, int employeeNumber, int squadNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = squadNumber;
	}
	
	
	//methods
	
	/**
     * Outputs to screen the details of the footballer
     */
    public void displayDetails() {
        System.out.println("Footballer _______");
        System.out.println("First name    : "+this.firstName);
        System.out.println("Last name     : "+this.lastName);
        System.out.println("Squad number  : "+this.squadNumber);
        System.out.println("Employee      : "+this.employeeNumber);
    }// end of displayDetails ()

	@Override
	public String toString() {
		return "Footballer *firstName=" + firstName + ", lastName=" + lastName + ", employeeNumber=" + employeeNumber
				+ ", squadNumber=" + squadNumber + "]";
	}
	
    

}
