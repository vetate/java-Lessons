package MovieCharacters;


public class MovieManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create Mumbles
		Character groot = new Character();
		Character starLord = new Character();
		
		groot.setName("Groot");
		groot.setType("Cute as hell!");
		groot.setAbility("Spits splinters, Dancing, Vomits");
		
		System.out.println("Movie Character  ");
		System.out.println("Name : " +groot.getName());
		System.out.println("Character Type is  : " +groot.getType());
		System.out.println("Groot's Abilities are  : " +groot.getAbility());
		
		// Call a Method
		
		groot.greeting();
		
		//  New Character 
		
		System.out.println(" ");
		
		starLord.setName("StarLord");
		starLord.setType("Half God, Half Man");
		starLord.setAbility("Charming, dancing, Loyal");
		
		System.out.println("Movie Character  ");
		System.out.println("Name : " +starLord.getName());
		System.out.println("Character Type is  : " +starLord.getType());
		System.out.println("StarLords's Abilities are  : " +starLord.getAbility());
		
		starLord.greeting();
	}

}
