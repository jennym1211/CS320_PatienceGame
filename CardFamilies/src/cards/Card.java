package cards;

public abstract class Card implements CardInterface {
	
	private boolean visiblity;
	private String suit;
	private int rank;
	private int value;

	public Card(int newRank,String newSuit)
	{
		this.rank = newRank;
		this.suit = newSuit;
		visiblity = true;
	}
	public String getSuit() {return suit;}
	public int getRank() {return rank;}
	public boolean isVisible() {return visiblity;}
	public abstract String getName();
	public int getValue() {return value;}
	protected void setValue(int newValue) { value = newValue;}
	public boolean equals(Card c)
	{if ( suit == c.getSuit() &&
   	      rank == c.getRank()    )                 
   	    return ( true ); 
   	 else		  
   	    return ( false );
	}
	public int compareTo(Card c)
	{
		if (c.rank > this.rank || (c.rank == this.rank)) {
			return -1;
		} else if (this.rank > c.rank
				|| (this.rank == c.rank)) {
			return 1;
		} else {
			return 0;
		}
	}
}
