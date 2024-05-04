/**
 * 
 */
package animals;

/**
 * @author Ve
 *
 */
public class AnimalManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		// create Mumbles
		Dog mumbles = new Dog();
		Cat fluffy = new Cat();
;		
		// make Mumbles bark
		
		mumbles.setName("mumble");
		mumbles.setBreed("some dog type");
		
		fluffy.setName("fluffy");
		fluffy.setBreed("Cat");
		
		
		System.out.println("The Ninja Food-Napping Dog is ");
		System.out.println("Name : " +mumbles.getName());
		System.out.println("Breed is : " +mumbles.getBreed());
		
		mumbles.bark();
		mumbles.rollOver();
		
		System.out.println("The cute cat is ");
		System.out.println("Name : " +fluffy.getName());
		System.out.println("Breed is : " +fluffy.getBreed());
		

		
		fluffy.eat();
		fluffy.meow();


	}//main

}// class
