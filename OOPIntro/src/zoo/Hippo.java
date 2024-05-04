/**
 * 
 */
package zoo;

/**
 * @author Ve
 *
 */
public class Hippo {
	
	// instance Vars
	private int weight;
	private String name;
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// Constructors - The Default Contructor 
	public Hippo() {
		System.out.println("Default Contructor being used here!!");
	}
	
	// contructor with arguments ARGS
	public Hippo(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	// Methods
	
	

}// class
