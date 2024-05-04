package Gorup12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class GameSystem {
	
	private int numberOfPlayers;
	private Player currentTurn;
	private boolean gameStatus;
	
	/**
	 * Constant value for number of squares on the game board
	 */
	public static final int NUMBER_OF_SQUARES = 12;
	
	public static final int MAX_NUMBER_PLAYERS = 4;
	public static final int MIN_NUMBER_OF_PLAYERS = 2;
	
	

	/**
	 * @return the numberOfPlayers
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}


	/**
	 * @param numberOfPlayers - must be between 2 and 4 (inclusive)
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		
		if(numberOfPlayers >= MIN_NUMBER_OF_PLAYERS && numberOfPlayers <= MAX_NUMBER_PLAYERS) {
			this.numberOfPlayers = numberOfPlayers;
		} else {
			System.out.println("Invalid number. Enter a number from " + MIN_NUMBER_OF_PLAYERS + " to " + MAX_NUMBER_PLAYERS + ".");
		}
	}


	/**
	 * Get the player whose turn it currently is
	 * @return -player whose turn it is
	 */
	public Player getCurrentTurn() {
		return currentTurn;
	}

	/**
	 * Set the player whose turn it currently is
	 * @param currentTurn - player whose turn it is
	 */
	public void setCurrentTurn(Player currentTurn) {
		this.currentTurn = currentTurn;
	}

	/**
	 * @return the gameStatus
	 */
	public boolean isGameStatus() {
		return gameStatus;
	}


	/**
	 * @param gameStatus the gameStatus to set
	 */
	public void setGameStatus(boolean gameStatus) {
		this.gameStatus = gameStatus;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instantiate board squares
		GoSquare go = new GoSquare("Go", 1);
		MiningSetUp ms1 = new MiningSetUp("Standard PC", 2, 60, null, 50, 0, false, 2, Field.LOCAL_MACHINE);
		MiningSetUp ms2 = new MiningSetUp("High End Gaming PC", 3, 60, null, 50, 0, false, 2, Field.LOCAL_MACHINE);
		MiningSetUp ms3 = new MiningSetUp("Low End GPU", 4, 140, null, 100, 0, false, 10, Field.DEDICATED_MACHINE);
		MiningSetUp ms4 = new MiningSetUp("High End GPU", 5, 140, null, 100, 0, false, 10, Field.DEDICATED_MACHINE);
		MiningSetUp ms5 = new MiningSetUp("Dual GPU", 6, 160, null, 100, 0, false, 12, Field.DEDICATED_MACHINE);
		Standby sb = new Standby("StandBy", 7);
		MiningSetUp ms6 = new MiningSetUp("DIY Rig", 8, 260, null, 150, 0, false, 22, Field.HOME_MINING_RIG);
		MiningSetUp ms7 = new MiningSetUp("Compact Rig", 9, 260, null, 150, 0, false, 22, Field.HOME_MINING_RIG);
		MiningSetUp ms8 = new MiningSetUp("Custom Rig", 10, 280, null, 150, 0, false, 22, Field.HOME_MINING_RIG);
		MiningSetUp ms9 = new MiningSetUp("Dedicated Mining Centre", 11, 350, null, 200, 0, false, 35, Field.LARGESCALE_INDUSTRIAL);
		MiningSetUp ms10 = new MiningSetUp("Climate Controlled Mining Centre", 12, 400, null, 200, 0, false, 50, Field.LARGESCALE_INDUSTRIAL);
		
		// create board
		ArrayList<Square> board = new ArrayList<Square>();
		Collections.addAll(board, go, ms1, ms2, ms3, ms4, ms5, sb, ms6, ms7, ms8, ms9, ms10);
		
		// create array list of squares potentially available to buy
		ArrayList <MiningSetUp> setups = new ArrayList<MiningSetUp>();
		Collections.addAll(setups, ms1, ms2, ms3, ms4, ms5, ms6, ms7, ms8, ms9, ms10);
		
		// create an array list of players
		ArrayList<Player> players= new ArrayList<Player>();	
		
		Scanner scanner = new Scanner(System.in);
		
		// game kick off
		GameSystem game = new GameSystem();
		game.enterNumberOfPlayers(scanner);
		game.populatePlayerArray(players);
		game.enterPlayerNames(players, scanner);
		game.orderOfPlay(players);
		game.beginPlay(players);
		
		do {
			game.chooseOption(players, board, setups, scanner);
		
		} while(game.isGameStatus());
		
		scanner.close();

	}
	
	/**
	 * Method to enter the number of players
	 * @param noOfPlayersScan
	 */
	public void enterNumberOfPlayers(Scanner noOfPlayersScan) {
		
		int totalPlayers = 0;		
		
		while(!validateNumberOfPlayers()) {
			try{
				System.out.println("How many players are there?");
				totalPlayers = noOfPlayersScan.nextInt();
				setNumberOfPlayers(totalPlayers);
			
			}catch (InputMismatchException mismatchEx) {
				System.out.println("Not a number. Enter a number from " + MIN_NUMBER_OF_PLAYERS + " to " + MAX_NUMBER_PLAYERS + ".");
				noOfPlayersScan.nextLine();
			}
		}		
	}
	
	/**
	 * Method to validate the number of players
	 * @return
	 */
	public boolean validateNumberOfPlayers() {
		
		boolean isValidNumber = false;
		
		if(getNumberOfPlayers() >= MIN_NUMBER_OF_PLAYERS && getNumberOfPlayers() <= MAX_NUMBER_PLAYERS) {
			isValidNumber = true;
		} 
		
		return isValidNumber;
	}
	
	/**
	 * Method to populate the player array
	 * @param players
	 */
	public void populatePlayerArray(ArrayList<Player> players) {
		
		for (int loop = 0; loop < getNumberOfPlayers(); loop++) {
			players.add(new Player());
			players.get(loop).setPlayerID(loop+1);
		}	
	}
	
	
	/**
	 * Method to enter player names. 
	 * Does not allow for duplicate names to be entered.
	 * @param players
	 * @param playerNameScan
	 * @return
	 */
	public void enterPlayerNames(ArrayList<Player> players, Scanner in) {
    	Set<String> playerNames = new LinkedHashSet<>();
        
        for(int loop = 0; loop<players.size();loop++) {
            String messagePrompt = "Enter a name for Player "+players.get(loop).getPlayerID()+":";
            String userInput = getUserInput(in, messagePrompt);
            
            while(!playerNames.add(userInput.toLowerCase())) {
            	System.out.println("Duplicate name entered. Please try again.");
            	userInput = getUserInput(in, messagePrompt);
            }
            
            players.get(loop).setPlayerName(userInput);
           
        }
                
	}
	
	/**
	 * Method prompt. String prompt can be seen in enterPlayerNames method
	 * and this method then returns the userInput.
	 * @param scanner
	 * @param prompt
	 * @return
	 */
    public static String getUserInput(Scanner scanner, String prompt) {
    	System.out.println(prompt);
    	return scanner.next();
    }
	
	/**
	 * randomises order of play of players.
	 * @param players
	 */
	public void orderOfPlay(ArrayList<Player> players) {
        Collections.shuffle(players);
        
        System.out.println("Order of play : ");

        for (Player player : players) {
            System.out.println(player.getPlayerName());
        }
        
        int newPlayerID = 1;
        for (int loop = 0; loop < players.size(); loop++) {
        	players.get(loop).setPlayerID(newPlayerID);
        	newPlayerID++;
        }
	}
	
	
	/**
	 * Method to setup for beginning of play
	 * @param players
	 */
	public void beginPlay(ArrayList<Player> players) {
		
		// set game status to true to begin game
		setGameStatus(true);
		
		// set current turn to first player in shuffled array
		setCurrentTurn(players.get(0));
		
		System.out.println("Ready to go, let's play Technopoly!");
		
	}
	
	/**
	 * Method to show menu and prompt for current player to choose an option.
	 * @param players
	 * @param board
	 * @param setUps
	 * @param menuScan
	 */
	public void chooseOption(ArrayList<Player> players, ArrayList<Square> board, ArrayList <MiningSetUp> setUps, Scanner menuScan) {

		int playerMenuOption = 0;
		
		while (!validateChooseOption(playerMenuOption, players, board, setUps, menuScan)) {
			try {
				// Show menu when player taking their turn
				System.out.println(getCurrentTurn().getPlayerName() + ", it's your turn.");
				System.out.println("Please select an option below:");
				System.out.println("1. Roll Dice");
				System.out.println("2. Manage Mining Setup");
				System.out.println("3. End Game");
			
				playerMenuOption = menuScan.nextInt();	
		
			} catch(InputMismatchException mismatchEx) {
				System.out.println("Sorry, not a valid option.");
				menuScan.nextLine();
			}
		}	
	}
	
	
	/**
	 * Method to validate the player's turn selection.
	 * @param playerMenuOption
	 * @param players
	 * @param board
	 * @param setUps
	 * @param menuScan
	 * @return
	 */
	public boolean validateChooseOption (int playerMenuOption, ArrayList<Player> players, ArrayList<Square> board, ArrayList <MiningSetUp> setUps, Scanner menuScan) {
		
		boolean isValidOption;

		switch (playerMenuOption) {
		case 1: 
			changeLocation(players, board, menuScan);
			isValidOption = true;
			break;		
		case 2:
			manageOption(getCurrentTurn(), setUps, players, menuScan);
			isValidOption = true;
			break;
		case 3:
			endGame(players);
			setGameStatus(false);
			isValidOption = true;
			break;
		default:
			isValidOption = false;
		}
		
		return isValidOption;
	}

	
	/**
	 * Method for when player chooses option to roll dice.
	 * @param players
	 * @param squares
	 * @param YNScan
	 */
	public void changeLocation(ArrayList<Player> players, ArrayList<Square> squares, Scanner YNScan) {
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int firstRoll = dice1.rollDice(); 
		int secondRoll = dice2.rollDice();
		
		int currentRoll = firstRoll + secondRoll;
		System.out.println("Dice 1, you've rolled a " + firstRoll);
		System.out.println("Dice 2, you've rolled a " + secondRoll);
		
		// move player and check if go passed
		GoSquare goPassed;
		if (currentTurn.movePlayer(squares, currentRoll)) {
			goPassed = (GoSquare) squares.get(0);
			goPassed.passGo(currentTurn);
		} 
		
		// land on a square
		Square currentSquare = squares.get(currentTurn.getLocation());
		MiningSetUp currentMiningSetUp;
		
		switch (currentSquare.landOnSquare(currentTurn)) {
		case 0:
			
			requestToBuy(players, squares, YNScan);
			break;
			
		case 1:
			
			currentMiningSetUp = (MiningSetUp) squares.get(currentTurn.getLocation());
					
			// to determine if payment causes bankruptcy
			if (currentTurn.payPlayer(currentMiningSetUp, currentMiningSetUp.getOwner())) {
				endTurn(players);
			} else {
				endGame(players);
				setGameStatus(false);
			}
			break;
					
		case 2:				
		case 3: 
			
			endTurn(players);
			break;
		default:
			System.out.println("An error has occured with this square.");
		}	
	}
	
	/**
	 * Method for when player is given the choice to buy a mining setup.
	 * @param players
	 * @param squares
	 * @param YNScan
	 */
	public void requestToBuy(ArrayList<Player> players, ArrayList<Square> squares, Scanner YNScan) {
		
		String playerBuyOption = "0";
		
		while(!validateRequestToBuy(playerBuyOption, players, squares)) {
			playerBuyOption = YNScan.next();
			
		}
		
	}
	
	/**
	 * Method to validate player's response to the requestToBuy method.
	 * @param playerBuyOption
	 * @param players
	 * @param squares
	 * @return
	 */
	public boolean validateRequestToBuy(String playerBuyOption, ArrayList<Player> players, ArrayList<Square> squares) {
		
		MiningSetUp currentMiningSetUp;
		boolean isValidOption;
		
			if (playerBuyOption.equalsIgnoreCase("Y")) {
				
				currentMiningSetUp = (MiningSetUp) squares.get(currentTurn.getLocation());
				currentMiningSetUp.buyMiningSetup(currentTurn);
				endTurn(players);
				isValidOption = true;
	
			} else if (playerBuyOption.equalsIgnoreCase("N")){
				endTurn(players);
				isValidOption = true;
						
			} else {
				System.out.println("Please enter Y (yes) or N (no):");
				System.out.println("Would you like to purchase this Mining Setup?");
				isValidOption = false;
			}
					
			return isValidOption;
		
		
	}
	
	
	/**
	 * Method to manage owned mining setups.
	 * @param player
	 * @param setups
	 * @param players
	 * @param manageScan
	 */
	public void manageOption(Player player, ArrayList<MiningSetUp> setups, ArrayList<Player> players, Scanner manageScan) {
		
		int manageChoice = 0;
		
		ArrayList <MiningSetUp> owned = new ArrayList<MiningSetUp>();
		// set up array list of mining setups owned by player
		for (int loop = 0; loop < setups.size(); loop++) {
			if (setups.get(loop).getOwner() == player) {
				owned.add(setups.get(loop));
			}
		}
		
		// determine if any mining setups are owned
		if (owned.size() == 0) {
			System.out.println("Sorry, no setups owned yet.");
			System.out.println("Your balance: " + player.getBalance());
		
		} else {
			
			while(!validateManageOption(manageChoice, player, setups, players, owned))
				try {
					System.out.println("Choose a sqaure to develop.");
					System.out.println(player.getPlayerName() + ", you own:");
					System.out.printf("%-2s %-35s %-25s %-15s %-15s %-10s %-10s" ,"Id" ,"Setup Name" ,"Field" ,"Upgrade Cost" ,"Upgrade Level" ,"At Max?" ,"Rent Price");
					System.out.println();
			
					// print player owned mining setups
					for (int loop = 0; loop < owned.size(); loop++) {
						owned.get(loop).displayDetails();
					}
					
					System.out.printf("%-3s %-35s" ,"13" , "Cancel");
					System.out.println();
					System.out.println("Your balance: " + player.getBalance());
			
					manageChoice = manageScan.nextInt();
				
				} catch (InputMismatchException mismatchEx) {
					manageScan.nextLine();
				}
		}
		
	}
	
	
	/**
	 * Method to validate management option chosen.
	 * @param manageChoice
	 * @param player
	 * @param setups
	 * @param players
	 * @param owned
	 */
	public boolean validateManageOption(int manageChoice, Player player, ArrayList<MiningSetUp> setups, ArrayList<Player> players, ArrayList<MiningSetUp> owned) {
		
		MiningSetUp managing = null;
		int fieldCount = 0;
		boolean isValidOption;
		ArrayList<Integer> ownedIds = new ArrayList<Integer>();
		
		for(MiningSetUp ms : owned) {
			ownedIds.add(ms.getSquareID());
		}
						
		if (manageChoice == 13) {
			isValidOption = true;
			return isValidOption;
		
		} else if (!ownedIds.contains(manageChoice) ) {
			isValidOption = false;
		
		} else {
			
		// assign choice to variable
		for (int loop = 0; loop < owned.size(); loop++) {
			if (owned.get(loop).getSquareID() == manageChoice) {
				managing = owned.get(loop);
			} 
		}
			
		// check how many of same field are owned
		for (int loop = 0; loop < owned.size(); loop++) {
			if (owned.get(loop).getField() == managing.getField()) {
				fieldCount++;
			}
		}
			
		// ensure whole field is owned
		if (fieldCount == fieldSize(setups, managing.getField())) {
			managing.megaWattUpgrade(player);
		} else {
			System.out.println("Sorry, you must own the entire field before you can develop a mining setup in it.");
		}
			isValidOption = true;
		}	
		return isValidOption;
		
	}
	
	
	/**
	 * Method to check the field size of a particular field
	 * @param setups - array list of all mining setups
	 * @param checkSetup - square of field type to be counted
	 */
	public static int fieldSize(ArrayList<MiningSetUp> setups, Field field) {
		
		int fieldCount = 0;
		
		// count total setups that make up the complete field
		for (int loop = 0; loop < setups.size(); loop++) {
			if (setups.get(loop).getField() == field) {
				fieldCount++;
			}
		}
		
		return fieldCount;
		
	}
	
	
	/**
	 * Method to end the game. Final balances will be calculated and winner determined based on highest balance.
	 * @param players - an array list of players playing the current game
	 */
    public static void endGame(ArrayList<Player> players) {
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Game Over! The final Game Coin of each player is :");

        // print out end balances for each player
        for (int loop = 0; loop < players.size(); loop++) {
            System.out.println(players.get(loop).getPlayerName() + " : " + players.get(loop).getBalance() + " gameCoin");
        }

        // find winning amount
        double winningAmount = players.get(0).getBalance();
        
        for (int loop = 0; loop < players.size(); loop++) {
            if(players.get(loop).getBalance() > winningAmount) {
                winningAmount = players.get(loop).getBalance();
            }
        }
        
        // print out player(s) with the winning amount
        System.out.println("Winner(s):");
        
        for (int loop = 0; loop < players.size(); loop++) {
			if (players.get(loop).getBalance() == winningAmount) {
				System.out.println(players.get(loop).getPlayerName() + " with: " + players.get(loop).getBalance());
			}
		}
        
    }
	
	
	/**
	 * Method to end a player's turn and move play on to the next player
	 * @param players - array list of players playing the current game
	 */
	public void endTurn(ArrayList<Player> players) {
		
		// get next id
		int newTurn = getCurrentTurn().getPlayerID() +1;
		
		// ensure next id is within the range of players
		if (newTurn > players.size()) {
			newTurn -= (players.size()+1);
			setCurrentTurn(players.get(newTurn));
		} else {
		
		// set currentTurn to player with next id from array
		setCurrentTurn(players.get(newTurn-1));
		
		}

	}

}