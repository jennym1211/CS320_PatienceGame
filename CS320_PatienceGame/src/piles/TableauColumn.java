package piles;

import java.util.ArrayList;

import cards.Card;

/**
 * 
 * @author Jennifer Mackey
 * 
 *         The tableau is holder for the column of cards that encompass the tableaux. There are seven
 *         tableau columns within this tableaux.
 *
 */

public class TableauColumn extends Pile {

	protected ArrayList<Card> tableau;

	public TableauColumn() {
		super();
		tableau = new ArrayList<Card>();
		super.pile = tableau;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Pile#addablePile)
	 */
	@Override
	public boolean addable(Pile p) {
		if (p.getPile().size() == 0) {
			System.out.println("No cards!");
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		String cards = "";
		if (!this.isEmpty()) {
			
				for (Card c : pile) {
				
					cards += c.toString() + "\t";
				}
			
		}
		return cards;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see Pile#canAdd(Pile)
	 */
	@Override
	public boolean canAdd(Pile p) {
		if (this.addable(p))
		{
			for (Card x : tableau)
			{
				pile.remove(0);
				this.add(x);
			}
			return true;
		}
		return false;
	}

	

	public int indexOf(int i) {
		// TODO Auto-generated method stub
		return tableau.indexOf(i);
	}

}
