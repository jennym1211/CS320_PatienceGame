package piles;

import java.util.ArrayList;
import java.util.Collections;
import cards.*;

/**
 * The stock pile represents the remaining cards left after the deck has dealt to the tableau columns.
 * @author Jennifer
 *
 */
public class StockPile extends Pile {


	protected ArrayList<Card> stockPile = new ArrayList<Card>();
	
	public StockPile() {
		super();
		super.pile = pile;
	}


	
	/**
	 * Adds the entire pile (in most games, it's the deck), to the stock pile.
	 * @param pile - the arraylist to be added.
	 */
	public void addAll(ArrayList<Card> pile) {
		Collections.addAll(pile);

	}
	public String toString() {
		String cards = "";
		if (!this.isEmpty()) {
			
			cards = "|| *Back* ||";
			
		}
		else
		{
			System.out.println("Stock pile is empty!");
		}
		return cards;
	}


	@Override
	public boolean addable(Pile p) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean canAdd(Pile p) {
		// TODO Auto-generated method stub
		return false;
	}
}
