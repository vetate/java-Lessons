package MovieCharacters;

public class Character {
	
	// instance vars
	private String type;
	private String name;
	private String ability;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	
	public void greeting () {
		System.out.println("I'm in the movies");
	} // End of greeting()

	
}
