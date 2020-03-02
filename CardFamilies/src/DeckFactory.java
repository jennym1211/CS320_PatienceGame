
package CardFamilies.src;
import java.awt.Image;
import CardFamilies.src.*;

public class DeckFactory {

 public Deck getDeck(String deckType){
    if(deckType == null){
       return null;
    }		
    if(deckType.equalsIgnoreCase("AuthorsDeck")){
       return new AuthorsDeck();
       
    } else if(deckType.equalsIgnoreCase("PokerDeck")){
       return new PokerDeck();
       
    } else if(deckType.equalsIgnoreCase("TarotDeck")){
       return new TarotDeck();
    }
    else if(deckType.equalsIgnoreCase("UnoDeck")){
        return new UnoDeck();
     }

    
    return null;
 }
}