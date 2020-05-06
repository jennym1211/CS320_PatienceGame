package piles;

import java.util.ArrayList;

import cards.*;

/**
 *  An interface that will indicate the methods that will encompass a pile data type.
 * @author Jennifer Mackey
 *
 */
public interface IPile {

	public void add(Card c);

	public Card get(int index);

	public boolean isEmpty();

	public int size();

	public ArrayList<Card> getPile();

}
