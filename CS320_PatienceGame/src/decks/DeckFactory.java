package decks;

public class DeckFactory {

	public Deck getDeck(String deckType) {
		if (deckType == null) {
			return null;
		}
		// if(deckType.equalsIgnoreCase("AuthorsDeck")){
		// return new AuthorDeck();}

		if (deckType.equalsIgnoreCase("PokerDeck")) {
			return new PokerDeck();

		}

		else
		return null;
	}

}