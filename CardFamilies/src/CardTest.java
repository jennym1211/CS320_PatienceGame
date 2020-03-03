package CardFamilies.src;
import CardFamilies.src.decks.*;
import CardFamilies.src.cards.*;
public class CardTest {
public static void main(String[] args) throws Exception {
    DeckFactory deckFactory = new DeckFactory();


    Deck unoDeck = deckFactory.getDeck("UnoDeck");
    Deck pokerDeck = deckFactory.getDeck("PokerDeck");

    unoDeck.toString();
    pokerDeck.toString();
}
}