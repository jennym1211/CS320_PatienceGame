package piles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import cards.*;

/**
 * The pile class is an abstract class that, Foundations, and Tableau,
 * StockPile, and WastePile will inherit from.
 * 
 * 
 * A pile can also be considered a deck, since a deck is a collection, or pile,
 * of cards. However, this abstract class is created so that it cannot utilize
 * methods like the dealmethod, shuffle, etc, that should soley be attached to
 * the deck.
 * 
 * Since the tableau will inherit the deck, and eventually the foundation will
 * as well as the player progresses in the game, they are considered decks/or
 * piles in their own regard.
 * 
 * 
 * 
 * @author Jennifer Mackey
 */
public abstract class Pile implements IPile, IGamePile, Iterable<Card> {

	protected ArrayList<Card> pile = new ArrayList<Card>(); // An arraylist of cards.
	private boolean isEmpty; // check if empty
	protected Card top; // Top of pile

	/**
	 * Default constructor.
	 */
	public Pile() {
		pile = new ArrayList<Card>();
	}

	/**
	 * Removes the top card of the pile.
	 */
	public void remove() {
		if (!this.isEmpty()) {
			pile.remove(pile.size() - 1);
			if (!this.isEmpty())
				top = pile.get(pile.size() - 1);
		}

	}

	public Iterator<Card> iterator() {
		return new Iterator<Card>() {
			private int position;
			private List<Card> items = pile;

			public boolean hasNext() {
				return position != items.size();
			}

			public Card next() {
				try {
					if (!hasNext())
						throw new NoSuchElementException();
				} catch (NoSuchElementException e) {
					System.out.println("NoSuchElementException");
				}
				return items.get(position++);
			}
		};

	}

	/**
	 * 
	 * Determines if a pile is in correct order (by rank and suit.)
	 * 
	 * @param p - the pile in quence
	 * @return - whether true or false.
	 */
	public boolean inOrder(ArrayList<Card> p) {
		for (int i = 0; i < p.size() - 1; i++) {
			Card top = p.get(i);
			Card card = p.get(i + 1);
			if (top.getRank() == card.getRank() + 1) {
				int topCardOrder = top.getSuit().getOrder();
				int cardOrder = card.getSuit().getOrder();
				if (!((((topCardOrder == 1) || (topCardOrder == 4)) && ((cardOrder == 2) || (cardOrder == 3)))
						|| (((topCardOrder == 2) || (topCardOrder == 3)) && ((cardOrder == 1) || (cardOrder == 4))))) {
					return false;
				}
			} else
				return false;
		}
		return true;

	}

	/**
	 * 
	 */
	public ArrayList<Card> getPile() {
		return pile;
	}

	/**
	 * 
	 * Adds the card to the arraylist.
	 * 
	 * @param c - card added
	 *
	 */
	public void add(Card c) {
		pile.add(c);
	}

	/**
	 * Adds a card at a certain index.
	 * 
	 * @param i - the index of the pile.
	 * @param c - the card at that index.
	 */
	public void addIndex(int i, Card c) {
		pile.add(i, c);
	}

	/**
	 * Gets a card at a certain index.
	 * 
	 * @param: index - the index of the pile.
	 * @return: Returns the card that indicated index.
	 */
	public Card get(int index) {
		Card c = pile.get(index);
		return c;
	}

	/**
	 * Checks to see if the pile is empty.
	 * 
	 * @return true/false if the pile is empty.
	 */
	public boolean isEmpty() {
		isEmpty = pile.isEmpty();
		return isEmpty;
	}

	/**
	 * Returns the size of the pile.
	 * 
	 * @return - the size as an integer.
	 */
	public int size() {
		int size = pile.size();
		return size;
	}

	/**
	 * Game logic that allows movement is addable returns true.
	 */
	public boolean canAdd(Pile pile) {
		if (this.addable(pile)) {
			this.add(pile.get(0));
			pile.remove();
			return true;
		}
		return false;
	}

	/**
	 * Returns a pile in String format.
	 */
	public String toString() {
		String cards = "";
		if (!this.isEmpty()) {
			for (Card c : pile) {
				cards += c.toString() + "\t";
			}
		}
		return cards;
	}

}
