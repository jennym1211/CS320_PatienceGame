package piles;

import java.util.ArrayList;

import cards.Card;

/**
 * 
 * The foundation is the end goal for the cards for the player to be able to win
 * the game. If the active card is an ace, move it to its foundation with the
 * same suit. Each foundation builds upward, in a sequence, starting with that
 * Ace card.
 * 
 *
 * 
 * @author Jennifer Mackey
 *
 */
public class Foundation extends Pile implements IGamePile {

	private ArrayList<Card> pile = new ArrayList<Card>();
	private boolean isEmpty;
	private Card top;

	public Foundation() {
		super();
		super.pile = pile;

	}

	/**
	 * 
	 * Overridden method that specifies rule of when the card is allowed to be moved
	 * or not, specifically here, within a foundation.
	 * 
	 * For a foundation, only the next value up with the same suit can be added on
	 * top of the other card.
	 * 
	 * Only aces shall be moved to an empty foundation.
	 * 
	 * Only the active card that is of higher value and of the same suit shall be
	 * added to the foundation in ascending numerical order, all the way up to King,
	 * the highest value.
	 * 
	 * A card cannot be removed from a foundation once it is placed.
	 * 
	 * 
	 * @param pile - pile that the card will be removed from.
	 * @return - true/false if card was added
	 */

	@Override
	public boolean addable(Pile p) {
		Card card = pile.get(0);
		Card top = this.get(0);
		if (this.isEmpty() && (card.getRank() == 1)) {
			System.out.println("Move completed.");
			return true;
		} else if (!this.isEmpty()
				&& (card.getSuit().getOrder() == top.getSuit().getOrder() && (card.getRank() == top.getRank() + 1))) {
			System.out.println("Move completed.");
			return true;
		} else {
			System.out.println("Move not allowed.");
			return false;
		}

	}

	/**
	 * Since cards cannot be removed once they're on the foundation, this will
	 * always return false.
	 */
	@Override
	public void remove() {
		System.out.println("Cannot remove card from foundation!");
		return;
	}

}
