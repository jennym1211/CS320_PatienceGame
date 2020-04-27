package piles;

import java.util.ArrayList;

import cards.Card;

public class Foundation implements IPile {

	
	
	private ArrayList<Card> pile = new ArrayList<Card>(); 
	private boolean isEmpty;
	private Card top;
	
	public Foundation(String newSuit)
	{
		
	}
	

	public void add(int index, Card c)
	{
		pile.add(c);
	}
	public Card get(int index)
	{
		Card c = pile.get(index);
		return c;
	}
	public boolean isEmpty()
	{
		isEmpty = pile.isEmpty();
		return isEmpty;
	}
	public int size()
	{
		int size = pile.size();
		return size;
	}
	
	
	
	
}
