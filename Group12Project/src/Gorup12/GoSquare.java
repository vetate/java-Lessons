/**
 * 
 */
package Gorup12;

/**
 * @author Ve
 *
 */
public class GoSquare extends Square {

	/**
	 * Constant value to represent gameCoin amount collected when player passes GoSquare
	 */
	final static int PASS_GO_AMOUNT = 200;
	
	/**
	 * Default constructor
	 */
	public GoSquare() {
		
	}

	/**
	 * Constructor with args
	 * @param squareName
	 * @param squareID
	 */
	public GoSquare(String squareName, int squareID) {
		super(squareName, squareID);
	}

	/**
	 * Method to display information to the player when they land on the Go square.
	 */
	@Override
	public int landOnSquare(Player player) {
		int ownershipStatus = 3;
		System.out.println(player.getPlayerName() + " you've landed on " + getSquareName());
		System.out.println("This square is not owned by any player and cannot be purchased");
		return ownershipStatus;
	}
	
	/**
	 * Method to display details of Go Square
	 */
	@Override
	public  void displayDetails() {
		super.displayDetails();
		
	}

	/**
	 * Method to update the player's balance with the PASS_GO_AMOUNT when they pass the Go square
	 * @param player
	 */
	public void passGo(Player player) {
		
		// add PASS_GO_AMOUNT to the player's balance
		double updatedBalance = player.getBalance() + PASS_GO_AMOUNT;
		player.setBalance(updatedBalance);
		
		// print out changes made
		System.out.println(PASS_GO_AMOUNT + " gameCoin added to " + player.getPlayerName() + "'s balance for passing GO.");
		System.out.println("New balance : " + player.getBalance());
		
	}


}