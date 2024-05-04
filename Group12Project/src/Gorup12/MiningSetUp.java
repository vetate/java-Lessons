package Gorup12;

public class MiningSetUp extends Square{
	
	private int miningSetUpCost;
	private Player owner;
	private int upgradeCost;
	private int upgradeLevel;
	private boolean maxMiningCapacity;
	private double rentPrice;
	private Field field;
	
	final static int UPGRADE_FACTOR_1 = 4;
	final static int UPGRADE_FACTOR_2 = 3;
	final static double UPGRADE_FACTOR_3 = 2.5;
	final static int MAX_CAPACITY_FACTOR = 2;
	
	
	/**
	 * Default constructor
	 */
	public MiningSetUp() {
		
	}
	
	
	/**
	* Constructor with args 
 	* @param squareName
 	* @param squareID
 	* @param miningSetUpCost
 	* @param owner
 	* @param upgradeCost
 	* @param upgradeLevel
 	* @param maxMiningCapacity
 	* @param rentPrice
 	* @param field
 	*/
	public MiningSetUp(String squareName, int squareID, int miningSetUpCost, Player owner, int upgradeCost, int upgradeLevel, boolean maxMiningCapacity, int rentPrice, Field field) {
		super(squareName, squareID);
		this.miningSetUpCost = miningSetUpCost;
		this.owner = owner;
		this.upgradeCost = upgradeCost;
		this.upgradeLevel = upgradeLevel;
		this.maxMiningCapacity = maxMiningCapacity;
		this.rentPrice = rentPrice;
		this.setField(field);
		
	}


	/**
	 * @return the miningSetUpCost
	 */
	public int getMiningSetUpCost() {
		return miningSetUpCost;
	}


	/**
	 * @param miningSetUpCost the miningSetUpCost to set
	 */
	public void setMiningSetUpCost(int miningSetUpCost) {
		this.miningSetUpCost = miningSetUpCost;
	}


