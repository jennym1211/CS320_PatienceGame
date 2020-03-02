package CardFamilies.src;

import java.util.ArrayList;
import java.util.Collections;

import CardFamilies.src.cards.*;

public abstract class Deck {
private ArrayList<Card> deck;

	
	public Deck()

	{

		
	}

	

    public abstract ArrayList<PokerCard> createTabledeck();
	
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

	
	public String toString()
	{
		/*
		 * Uses stringbuilder to format the arraylist of the deck more neatly.
		 */
		StringBuilder sb = new StringBuilder("\n");

		for (int i = 0; i < 26; i++)
		{

			sb.append(deck.get(i)).append(" ");
			if (i % 6 == 0)
			{

				sb.append(deck.get(i)).append("\n");
			}
		}

		return sb.toString();

    }
}