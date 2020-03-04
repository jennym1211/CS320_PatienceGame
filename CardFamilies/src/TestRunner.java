
import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;
import decks.*;
import cards.*;
import cards.UnoCard;
import decks.DeckFactory;		

public class TestRunner {		
	
	DeckFactory deckFactory = new DeckFactory();
	Deck pokerDeck = deckFactory.getDeck("PokerDeck");
	 
	//pokerDeck.toString();
	
			public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CardTest.class);					
			for (Failure failure : result.getFailures()) {							
         System.out.println(failure.toString());
         
      }		

   }		
}   