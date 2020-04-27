package piles;
import cards.*;


public interface IPile {

public void add(int index, Card c);
public Card get(int index);
public boolean isEmpty();
public int size();
	
}
