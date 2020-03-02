package CardFamilies.src.cards;
import java.awt.Image;

public interface CardInterface {
	
	public boolean isVisible();
	public String getSuit();
	public int getRank();
	public String toString();
	public Image getBackImage();
	public Image getFrontImage();
	public boolean isWild();
	public boolean equals(Card c);
	public int compareTo(Card c);
}
