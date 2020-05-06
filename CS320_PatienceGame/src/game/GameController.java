package game;

import java.util.Scanner;

import views.TableauxView;


/**
 *  The GameController encompasses the functions that will enable game play.
 * @author Jennifer
 *
 */
public class GameController {
	Scanner scan = new Scanner(System.in);
	private boolean isWon = false;
	protected Table table = new Table();
	
	/**
	 * Calls the initalize method.
	 */
	public GameController()
	{
		initalize();
	}

	/**
	 *  The controller is initalized by the table object utilizing the create game method.
	 */
	public void initalize() {
		table.CreateGame();

	}

	/**
	 *  Returns the table object. 
	 * @return - The table object
	 */
	public Table getTable() {
		return table;
	}

	/**
	 *  Creates a new game by calling table.reset().
	 */
	public void reset() {
		
		
		table.reset();

	}

	/**
	 *  The play that allows the player to play by input (at least within this prototype.)
	 */
	public void play() {
		
		System.out.println("Current table: " +  table.toString());

		System.out.println("Welcome to console based patience!");
		String tableauInput;
		String foundationInput;

		System.out.println(
				"Type an number corresponding to the column you wish to select for moving, or press D to deal from the stock pile, or W to select the card to move to the foundation pile.");

		System.out.println("Column 1" +  getTable().getTableaux().get(0).get(0));
		System.out.println("Column 2" +  getTable().getTableaux().get(1).get(0));
		System.out.println("Column 3" +  getTable().getTableaux().get(2).get(0));
		System.out.println("Column 4" +  getTable().getTableaux().get(3).get(0));
		System.out.println("Column 5" +  getTable().getTableaux().get(4).get(0));
		System.out.println("Column 6" +  getTable().getTableaux().get(5).get(0));
		System.out.println("Column 7" +  getTable().getTableaux().get(6).get(0));
		tableauInput = scan.next();

		

		if (tableauInput == "1") {

			
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(0),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(0),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(0),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(0),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "2") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(1),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(1),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(1),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(1),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "3") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(2),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(2),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(2),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(2),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "4") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(3),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(3),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(3),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(3),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "5") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(4),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(4),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(4),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(4),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "6") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(5),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(5),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(5),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(5),  getTable().getFoundations().get(3));
			}

		}

		if (tableauInput == "7") {
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(3));
			}

		}
		
		if(tableauInput.equalsIgnoreCase("D"))
		{
			System.out.println("Dealing a card to the waste pile...");
			
			if( getTable().getWastePile().size() == 1)
			{
				 getTable().getStockPile().add( getTable().getStockPile().size(),  getTable().getWastePile().get(0));
				 getTable().getWastePile().remove();
				 getTable().getWastePile().add( getTable().getStockPile().get(0));
				
				
			}
			else
			
				for(int i = 0; i >  getTable().getStockPile().size(); i++)
				{
				 getTable().getWastePile().add( getTable().getStockPile().get(0));
				}
			
		
			
		}
		
		if(tableauInput.equalsIgnoreCase("W"))
		{
			
			System.out.println("Type an number corresponding to the foundation you wish to select for moving.");

			foundationInput = scan.next();
			if (foundationInput == "1") {
				 table.move( getTable().getWastePile(),  getTable().getFoundations().get(0));
			}
			if (foundationInput == "2") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(1));
			}
			if (foundationInput == "3") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(2));
			}
			if (foundationInput == "4") {
				 table.move( getTable().getTableaux().get(6),  getTable().getFoundations().get(3));
			}
		}

	}

	/**
	 * Checks to see if the game has been won, which is done by checking to see if
	 * the tableaux and stock pile is empty (Which means the foundations are full.)
	 * 
	 * @return - the boolean isWon
	 */

	public boolean GameWon()
	{
		for (int i = 0; i < 8; i++)
		{
			if(!table.getTableaux().isEmpty() && !table.getStockPile().isEmpty())
				isWon = false;
			
			else
			{
				System.out.println("You have won!");
				isWon = true;
			}
		}
		return isWon;
	}



	

}
