package piles;

import java.util.ArrayList;

import cards.Card;

/**
 * The WastePile is the pile that the stock pile will deal to within the game of
 * patience that the player will be able to play when they cannot play any card
 * on the tableaux.
 * 
 * 
 * @author Jennifer
 *
 */
public class WastePile extends Pile {

	protected ArrayList<Card> wastePile = new ArrayList<Card>();

	public WastePile() {
		super();
		wastePile = new ArrayList<Card>();

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
