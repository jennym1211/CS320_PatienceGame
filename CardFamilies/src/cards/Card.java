package cards;

import java.awt.Image;

public abstract class Card implements CardInterface {
	
	private boolean visiblity;
	private Image front;
	private Image back;
	private String suit;
	private int rank;
	private String name;
	protected boolean isWild;
	
	
	public Card(int newRank,String newSuit)
	{
		this.rank = newRank;
		this.suit = newSuit;
		visiblity = true;
		isWild = false;
	}
	public String getSuit() {return suit;}
	public int getRank() {return rank;}
	public boolean isVisible() {return visiblity;}
	protected  void setWild(boolean isWild) {isWild = false;}
	public abstract String toString();
	
	public boolean isWild() {return isWild;}
	public abstract Image getBackImage();
	public abstract Image getFrontImage();
	public boolean equals(Card c)
	{
		if ( suit == c.getSuit() &&
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
