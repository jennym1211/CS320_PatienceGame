package decks;

import java.util.ArrayList;
import java.util.Collections;

import cards.*;

public abstract class Deck {
protected ArrayList<Card> deck;

	public Deck()
	{
		deck = new ArrayList<Card>();
		
	}

    public abstract ArrayList<Card> createTabledeck();
	
	public void add(Card c)

	{
		deck.add(c);
	}

	
	public Card getCard()

	{

		return deck.remove(0);

	}

	
	public void shuffle()
	{

		Collections.shuffle(deck);

	}

	
	public int size()

	{

		return deck.size();
	}

	
	
	
	
}