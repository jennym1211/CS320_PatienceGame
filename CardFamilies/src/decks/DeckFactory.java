package decks;

public class DeckFactory {


   

 public Deck getDeck(String deckType){
    if(deckType == null){
       return null;
    }		
 // if(deckType.equalsIgnoreCase("AuthorsDeck")){
   //    return new AuthorDeck();}
       
     else if(deckType.equalsIgnoreCase("PokerDeck")){
       return new PokerDeck();
       
    }
    else if(deckType.equalsIgnoreCase("UnoDeck")){
       return new UnoDeck();
     }
    return null;
 }
 
 
 
}