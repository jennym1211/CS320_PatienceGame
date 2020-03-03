package CardFamilies.src.cards;
import java.awt.Image;

public class UnoCard extends Card {

	private String name;
	private int rank;
	private String suit;


	

	public UnoCard(int newRank,String newSuit) {
		super(newRank,newSuit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if (rank == 10)
		name = "Skip";
	else if (rank == 11)
		name = "Reverse";
	else if (rank == 12)
		name = "Draw 2";
	else if (rank == 13)
		name = "Wild";
	else if (rank==14)
	{
		name ="Wild Draw 4";
	}
	else
		name = String.valueOf(rank);
	return " ||" + name + " of " + suit;
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


}
