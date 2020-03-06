package cards;


public class UnoCard extends Card {

	
	private int rank;

	public UnoCard(int newRank,String newSuit) {
		super(newRank,newSuit);	// TODO Auto-generated constructor stub
		
	}
	
	

	@Override
	public String toString() {
		 String rankName;
			if (rank == 10)
			rankName = "Skip";
		else if (rank == 11)
			rankName = "Reverse";
		else if (rank == 12)
			rankName = "Draw 2";
		else if (rank == 13)
			rankName = "Wild";
		else if (rank==14)
		{
			rankName ="Wild Draw 4";
		}
		else
			rankName = String.valueOf(rank);
			
			return rankName + " of " + suit;

}

	

}
