package cards;


public class PatienceCard extends Card {
	
	private String name;
	private int rank;
	private String suit;
	
	
	public PatienceCard(int newRank, String newSuit) {
		super(newRank, newSuit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
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
