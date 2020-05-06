package game;

import piles.*;

import java.util.ArrayList;

import cards.Card;
import cards.PokerCard;
import decks.*;
import piles.Foundation;
import piles.StockPile;
import piles.TableauColumn;
import piles.WastePile;

/**
 * The table is the class that will hold all of the pieces within the game. This
 * includes the foundation stacks, tableaux columns, stock pile, and waste pile.
 * 
 * @author Jennifer
 *
 */
public class Table {

	protected ArrayList<Foundation> foundations = new ArrayList<Foundation>();
	protected ArrayList<TableauColumn> tableaux = new ArrayList<TableauColumn>();
	protected ArrayList<Card> stockPile = new ArrayList<Card>();
	protected PokerDeck deck = new PokerDeck();
	protected WastePile wastePile = new WastePile();

	/**
	 * Utilizes the creation methods to create the table.
	 */
	public void CreateGame() {

		// deck = new PokerDeck();
		deck.shuffle();

		createTableaux();
		createFoundations();
		createWastePile();
		createStockPile(deck);
		System.out.println("deck size" + deck.size());

	}

	/**
	 * Recreates the objects to start a brand new slate for the game.
	 */
	public void reset() {
		CreateGame();
	}

	/**
	 * Returns the stack of foundations.
	 * 
	 * 
	 */
	private void createFoundations() {

		for (int j = 0; j <= 3; j++) {
			foundations.add(new Foundation());
		}

	}

	/**
	 * This method creates and returns the arraylist of tableau columns that are
	 * within the game.
	 * 
	 * 
	 */
	private void createTableaux() {
		System.out.println("Creating tableaux...");
		for (int i = 0; i <= 6; i++) {
			tableaux.add(new TableauColumn());
			Card c = deck.deal();
			c.hide();
			tableaux.get(i).add(c);
		}

		System.out.println("tableaux created.");

	}

	/**
	 * Returns the stock pile by converting the deck into an arraylist of cards, and
	 * adds it to the stock pile, rendering it unable to utlize any of the previous
	 * deck methods.
	 * 
	 * @param deck
	 * 
	 */
	public void createStockPile(PokerDeck deck) {
		stockPile = deck.asArrayList();

	}

	/**
	 * Creates an empty arraylist that will present the wastepile.
	 * 
	 *
	 */
	private void createWastePile() {
		wastePile = new WastePile();
		System.out.println("Waste Pile created.");
	}

	/**
	 * Takes two parameters of piles, and checking their respective addable methods,
	 * if the destination pile returns true, it allows the card to be moved.
	 * 
	 * @param sourcePile
	 * @param destPile
	 * @return - boolean on whether it can be moved or not.
	 */
	public boolean move(Pile sourcePile, Pile destPile) {
		System.out.println(sourcePile.toString());
		System.out.println(destPile.toString());
		return sourcePile.canAdd(destPile);
	}

	/**
	 * Accessor method for the foundation arraylist.
	 * 
	 * @return - returns the foundations
	 */
	public ArrayList<Foundation> getFoundations() {
		return foundations;
	}

	/**
	 * Accessor method for the tableaux arraylist.
	 * 
	 * @return - the arraylist of tableau columns
	 */
	public ArrayList<TableauColumn> getTableaux() {
		return tableaux;
	}

	/**
	 * Accessor method for the stock pile.
	 * 
	 * @return - the stock pile
	 */
	public ArrayList<Card> getStockPile() {

		return stockPile;
	}

	/**
	 * Accessor method for the wastepile.
	 * 
	 * @return - the waste pile
	 */
	public WastePile getWastePile() {

		return wastePile;
	}

	/**
	 * Returns the table as a string format.
	 */
	public String toString() {
		String result = "Foundations:";
		for (int i = 0; i < 4; i++) {
			result += "\t" + getFoundations().toString() + "\t";
		}
		result += "\n Tableaux Board: \n";

		for (TableauColumn t : tableaux) {

			result += "\t Column " + tableaux.indexOf(t) + ": " + t.toString() + "\n";

		}

		result += "\n Stock Pile:";

		result += "\t || *** || \n";

		result += "\n Waste Pile :";

		result += "\t" + getWastePile().toString() + "\n";

		return result;
	}

}
