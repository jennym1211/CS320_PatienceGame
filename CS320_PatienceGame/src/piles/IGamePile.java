package piles;
import cards.*;
import java.util.Collections;
public interface IGamePile {
	
	public void move(IPile source, IPile dest);
	public boolean addable(Card c);

}
