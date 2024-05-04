package animals;

public class Cat {
	
	
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


	public void eat() {
		System.out.println("Cat is eating tuna");
	}


	public void meow () {
		System.out.println("puurrr");
	} // End of Bark()

}// class


