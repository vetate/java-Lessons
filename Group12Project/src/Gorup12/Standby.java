package Gorup12;

public class Standby extends Square {

	/**
	 * Default constructor
	 */
	public Standby() {
		
	}
	
	
	/**
	 * Constructor with args
	 * @param squareName
	 * @param squareID
	 */
	public Standby(String squareName, int squareID) {
		super(squareName, squareID);
	}


	/**
	 * Method to display information to the player when they land on Free Parking
	 */
	@Override
	public int landOnSquare(Player player) {
		int ownershipStatus = 3;
		System.out.println(player.getPlayerName() + " you've landed on " + getSquareName());
		System.out.println("This square is not owned by any player and cannot be purchased");
		return ownershipStatus;

	}
	
	@Override
	public  void displayDetails() {
		super.displayDetails();
	}


}
