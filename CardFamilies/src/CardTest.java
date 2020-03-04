import static org.junit.Assert.assertEquals;
import org.junit.Test;
import decks.*;
import cards.*;
public class CardTest {
	
	
    DeckFactory deckFactory = new DeckFactory();

	String unoSuit = "Yellow";
    PokerCard p1 = new PokerCard(1 , "Diamonds");
    UnoCard u1 = new UnoCard(0, unoSuit.toString());
    
    
    
    @Test
    public void TestCardRank() {
    assertEquals(1, p1.getRank());
    assertEquals(0, u1.getRank());
  
    }
    @Test
    public void TestCardSuit()
    {
    	 
    	  assertEquals("Diamonds", p1.getSuit());
    	  assertEquals("Yellow", u1.getSuit());
    }
    @Test
    public void GetNameTest()
    {
    	assertEquals("0 of Yellow", u1.toString());
    }
    
    @Test
    public void VisibleTest()
    {
    	assertEquals(true, u1.isVisible());
    }
    
    
    
 

    
}