	/**
	 * @return the owner
	 */
	public Player getOwner() {
		return owner;
	}


	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}


	/**
	 * 
	 * @return
	 */
	public int getUpgradeCost() {
		return upgradeCost;
	}

	/**
	 * 
	 * @param upgradeCost
	 */
	public void setUpgradeCost(int upgradeCost) {
		this.upgradeCost = upgradeCost;
	}


	/**
	 * @return the upgradeLevel
	 */
	public int getUpgradeLevel() {
		return upgradeLevel;
	}


	/**
	 * @param upgradeLevel the upgradeLevel to set
	 */
	public void setUpgradeLevel(int upgradeLevel) {
		this.upgradeLevel = upgradeLevel;
	}


	/**
	 * @return the maxMiningCapacity
	 */
	public boolean isMaxMiningCapacity() {
		return maxMiningCapacity;
	}


	/**
	 * @param maxMiningCapacity the maxMiningCapacity to set
	 */
	public void setMaxMiningCapacity(boolean maxMiningCapacity) {
		this.maxMiningCapacity = maxMiningCapacity;
	}


	/**
	 * 
	 * @return
	 */
	public double getRentPrice() {
		return rentPrice;
	}

	/**
	 * 
	 * @param rentPrice
	 */
	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}


	public Field getField() {
		return field;
	}


	public void setField(Field field) {
		this.field = field;
	}


	/**
	 * Method to display information to the player when they land on mining setup square.
	 * Information displayed depends on the current ownership status of the square.
	 */
	@Override
	public int landOnSquare(Player player) {
		
		int ownershipStatus = 0;
		
		// to check if player is the square owner
		System.out.println(player.getPlayerName() + ", you've landed on " + getSquareName() + " (" + getField() + ").");
		if (getOwner() == null) {
			System.out.println(getSquareName() + " is not owned by any other players.");
			System.out.println("Cost to buy: " + getMiningSetUpCost() + " gameCoin.");
			
			ownershipStatus = 0;
		} else if (getOwner().getPlayerID() != player.getPlayerID()) {
			System.out.println(getSquareName() + " is owned by " + getOwner().getPlayerName() + ".");
			ownershipStatus = 1;
		} else if (getOwner().getPlayerID() == player.getPlayerID()){
			System.out.println(getSquareName() + " is already owned by you.");
			ownershipStatus = 2;
		}
		
		return ownershipStatus;
		
	}
	
	@Override
	public  void displayDetails() {
		super.displayDetails();
		System.out.printf("%-25s %-15d %-15d %-10b %-10.0f" ,getField() ,getUpgradeCost() ,getUpgradeLevel() ,isMaxMiningCapacity() ,getRentPrice() );
		System.out.println();
		
	}
	
	
	/**
	 * Method for a player to buy a mining setup square they land on during their turn.
	 * @param player - the player whose turn it is.
	 */
	public void buyMiningSetup(Player player) {
	
		// to check if player has enough gameCoin to purchase the mining setup square
		System.out.println(getSquareName() + " costs " + getMiningSetUpCost() + " gameCoin.");
		if (player.getBalance() < getMiningSetUpCost()) {
			System.out.println("Sorry, you do not have enough gameCoin.");
			
		} else {
			// subtract cost of square from player's balance
			double updatedBalance = player.getBalance() - getMiningSetUpCost();
			player.setBalance(updatedBalance);
						
			// set the player as the square owner
			setOwner(player);
			System.out.println(getSquareName() + " purchased.");
			System.out.println("You're remaining balance is " + player.getBalance() + " gameCoin.");
			}
				
	}
	
	/**
	 * Method for a player to upgrade their mining setup during their turn
	 * @param player - the player whose turn it is
	 */
	public void megaWattUpgrade(Player player) {
		
		System.out.println("A megaWatt upgrade to " + getSquareName() + " costs " + getUpgradeCost() + " gameCoin.");
			
		// to check if player has enough gameCoin to carry out the megaWatt upgrade
		if (player.getBalance() < getUpgradeCost()) {
			System.out.println("Sorry, you do not have enough gameCoin.");
				
		} else {
			switch(getUpgradeLevel()) {
			case 0 :
			case 1 :
			case 2 :
				// subtract cost of upgrade from player's balance
				double updatedBalance = player.getBalance() - getUpgradeCost();
				player.setBalance(updatedBalance);
					
				// set the new upgrade level of the mining setup square
				int newLevel = getUpgradeLevel()+1;
				setUpgradeLevel(newLevel);
					
				// set new rent price
				if (getUpgradeLevel() == 1) {
				setRentPrice(getRentPrice() * UPGRADE_FACTOR_1);
				} else if (getUpgradeLevel() == 2) {
					setRentPrice(getRentPrice() * UPGRADE_FACTOR_2);
				} else if (getUpgradeLevel() == 3) {
					setRentPrice(getRentPrice() * UPGRADE_FACTOR_3);
				}
					
				System.out.println(getSquareName() + " has been upgraded to level " + getUpgradeLevel());
				System.out.println("New rent cost for landing on: " + getRentPrice());
				System.out.println("You're remaining balance is " + player.getBalance() + "gameCoin.");
				break;
			case 3 :
				// ensure square is not already at maximum mining capacity
				if (!maxMiningCapacity) {
					System.out.println(getSquareName() + " cannot be upgraded further, maximum mining capacity will be established.");
					
					// subtract cost of upgrade from player's balance
					double updatedBalanceMax = player.getBalance() - getUpgradeCost();
					player.setBalance(updatedBalanceMax);
					
					// maximum mining capacity established
					setMaxMiningCapacity(true);

					// set new rent price
					setRentPrice(getRentPrice() * MAX_CAPACITY_FACTOR);
						
					System.out.println("Maximum mining capacity has been established on " + getSquareName() );
					System.out.println("New rent cost for landing on: " + getRentPrice());
					System.out.println("You're remaining balance is " + player.getBalance() + "gameCoin.");
					
				} else {
					System.out.println("Already at maximum mining capacity, no further upgrade possible.");
				}
					
				break;
			default:
					
			}			
		}
					
	}
	
	
}