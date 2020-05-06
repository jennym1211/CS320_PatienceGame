package cards;
import java.awt.Image;

/**
 * Interface that represents the methods a card will need to inherit.
 * @author Jennifer
 *
 */
public interface CardInterface {
	
	public boolean isVisible();
	public Suit getSuit();
	public int getRank();
	public String toString();
	public int getValue();
}
