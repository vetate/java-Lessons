package Gorup12;
import java.util.ArrayList;

public class Player {

	private String playerName;
	private int playerID;
	private int location;
	private double balance;

	final static int STARTING_BALANCE = 1500;
	final static int STARTING_LOCATION = 0;

	/**
	 * Default constructor
	 */
	public Player() {
		this.location = STARTING_LOCATION;
		this.balance = STARTING_BALANCE;
	}

	/**
	 * Constructor with args
	 * 
	 * @param playerName
	 * @param playerID
	 * @param location
	 * @param balance
	 */
	public Player(String playerName, int playerID, int location, double balance) {
		this.playerName = playerName;
		this.playerID = playerID;
		this.location = location;
		this.balance = balance;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the playerID
	 */
	public int getPlayerID() {
		return playerID;
	}

	/**
	 * @param playerID the playerID to set
	 */
	public void setPlayerID(int playerID) {
		if ((playerID >= 1) && (playerID <= GameSystem.MAX_NUMBER_PLAYERS)) {
			this.playerID = playerID;
		} else {
			throw new IllegalArgumentException("Invalid number of players enetered");
		}

	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 * business rule means the location has to be set within the parameters defined by the number of squares
	 */
	public void setLocation(int location) {
		if ((location >= 0) && (location <= GameSystem.NUMBER_OF_SQUARES - 1)) {
			this.location = location;
		} else {
			throw new IllegalArgumentException("Landed out of bounds, off the board, invalid square");
		}
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Method for player to pay rent to the owner of the square they have landed on
	 * 
	 * @param landedOn
	 * @param squareOwner
	 * @return - boolean value, false if player becomes bankrupt.
	 */
	public boolean payPlayer(MiningSetUp landedOn, Player squareOwner) {

		boolean contineGame = true;

			System.out.println("Rent due for landing on " + landedOn.getSquareName() + " : " + landedOn.getRentPrice());

			// subtract rent money from paying player
			double newPayingBalance = getBalance() - landedOn.getRentPrice();
			setBalance(newPayingBalance);

			// add rent money to owner's balance
			double newOwnerBalance = squareOwner.getBalance() + landedOn.getRentPrice();
			squareOwner.setBalance(newOwnerBalance);

			// determine if payment has made player bankrupt
			if (getBalance() < 0) {
				System.out.println(getPlayerName() + ", not enough funds to pay rent. You are bankrupt.");
				contineGame = false;

			} else {
				System.out.println(getPlayerName() + ", your new balance is " + getBalance() + " gameCoin.");
				System.out.println(squareOwner.getPlayerName() + ", your new balance is " + squareOwner.getBalance()
						+ " gameCoin.");
			}

		return contineGame;
	}

	/**
	 * Method to move player to the appropriate square based on the value of their
	 * dice roll
	 * 
	 * @param squares
	 * @param roll
	 */
	public boolean movePlayer(ArrayList<Square> board, int roll) {

		boolean passedGo = false;

		// add the roll to the player's current location
		int newLocation = getLocation() + roll;

		// ensure new location is not off the board (outside spaces 0 -11)
		if (newLocation > (GameSystem.NUMBER_OF_SQUARES - 1)) {
			newLocation -= GameSystem.NUMBER_OF_SQUARES;
			setLocation(newLocation);
			passedGo = true;
		} else {
			setLocation(newLocation);

		}

		System.out.println("Moving " + roll + " squares to " + board.get(newLocation).getSquareName());
		return passedGo;

	}

	@Override
	public String toString() {
		return "Player" + getPlayerID() + "[Name=" + getPlayerName() + "]";
	}

}
