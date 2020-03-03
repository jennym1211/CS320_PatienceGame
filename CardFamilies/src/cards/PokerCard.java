package CardFamilies.src.cards;
import java.awt.Image;

public class PokerCard extends Card {

	private String name;
	private int rank;
	private String suit;
	
	public PokerCard(int newRank,String newSuit) {
		super(newRank,newSuit);
	}

	@Override
	public Image getBackImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getFrontImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		if (rank == 11)
			name = "Jack";
		else if (rank == 12)
			name = "Queen";
		else if (rank == 13)
			name = "King";
		else if (rank == 14)
			name = "Ace";
		else
			name = String.valueOf(rank);
		return " ||" + name + " of " + suit;
	}

}
