import static org.junit.Assert.assertEquals;
import org.junit.Test;
import decks.*;
import cards.*;
public class CardTest {

    @Test
    public void TestCards() {
    DeckFactory deckFactory = new DeckFactory();

    PokerCard p1 = new PokerCard(1 , "Diamonds");


    assertEquals(1, p1.getRank());

    Deck unoDeck = deckFactory.getDeck("UnoDeck");
    Deck pokerDeck = deckFactory.getDeck("PokerDeck");
    

    unoDeck.toString();
    pokerDeck.toString();

    System.out.println( "This is the uno deck:"+ unoDeck.toString());
}

}