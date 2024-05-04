/**
 * 
 */
package animals;

/**
 * @author Ve
 *
 */
public class Dog {
	
	// instance vars
	private String breed;
	private String name;
	
	
	// constructors
	
	// instance methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}


	public void rollOver() {
		System.out.println("I'm Rolling Over....");
	}


	public void bark () {
		System.out.println("Woof..Woof!");
	} // End of Bark()

}// class
