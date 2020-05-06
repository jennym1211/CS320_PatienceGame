package cards;

public class Suit implements Comparable<Suit> {

	public static final Suit SPADES = new Suit(4, "SPADES");
	public static final Suit HEARTS = new Suit(3, "HEARTS");
	public static final Suit DIAMONDS = new Suit(2, "DIAMONDS");
	public static final Suit CLUBS = new Suit(1, "CLUBS");

	private int SuitOrder;
	private String SuitName;

	public Suit(int order, String name)
		{
			SuitName = name;
			SuitOrder = order;
		}

	/**
	 * Compares two Suits using their rank ordering, which is used progamatically to
	 * implement the color order of a card in a tableau, since a only alternating
	 * colors can be placed on top of one another, unless it is being placed in the
	 * foundation.
	 * 
	 * @return 0 if equal, less than 0 if less, greater than 0 if greater
	 */
	public int compareTo(Suit other)
		{
			return SuitOrder - other.SuitOrder;
		}

	/**
	 * Gets the order of the Suits.
	 * 
	 * @return - SuitOrder
	 */
	public int getOrder()
		{
			return SuitOrder;
		}

	/**
	 * Returns the string representation of the Suit.
	 * 
	 * @return the string representation of the Suit.
	 */
	public String toString()
		{
			return SuitName;
		}
	
}
