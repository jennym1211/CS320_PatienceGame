package piles;
import java.util.ArrayList;
import java.util.Collections;
import cards.*;
public abstract class RemoveablePile implements IPile {
	
	private ArrayList<Card> pile = new ArrayList<Card>(); 
	private boolean isEmpty;
	private Card top;
	
	public RemoveablePile()
	{
		//add something here
	}
	
	public void remove()
	{
		if (!this.isEmpty())
		{
			pile.remove(pile.size() - 1);
			if (!this.isEmpty())
				top = pile.get(pile.size() - 1);
		}

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
