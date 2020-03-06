package cards;

public class PokerCard extends Card {

	private String name;
	
	
	public PokerCard(int newRank,String newSuit) {
		super(newRank,newSuit);
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
