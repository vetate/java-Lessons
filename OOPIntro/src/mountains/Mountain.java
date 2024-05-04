/**
 * 
 */
package mountains;

/**
 * @author Ve
 *
 */
public class Mountain {
	
	// constructor
	public Mountain() {
		
	}
	
	public Mountain (String name, int height) {
		this.name = name;
		this.setHeight(height); 
	}
	
	// instance vars
	private String name;
	private int height;
	
	// Getters
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(int height) {
		if (height<1000) {
			this.height = height;
		}else {
			System.out.println("Problem with setting height");
		}
		this.height = height;
	}
	

}// class
