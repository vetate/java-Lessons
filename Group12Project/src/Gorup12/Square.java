package Gorup12;

public abstract class Square {
	
	private String squareName;
	private int squareID;
	
	/**
	 * Default constructor
	 */
	public Square() {
		
	}
	
	/**
	 * Constructor with args
	 * @param squareName
	 * @param squareID
	 */
	public Square(String squareName, int squareID) {
		this.squareName = squareName;
		this.squareID = squareID;
		
	}

	/**
	 * @return the squareName
	 */
	public String getSquareName() {
		return squareName;
	}

	/**
	 * @param squareName the squareName to set
	 */
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	/**
	 * @return the squareID
	 */
	public int getSquareID() {
		return squareID;
	}

	/**
	 * @param squareID the squareID to set
	 */
	public void setSquareID(int squareID) {
		this.squareID = squareID;
	}
	
	/**
	 * Abstract method to land on a square
	 * @param player
	 */
	public abstract int landOnSquare(Player player);
	
	/**
	 * Method to display details of a square
	 */
	public void displayDetails() {
		System.out.printf("%-2d  %-35s" ,getSquareID() ,getSquareName());
	}


}
